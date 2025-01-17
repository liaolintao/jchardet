/* ***** BEGIN LICENSE BLOCK *****
 * Version: MPL 1.1/GPL 2.0/LGPL 2.1
 *
 * The contents of this file are subject to the Mozilla Public License Version
 * 1.1 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * http://www.mozilla.org/MPL/
 *
 * Software distributed under the License is distributed on an "AS IS" basis,
 * WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License
 * for the specific language governing rights and limitations under the
 * License.
 *
 * The Original Code is mozilla.org code.
 *
 * The Initial Developer of the Original Code is
 * Netscape Communications Corporation.
 * Portions created by the Initial Developer are Copyright (C) 1998
 * the Initial Developer. All Rights Reserved.
 *
 * Alternatively, the contents of this file may be used under the terms of
 * either of the GNU General Public License Version 2 or later (the "GPL"),
 * or the GNU Lesser General Public License Version 2.1 or later (the "LGPL"),
 * in which case the provisions of the GPL or the LGPL are applicable instead
 * of those above. If you wish to allow use of your version of this file only
 * under the terms of either the GPL or the LGPL, and not to allow others to
 * use your version of this file under the terms of the MPL, indicate your
 * decision by deleting the provisions above and replace them with the notice
 * and other provisions required by the GPL or the LGPL. If you do not delete
 * the provisions above, a recipient may use your version of this file under
 * the terms of any one of the MPL, the GPL or the LGPL.
 *
 * ***** END LICENSE BLOCK ***** */

/* 
 * DO NOT EDIT THIS DOCUMENT MANUALLY !!!
 * THIS FILE IS AUTOMATICALLY GENERATED BY THE TOOLS UNDER
 *    AutoDetect/tools/
 */

package org.mozilla.intl.chardet;

public class nsCP1252Verifier extends nsVerifier {

	 static int[]  cclass   ; 
	 static int[]  states   ; 
	 static int    stFactor ; 
	 static String charset  ; 

	 public int[]  cclass()   { return cclass ;   }
	 public int[]  states()   { return states ;   }
	 public int    stFactor() { return stFactor ; }
	 public String charset()  { return charset ;  }

   public nsCP1252Verifier() {

       cclass = new int[256 / 8];

       cclass[0] =
               ((((((2) << 4) | (2)) << 8) | (((2) << 4) | (2))) << 16) | (((((2) << 4) | (2)) << 8) | (((2) << 4) | (1)));
       cclass[1] =
               ((((((0) << 4) | (0)) << 8) | (((2) << 4) | (2))) << 16) | (((((2) << 4) | (2)) << 8) | (((2) << 4) | (2)));
       cclass[2] =
               ((((((2) << 4) | (2)) << 8) | (((2) << 4) | (2))) << 16) | (((((2) << 4) | (2)) << 8) | (((2) << 4) | (2)));
       cclass[3] =
               ((((((2) << 4) | (2)) << 8) | (((2) << 4) | (2))) << 16) | (((((0) << 4) | (2)) << 8) | (((2) << 4) | (2)));
       cclass[4] =
               ((((((2) << 4) | (2)) << 8) | (((2) << 4) | (2))) << 16) | (((((2) << 4) | (2)) << 8) | (((2) << 4) | (2)));
       cclass[5] =
               ((((((2) << 4) | (2)) << 8) | (((2) << 4) | (2))) << 16) | (((((2) << 4) | (2)) << 8) | (((2) << 4) | (2)));
       cclass[6] =
               ((((((2) << 4) | (2)) << 8) | (((2) << 4) | (2))) << 16) | (((((2) << 4) | (2)) << 8) | (((2) << 4) | (2)));
       cclass[7] =
               ((((((2) << 4) | (2)) << 8) | (((2) << 4) | (2))) << 16) | (((((2) << 4) | (2)) << 8) | (((2) << 4) | (2)));
       cclass[8] =
               ((((((2) << 4) | (2)) << 8) | (((2) << 4) | (2))) << 16) | (((((2) << 4) | (2)) << 8) | (((2) << 4) | (2)));
       cclass[9] =
               ((((((2) << 4) | (2)) << 8) | (((2) << 4) | (2))) << 16) | (((((2) << 4) | (2)) << 8) | (((2) << 4) | (2)));
       cclass[10] =
               ((((((2) << 4) | (2)) << 8) | (((2) << 4) | (2))) << 16) | (((((2) << 4) | (2)) << 8) | (((2) << 4) | (2)));
       cclass[11] =
               ((((((2) << 4) | (2)) << 8) | (((2) << 4) | (2))) << 16) | (((((2) << 4) | (2)) << 8) | (((2) << 4) | (2)));
       cclass[12] =
               ((((((2) << 4) | (2)) << 8) | (((2) << 4) | (2))) << 16) | (((((2) << 4) | (2)) << 8) | (((2) << 4) | (2)));
       cclass[13] =
               ((((((2) << 4) | (2)) << 8) | (((2) << 4) | (2))) << 16) | (((((2) << 4) | (2)) << 8) | (((2) << 4) | (2)));
       cclass[14] =
               ((((((2) << 4) | (2)) << 8) | (((2) << 4) | (2))) << 16) | (((((2) << 4) | (2)) << 8) | (((2) << 4) | (2)));
       cclass[15] =
               ((((((2) << 4) | (2)) << 8) | (((2) << 4) | (2))) << 16) | (((((2) << 4) | (2)) << 8) | (((2) << 4) | (2)));
       cclass[16] =
               ((((((2) << 4) | (2)) << 8) | (((2) << 4) | (2))) << 16) | (((((2) << 4) | (2)) << 8) | (((0) << 4) | (2)));
       cclass[17] =
               ((((((0) << 4) | (1)) << 8) | (((0) << 4) | (1))) << 16) | (((((2) << 4) | (1)) << 8) | (((2) << 4) | (2)));
       cclass[18] =
               ((((((2) << 4) | (2)) << 8) | (((2) << 4) | (2))) << 16) | (((((2) << 4) | (2)) << 8) | (((2) << 4) | (0)));
       cclass[19] =
               ((((((1) << 4) | (1)) << 8) | (((0) << 4) | (1))) << 16) | (((((2) << 4) | (1)) << 8) | (((2) << 4) | (2)));
       cclass[20] =
               ((((((2) << 4) | (2)) << 8) | (((2) << 4) | (2))) << 16) | (((((2) << 4) | (2)) << 8) | (((2) << 4) | (2)));
       cclass[21] =
               ((((((2) << 4) | (2)) << 8) | (((2) << 4) | (2))) << 16) | (((((2) << 4) | (2)) << 8) | (((2) << 4) | (2)));
       cclass[22] =
               ((((((2) << 4) | (2)) << 8) | (((2) << 4) | (2))) << 16) | (((((2) << 4) | (2)) << 8) | (((2) << 4) | (2)));
       cclass[23] =
               ((((((2) << 4) | (2)) << 8) | (((2) << 4) | (2))) << 16) | (((((2) << 4) | (2)) << 8) | (((2) << 4) | (2)));
       cclass[24] =
               ((((((1) << 4) | (1)) << 8) | (((1) << 4) | (1))) << 16) | (((((1) << 4) | (1)) << 8) | (((1) << 4) | (1)));
       cclass[25] =
               ((((((1) << 4) | (1)) << 8) | (((1) << 4) | (1))) << 16) | (((((1) << 4) | (1)) << 8) | (((1) << 4) | (1)));
       cclass[26] =
               ((((((2) << 4) | (1)) << 8) | (((1) << 4) | (1))) << 16) | (((((1) << 4) | (1)) << 8) | (((1) << 4) | (1)));
       cclass[27] =
               ((((((1) << 4) | (1)) << 8) | (((1) << 4) | (1))) << 16) | (((((1) << 4) | (1)) << 8) | (((1) << 4) | (1)));
       cclass[28] =
               ((((((1) << 4) | (1)) << 8) | (((1) << 4) | (1))) << 16) | (((((1) << 4) | (1)) << 8) | (((1) << 4) | (1)));
       cclass[29] =
               ((((((1) << 4) | (1)) << 8) | (((1) << 4) | (1))) << 16) | (((((1) << 4) | (1)) << 8) | (((1) << 4) | (1)));
       cclass[30] =
               ((((((2) << 4) | (1)) << 8) | (((1) << 4) | (1))) << 16) | (((((1) << 4) | (1)) << 8) | (((1) << 4) | (1)));
       cclass[31] =
               ((((((1) << 4) | (1)) << 8) | (((1) << 4) | (1))) << 16) | (((((1) << 4) | (1)) << 8) | (((1) << 4) | (1)));


       states = new int[3];

       states[0] =
               ((((((eItsMe) << 4) | (eItsMe)) << 8) | (((eError) << 4) | (eError))) << 16) | (((((eError) << 4) | (eStart)) << 8) | (((3) << 4) | (eError)));
       states[1] =
               ((((((eError) << 4) | (4)) << 8) | (((5) << 4) | (eError))) << 16) | (((((eStart) << 4) | (4)) << 8) | (((eError) << 4) | (eItsMe)));
       states[2] =
               ((((((eStart) << 4) | (eStart)) << 8) | (((eStart) << 4) | (eStart))) << 16) | (((((eStart) << 4) | (eStart)) << 8) | (((4) << 4) | (eError)));


       charset = "windows-1252";
       stFactor = 3;

   }

    public boolean isUCS2() { return false; }


}
