/*
 * Copyright (c) 2007 BUSINESS OBJECTS SOFTWARE LIMITED
 * All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 * 
 *     * Redistributions of source code must retain the above copyright notice,
 *       this list of conditions and the following disclaimer.
 *  
 *     * Redistributions in binary form must reproduce the above copyright
 *       notice, this list of conditions and the following disclaimer in the
 *       documentation and/or other materials provided with the distribution.
 *  
 *     * Neither the name of Business Objects nor the names of its contributors
 *       may be used to endorse or promote products derived from this software
 *       without specific prior written permission.
 *  
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */

package org.openquark.cal.internal.machine.g.functions;

import org.openquark.cal.compiler.QualifiedName;
import org.openquark.cal.internal.machine.g.Executor;
import org.openquark.cal.internal.machine.g.NPrimitiveFunc;
import org.openquark.cal.internal.machine.g.NValObject;
import org.openquark.cal.internal.machine.g.Node;
import org.openquark.cal.internal.module.Cal.Core.CAL_Exception_internal;
import org.openquark.cal.runtime.CALExecutorException;


/**
 * Implements the primitive function defined in the Exception module:
 * primOnException :: a -> (JThrowable -> b) -> a;
 * 
 * When evaluation of the argument expression throws an exception, then the specified
 * handler function will be invoked before rethrowing the exception.
 * 
 * Cancellation will be suspended while the handler function is executed to prevent
 * interruption.
 * 
 * @author Richard Webster
 */
public final class NPrimOnException extends NPrimitiveFunc {
    
    public static final QualifiedName name = CAL_Exception_internal.Functions.primOnException;
    public static final NPrimOnException instance = new NPrimOnException ();
    
    private NPrimOnException () {/* constructor made private for singleton */ }    

    /** {@inheritDoc} */
    @SuppressWarnings("finally")
    @Override
    public Node doEvaluation(Node[] arguments, Executor executor) throws CALExecutorException {
               
        //arguments[0] == expr :: a
        //arguments[1] == handler :: JThrowable -> a
        
        try {
            return executor.internalEvaluate(arguments[0]);
            
        } catch (CALExecutorException.ExternalException.PrimThrowFunctionException primThrowException) {

            //the Exception.throw function was called
            executeHandlerStrict(arguments[1], executor, primThrowException.getCause());
            throw primThrowException;

        } catch (CALExecutorException.ExternalException.ForeignOrPrimitiveFunctionException foreignFunctionException) {

            //an exception occurred while calling a foreign function with an explicit throws clause
            //(or we are in debug mode and foreign function exceptions are caught and wrapped).
            executeHandlerStrict(arguments[1], executor, foreignFunctionException.getCause());
            throw foreignFunctionException;

        } catch (CALExecutorException.ExternalException.PatternMatchFailure patternMatchException) {

            executeHandlerStrict(arguments[1], executor, patternMatchException);
            throw patternMatchException;

        } catch (CALExecutorException.ExternalException.ErrorFunctionException errorException) {

            executeHandlerStrict(arguments[1], executor, errorException);
            throw errorException;
            
        } catch (CALExecutorException.ExternalException.TerminatedByClientException terminatedByClientException) {
            
            try {
                executeHandlerStrict(arguments[1], executor, terminatedByClientException);
            }
            finally {
                // Discard the result of the handler function and always re-throw the cancellation exception.
                throw terminatedByClientException;
            }
        } catch (CALExecutorException calExecutorException) {
            // Do not trigger the handler function for other CALExecutorException, on the assumption that
            // something serious has gone wrong with CAL execution.
            // This is consistent with the primCatch functionality.
            throw calExecutorException;
        
        } catch (RuntimeException runtimeException) {
            
            executeHandlerStrict(arguments[1], executor, runtimeException);
            throw runtimeException;
            
        } catch (Throwable throwable) {

            //most likely an unchecked foreign function exception. Could also be a programming error in CAL's Java implementation.
            //at the moment we have no way to distinguish these 2 cases.
            //todoBI
            //One solution is to wrap all calls to foreign functions so that a CALExecutor.CALForeignFunctionException is thrown,
            //but this is a performance hit.
            executeHandlerStrict(arguments[1], executor, throwable);
            throw new CALExecutorException.ExternalException.PrimThrowFunctionException(name + " called.", throwable);
        }  
    }

    /**
     * A utility function to force evaluation of the handler function with cancellation suspended.
     */
    private static void executeHandlerStrict(Node handler, Executor executor, Throwable throwable) throws CALExecutorException {
        // Set an flag to override cancellation.
        boolean oldCancelOverride = executor.getCancelOverride();
        executor.setCancelOverride(true);
        
        try {
            // Apply the Throwable argument to the function and force evaluation.
            executor.internalEvaluate(handler.apply(new NValObject(throwable)));
        }
        finally {
            // Reset the flag to override cancellation.
            executor.setCancelOverride(oldCancelOverride);
        }
    }
    
    /** {@inheritDoc} */
    @Override
    protected int getArity() {        
        return 2;
    }

    /** {@inheritDoc} */
    @Override
    protected QualifiedName getName() {        
        return name;
    }    
}
