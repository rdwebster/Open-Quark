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
import org.openquark.cal.internal.machine.g.Node;
import org.openquark.cal.module.Cal.Core.CAL_Exception;
import org.openquark.cal.runtime.CALExecutorException;


/**
 * Implements the primitive function defined in the Exception module:
 * finally :: a -> b -> a;
 *
 * Cancellation will be suspended while the finalizer argument is evaluated to prevent
 * interruption.
 * 
 * @author Richard Webster
 */
public final class NPrimFinally extends NPrimitiveFunc {
    
    public static final QualifiedName name = CAL_Exception.Functions.finally_;
    public static final NPrimFinally instance = new NPrimFinally ();
    
    private NPrimFinally () {/* constructor made private for singleton */ }    

    /** {@inheritDoc} */
    @Override
    public Node doEvaluation(Node[] arguments, Executor executor) throws CALExecutorException {
               
        //arguments[0] == expr :: a
        //arguments[1] == finalizer :: JThrowable -> a
        
        CALExecutorException.ExternalException.TerminatedByClientException terminatedByClientException = null;
        
        try {
            return executor.internalEvaluate(arguments[0]);
        }
        catch (CALExecutorException.ExternalException.TerminatedByClientException e) {
            // If a cancellation exception is thrown, then safe this to be rethrown in the finally block.
            terminatedByClientException = e;
            return null;        // This will be overridden by a throw in the finally block anyway.
        }
        finally {
            
            // Set an flag to override cancellation.
            boolean oldCancelOverride = executor.getCancelOverride();
            executor.setCancelOverride(true);
            
            try {
                // Evaluate the finalizer expression and discard the result.
                executor.internalEvaluate(arguments[1]);
            }
            finally {
                // Reset the flag to override cancellation.
                executor.setCancelOverride(oldCancelOverride);
                
                // If canceling execution, then override any exception thrown from the finalizer execution and 
                // throw the original TerminatedByClientException.
                if (terminatedByClientException != null) {
                    throw terminatedByClientException;
                }
            }
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
