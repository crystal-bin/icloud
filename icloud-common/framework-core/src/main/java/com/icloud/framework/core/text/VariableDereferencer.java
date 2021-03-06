/*---------------------------------------------------------------------------*\
  $Id: 39ded0a97460be05df36aad9bd3ae693f17950ae $
  ---------------------------------------------------------------------------
  This software is released under a BSD-style license:

  Copyright (c) 2004-2007 Brian M. Clapper. All rights reserved.

  Redistribution and use in source and binary forms, with or without
  modification, are permitted provided that the following conditions are
  met:

  1.  Redistributions of source code must retain the above copyright notice,
      this list of conditions and the following disclaimer.

  2.  The end-user documentation included with the redistribution, if any,
      must include the following acknowlegement:

        "This product includes software developed by Brian M. Clapper
        (bmc@clapper.org, http://www.clapper.org/bmc/). That software is
        copyright (c) 2004-2007 Brian M. Clapper."

      Alternately, this acknowlegement may appear in the software itself,
      if wherever such third-party acknowlegements normally appear.

  3.  Neither the names "clapper.org", "clapper.org Java Utility Library",
      nor any of the names of the project contributors may be used to
      endorse or promote products derived from this software without prior
      written permission. For written permission, please contact
      bmc@clapper.org.

  4.  Products derived from this software may not be called "clapper.org
      Java Utility Library", nor may "clapper.org" appear in their names
      without prior written permission of Brian M. Clapper.

  THIS SOFTWARE IS PROVIDED ``AS IS'' AND ANY EXPRESSED OR IMPLIED
  WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF
  MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN
  NO EVENT SHALL BRIAN M. CLAPPER BE LIABLE FOR ANY DIRECT, INDIRECT,
  INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT
  NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
  DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
  THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
  (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF
  THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
\*---------------------------------------------------------------------------*/

package com.icloud.framework.core.text;

/**
 * <p>The <code>VariableDereferencer</code> interface defines the behavior
 * of classes that can look up variables by name, returning their values.
 * It is used primarily to mark classes that can work hand-in-hand with
 * <code>VariableSubstituter</code> objects to resolve variable references
 * in strings.</p>
 *
 * <p>The values for referenced variables can come from anywhere (in a
 * <code>Properties</code> object, via direct method calls, from a symbol
 * table, etc.), provided the values can be located using only the
 * variable's name.</p>
 *
 * @see MapVariableDereferencer
 * @see VariableSubstituter
 *
 * @version $Revision$
 *
 * @author Copyright &copy; 2004-2007 Brian M. Clapper
 */
public interface VariableDereferencer
{
    /*----------------------------------------------------------------------*\
                              Public Methods
    \*----------------------------------------------------------------------*/

    /**
     * Get the value associated with a given variable.
     *
     * @param varName  The name of the variable for which the value is
     *                 desired.
     * @param context  a context object, passed through from the caller
     *                 to the dereferencer, or null if there isn't one.
     *
     * @return The variable's value. If the variable has no value, this
     *         method must return null.
     *
     * @throws VariableSubstitutionException  substitution error
     */
    public String getVariableValue (String varName, Object context)
        throws VariableSubstitutionException;
}
