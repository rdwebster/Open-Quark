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

package org.openquark.cal.runtime;

import java.sql.SQLException;
import java.util.concurrent.Callable;

import org.openquark.cal.internal.runtime.lecc.RTValue;

/**
 * An interface which allow cancel listeners to be registered and unregistered.
 */
public abstract class CancelNotifier {

    /** An instance of the CancelNotifier which never fires cancellation events. */
    public static final CancelNotifier NON_FIRING_NOTIFIER = new CancelNotifier() {
        @Override
        public void registerCancelListener(Cleanable listener) {
        }

        @Override
        public void unregisterCancelListener(Cleanable listener) {
        }};
    
    /**
     * Registers a listener for cancellation events.
     */
    public abstract void registerCancelListener(Cleanable listener);
    
    /**
     * Unregisters a listener for cancellation events.
     */
    public abstract void unregisterCancelListener(Cleanable listener);
    
    /**
     * Runs the specified callable while listening for cancellation notifications.
     * @throws Exception 
     */
    public <V> V runCancellable(final Callable<V> callable, final Runnable cleanup) throws Exception {
        
        final boolean[] cancelFlag = new boolean[] {false};
        
        // Listen for CAL cancellation events while executing the SQL.
        // If an cancellation occurs, then invoke the cancel code.
        Cleanable cancelListener = new Cleanable() {
            @Override
            public void cleanup() {
                try {
                    cancelFlag[0] = true;
                    cleanup.run();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        
        registerCancelListener(cancelListener);
        
        try {
            // Run the callable code.
            return callable.call();
        }
        catch (Exception e) {
            if (cancelFlag[0]) {
                throw RTValue.INTERRUPT_EXCEPTION;
            }
            else throw e;
        }
        finally {
            unregisterCancelListener(cancelListener);
        }
    }
}
