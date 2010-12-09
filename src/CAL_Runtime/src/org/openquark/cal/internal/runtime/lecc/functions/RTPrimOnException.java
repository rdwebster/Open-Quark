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


/*
 * RTPrimCatch.java
 * Created: Aug 29, 2006
 * By: Bo Ilic
 */

package org.openquark.cal.internal.runtime.lecc.functions;

import org.openquark.cal.internal.runtime.lecc.LECCMachineConfiguration;
import org.openquark.cal.internal.runtime.lecc.RTExecutionContext;
import org.openquark.cal.internal.runtime.lecc.RTResultFunction;
import org.openquark.cal.internal.runtime.lecc.RTSupercombinator;
import org.openquark.cal.internal.runtime.lecc.RTValue;
import org.openquark.cal.internal.runtime.lecc.RTData.CAL_Opaque;
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
public final class RTPrimOnException extends RTSupercombinator {

    public static final RTPrimOnException $instance = new RTPrimOnException();

    private RTPrimOnException() {
        // Declared private to limit instantiation.
    }

    public static final RTPrimOnException make(RTExecutionContext $ec) {
        return $instance;
    }

    /** {@inheritDoc} */
    @Override
    public final int getArity() {
        return 2;
    }

    @Override
    public final RTValue f(final RTResultFunction rootNode, final RTExecutionContext $ec) throws CALExecutorException {

         // Arguments
        RTValue handler = rootNode.getArgValue();
        RTValue expr = rootNode.prevArg().getArgValue();

        // Release the fields in the root node to open them to garbage collection
        rootNode.clearMembers();

        return f2S(
                RTValue.lastRef(expr, expr = null),
                RTValue.lastRef(handler, handler = null),
                $ec);
    }

    @Override
    public final RTValue f2L(RTValue expr, RTValue handler, RTExecutionContext $ec) throws CALExecutorException {

        return f2S(
                RTValue.lastRef(expr, expr = null),
                RTValue.lastRef(handler, handler = null),
                $ec);
    }

    @SuppressWarnings("finally")
    @Override
    public final RTValue f2S(RTValue expr, RTValue handler, RTExecutionContext $ec) throws CALExecutorException {

        $ec.incrementNMethodCalls();
        if (LECCMachineConfiguration.generateDebugCode() && $ec.isDebugProcessingNeeded(getQualifiedName())) {
            $ec.debugProcessing(getQualifiedName(), new RTValue[] {expr, handler});
        }

        try {
            return expr.evaluate($ec);

        } catch (CALExecutorException.ExternalException.PrimThrowFunctionException primThrowException) {

            //the Exception.throw function was called
            executeHandlerStrict(handler, $ec, primThrowException.getCause());
            throw primThrowException;

        } catch (CALExecutorException.ExternalException.ForeignOrPrimitiveFunctionException foreignFunctionException) {

            //an exception occurred while calling a foreign function with an explicit throws clause
            //(or we are in debug mode and foreign function exceptions are caught and wrapped).
            executeHandlerStrict(handler, $ec, foreignFunctionException.getCause());
            throw foreignFunctionException;

        } catch (CALExecutorException.ExternalException.PatternMatchFailure patternMatchException) {

            executeHandlerStrict(handler, $ec, patternMatchException);
            throw patternMatchException;

        } catch (CALExecutorException.ExternalException.ErrorFunctionException errorException) {

            executeHandlerStrict(handler, $ec, errorException);
            throw errorException;
            
        } catch (CALExecutorException.ExternalException.TerminatedByClientException terminatedByClientException) {
            
            try {
                executeHandlerStrict(handler, $ec, terminatedByClientException);
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
            
            executeHandlerStrict(handler, $ec, runtimeException);
            throw runtimeException;
            
        } catch (Throwable throwable) {

            //most likely an unchecked foreign function exception. Could also be a programming error in CAL's Java implementation.
            //at the moment we have no way to distinguish these 2 cases.
            //todoBI
            //One solution is to wrap all calls to foreign functions so that a CALExecutor.CALForeignFunctionException is thrown,
            //but this is a performance hit.
            executeHandlerStrict(handler, $ec, throwable);
            throw new CALExecutorException.ExternalException.PrimThrowFunctionException($instance.getQualifiedName() + " called.", throwable);
        }
    }

    /**
     * A utility function to force evaluation of the handler function with cancellation suspended.
     */
    private static void executeHandlerStrict(RTValue handler, RTExecutionContext $ec, Throwable throwable) throws CALExecutorException {
        // Set an flag to override cancellation.
        boolean oldCancelOverride = $ec.getCancelOverride();
        $ec.setCancelOverride(true);
        
        try {
            // Apply the Throwable argument to the function and force evaluation.
            handler.apply(CAL_Opaque.make(throwable)).evaluate($ec);
        }
        finally {
            // Reset the flag to override cancellation.
            $ec.setCancelOverride(oldCancelOverride);
        }
    }

    /** {@inheritDoc} */
    @Override
    public String getModuleName() {
        //JUnit tested to equal its binding file value in RuntimeStringConstantsTest.
        return "Cal.Core.Exception";
    }

    /** {@inheritDoc} */
    @Override
    public String getUnqualifiedName() {
        //JUnit tested to equal its binding file value in RuntimeStringConstantsTest.
        return "primOnException";
    }

    /** {@inheritDoc} */
    @Override
    public String getQualifiedName() {
        //JUnit tested to equal its binding file value in RuntimeStringConstantsTest.
        return "Cal.Core.Exception.primOnException";
    }
}