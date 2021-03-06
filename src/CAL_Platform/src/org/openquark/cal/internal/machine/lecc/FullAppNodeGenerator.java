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
package org.openquark.cal.internal.machine.lecc;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * This is a helper class to generate the source code for the RTFullApp.General
 * sub-classes for 1 through 15 arguments.
 * It simply generates the source for the static inner classes of RTFullApp.General
 * and dumps it to the file specified in the arguments to main.
 *
 * @author rcypher
 */
public class FullAppNodeGenerator {

    private final int scArity;
    private final PrintStream ps;

    private FullAppNodeGenerator (int scArity, PrintStream ps) {
        this.scArity = scArity;
        this.ps = ps;
    }

    private final void generateFields () {
        for (int i = 1; i <= scArity; ++i) {
            println(ps, 2, "RTValue arg" + i + ";");
        }
        ps.println();
    }

    private void generateConstructor () {
        print(ps, 2, "public _" + scArity + " (RTSupercombinator function");
        for (int i = 1; i <= scArity; ++i) {
            ps.print(", RTValue arg" + i);
        }
        ps.println(") {");

        println(ps, 3, "super (function);");

        if (scArity > 0) {
            print(ps, 3, "assert (");
            for (int i = 1; i <= scArity; ++i) {
                ps.print("arg" + i + " != null");
                if (i < scArity) {
                    ps.print(" && ");
                }
            }
            ps.println(") : \"Invalid argument value in RTFullApp.General._" + scArity + " constructor.\";");
        }
        ps.println();

        for (int i = 1; i <= scArity; ++i) {
            println(ps, 3, "this.arg" + i + " = arg" + i + ";");
        }

        println(ps, 2, "}");
        ps.println();

    }

    private final void generateClassDec () {
        println(ps, 1, "/**");
        println(ps, 1, " * WARNING- this class was automatically generated by FullAppNodeGenerator. DO NOT MANUALLY EDIT THIS CLASS.");
        println(ps, 1, " * ");

        if (scArity > 0) {
            println(ps, 1, " * This class is used to represent a full application of an");
            println(ps, 1, " * arity " + scArity + " function.");
            println(ps, 1, " */");
            println(ps, 1, "public static abstract class _" + scArity + " extends General {");
        } else {
            println(ps, 1, " * Representation of an arity zero function applied to nothing.");
            println(ps, 1, " * This may sound silly but it keeps things simple as zero arity");
            println(ps, 1, " * functions and CAFs can be derived from RTSupercombinator like");
            println(ps, 1, " * all other functions and the _0 class handles indirecting to");
            println(ps, 1, " * a result.");
            println(ps, 1, " * Creation: Aug. 3, 2006");
            println(ps, 1, " */");
            println(ps, 1, "public static final class _" + scArity + " extends General {");
        }

        ps.println();

        // RTValue fields for arguments.
        generateFields();

        // Create the constructor for the node.
        generateConstructor();


        // Now generate the clearMembers method.
        generateClearMembers();

        // Generate the debugging info methods.
        generateDebug_getNChildren();
        generateDebug_getChild();
        generateDebug_getNodeStartText();
        generateDebug_getNodeEndText();
        generateDebug_getChildPrefixText();

        if (scArity == 0) {
            generateReduce(true);
        } else {
            generateLazyNodeClass();
            generateStrictNodeClass();
        }

        println(ps, 1, "}");
    }

    private final void generateInnerConstructor (boolean lazy) {
        if (lazy) {
            print(ps, 3, "public _L(RTSupercombinator function");
        } else {
            print(ps, 3, "public _S(RTSupercombinator function");
        }

        for (int i = 1; i <= scArity; ++i) {
            ps.print(", RTValue arg" + i);
        }
        ps.println(") {");
        print(ps, 4, "    super(function");
        for (int i = 1; i <= scArity; ++i) {
            ps.print(", arg" + i);
        }
        ps.println(");");
        println(ps, 3, "}");
    }

    private final void generateReduce(boolean lazy) {
        println(ps, 3, "/**");
        println(ps, 3, " * {@inheritDoc}");
        println(ps, 3, " */");
        println(ps, 3, "@Override");
        println(ps, 3, "protected final RTValue reduce(RTExecutionContext ec)");
        println(ps, 3, "        throws CALExecutorException {");
        println(ps, 3, "    // Reduce from this application");
        println(ps, 3, "    // Update and return result");
        //println(ps, 3, "        ec.setRootNode(this);");

        String functionName = "f";
        if (scArity > 0) {
            println(ps, 3, "    if (arg1 != null) {");
            functionName = functionName + scArity;
            if (lazy) {
                functionName = functionName + "L";
            } else {
                functionName = functionName + "S";
            }
        }
        println(ps, 3, "        setResult(function." + functionName + "(");
        if (scArity > 0) {
            for (int i = 1; i <= scArity; ++i) {
                println(ps, 3, "            RTValue.lastRef(arg" + i + ", (arg" + i + " = null)),");
            }
        } else {
            println(ps, 3, "            this,");
        }
        println(ps, 3, "            ec));");

        //println(ps, 3, "        clearMembers();");
        if (scArity > 0) {
            println(ps, 3, "    } else if (result == null) {");
            println(ps, 3, "        throw new NullPointerException(");
            println(ps, 3, "                \"Invalid reduction state in application.  This is probably caused by a circular function definition.\");");
            println(ps, 3, "    }");
        }
        println(ps, 3, "    return (result);");
        println(ps, 3, "}");
    }

    private final void generateLazyNodeClass () {
        println(ps, 2, "public static final class _L extends _" + scArity + " {");
        generateInnerConstructor(true);
        generateReduce(true);
        println(ps, 2, "}");
    }

    private final void generateStrictNodeClass () {
        println(ps, 2, "public static final class _S extends _" + scArity + " {");
        generateInnerConstructor(false);
        generateReduce(false);
        println(ps, 2, "}");
    }

    private final void generateDebug_getChildPrefixText () {
        println(ps, 2, "/**");
        println(ps, 2, " * {@inheritDoc}");
        println(ps, 2, " */");
        println(ps, 2, "@Override");
        println(ps, 2, "public final String debug_getChildPrefixText(int childN) {");
        println(ps, 2, "    if (result != null) {");
        println(ps, 2, "        return super.debug_getChildPrefixText(childN);");
        println(ps, 2, "    }");
        ps.println();
        println(ps, 2, "    if (childN >= 0 && childN < " + scArity + ") {");
        println(ps, 2, "        return \" \";");
        println(ps, 2, "    }");
        ps.println();
        println(ps, 2, "    throw new IndexOutOfBoundsException();");
        println(ps, 2, "}");
        ps.println();
    }

    private final void generateDebug_getNodeEndText() {
        println(ps, 2, "/**");
        println(ps, 2, " * {@inheritDoc}");
        println(ps, 2, " */");
        println(ps, 2, "@Override");
        println(ps, 2, "public final String debug_getNodeEndText() {");
        println(ps, 2, "    if (result != null) {");
        println(ps, 2, "        return super.debug_getNodeEndText();");
        println(ps, 2, "    }");
        ps.println();
        if (scArity > 0) {
            println(ps, 2, "    return \")\";");
        } else {
            println(ps, 2, "    return \"\";");
        }
        println(ps, 2, "}");

    }

    private final void generateDebug_getNodeStartText() {
        println(ps, 2, "/**");
        println(ps, 2, " * {@inheritDoc}");
        println(ps, 2, " */");
        println(ps, 2, "@Override");
        println(ps, 2, "public final String debug_getNodeStartText() {");
        println(ps, 2, "    if (result != null) {");
        println(ps, 2, "        return super.debug_getNodeStartText();");
        println(ps, 2, "    }");
        ps.println();
        if (scArity > 0) {
            println(ps, 2, "    return \"(\" + function.getQualifiedName();");
        } else {
            println(ps, 2, "    return function.getQualifiedName();");
        }
        println(ps, 2, "}");

    }

    private final void generateDebug_getChild() {
        println(ps, 2, "/**");
        println(ps, 2, " * {@inheritDoc}");
        println(ps, 2, " */");
        println(ps, 2, "@Override");
        println(ps, 2, "public final CalValue debug_getChild(int childN) {");
        println(ps, 2, "    if (result != null) {");
        println(ps, 2, "        return super.debug_getChild(childN);");
        println(ps, 2, "    }");
        ps.println();

        if (scArity > 0) {
            println(ps, 2, "    switch (childN) {");
            for (int i = 0; i < scArity; ++i) {
                println(ps, 2, "    case " + i + ":");
                println(ps, 2, "        return arg" + (i + 1) + ";");
            }

            println(ps, 2, "    default:");
            println(ps, 2, "        throw new IndexOutOfBoundsException();");
            println(ps, 2, "    }");
        } else {
            println(ps, 2, "    throw new IndexOutOfBoundsException();");
        }
        println(ps, 2, "}");

    }

    private final void generateClearMembers() {
        println(ps, 2, "/*");
        println(ps, 2, " *  (non-Javadoc)");
        println(ps, 2, " * @see org.openquark.cal.internal.runtime.lecc.RTResultFunction#clearMembers()");
        println(ps, 2, " */");
        println(ps, 2, "@Override");
        println(ps, 2, "public final void clearMembers() {");
        for (int i = 1; i <= scArity; ++i) {
            println(ps, 3, "arg" + i + " = null;");
        }
        println(ps, 2, "}");
        ps.println();
    }

    private final void generateDebug_getNChildren () {
        println(ps, 2, "/**");
        println(ps, 2, " * {@inheritDoc}");
        println(ps, 2, " */");
        println(ps, 2, "@Override");
        println(ps, 2, "public final int debug_getNChildren() {");
        println(ps, 3, "if (result != null) {");
        println(ps, 4, "return super.debug_getNChildren();");
        println(ps, 3, "}");
        println(ps, 3, "return " + scArity + ";");
        println(ps, 2, "}");
    }

    public static void main(String[] args) {
        try {
            // Set up the file for i/o.
            File f = new File (args[0]);
            FileOutputStream fs = new FileOutputStream(f);
            PrintStream ps = new PrintStream (fs);

            // There is a static inner class derived from RTFullApp.General for
            // each arity from 1 to 15.
            for (int scArity = 0; scArity <= 15; ++scArity) {

                FullAppNodeGenerator generator = new FullAppNodeGenerator(scArity, ps);
                generator.generateClassDec();

                ps.println();
            }

        } catch (Exception e) {
            System.out.println("Exception generating code for partial application classes.  " + e);
        }

        System.out.println("Generated source text sent to " + args[0]);
    }

    private static void print(final PrintStream ps, final int nTabs, final String text) {
        StringBuilder indentedText = new StringBuilder();
        for (int i = 0; i < nTabs; ++i) {
            indentedText.append("    ");
        }
        indentedText.append(text);
        ps.print(indentedText.toString());
    }

    private static void println(final PrintStream ps, final int nTabs, final String text) {
        print(ps, nTabs, text);
        ps.println();
    }

}
