/* Generated By:JavaCC: Do not edit this line. GWikiScannerConstants.java */
/*******************************************************************************
 * Copyright (c) 2005,2007 Cognium Systems SA and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Apache License, Version 2.0
 * which accompanies this distribution, and is available at
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Contributors:
 *     Cognium Systems SA - initial API and implementation
 *******************************************************************************/
package org.wikimodel.wem.gwiki.javacc;

public interface GWikiScannerConstants {

  int EOF = 0;
  int INTERNAL_VERBATIM_START = 1;
  int INTERNAL_VERBATIM_END = 2;
  int INTERNAL_VERBATIM_CONTENT = 3;
  int LI_SYMBOLS = 4;
  int PROPERTY = 5;
  int HEADER = 6;
  int VERBATIM_INLINE = 7;
  int REFERENCE = 8;
  int CELL = 9;
  int ESCAPE = 10;
  int FORMAT_SYMBOL = 11;
  int NEW_LINE = 12;
  int SPACE = 13;
  int SPECIAL_SYMBOL = 14;
  int CHAR = 15;
  int URI = 16;
  int ALPHA = 17;
  int DIGIT = 18;
  int HEXDIG = 19;
  int URI_GEN_DELIMS = 20;
  int URI_SUB_DELIMS = 21;
  int URI_UNRESERVED = 22;
  int URI_RESERVED = 23;
  int URI_SCHEME = 24;
  int URI_PCT_ENCODED = 25;
  int URI_PCHAR = 26;
  int URI_QUERY = 27;
  int URI_FRAGMENT = 28;
  int URI_HIER_PART = 29;
  int URI_AUTHORITY = 30;
  int URI_USERINFO = 31;
  int URI_PATH_ABEMPTY = 32;
  int URI_PATH_ABSOLUTE = 33;
  int URI_PATH_ROOTLESS = 34;
  int URI_SEGMENT = 35;
  int URI_SEGMENT_NZ = 36;
  int URI_PORT = 37;
  int URI_HOST = 38;
  int URI_REG_NAME = 39;
  int I_VERBATIM_START = 40;
  int I_ESCAPE = 41;
  int I_LIST_ITEM = 42;
  int I_TABLE_ROW = 43;
  int I_PROPERTY = 44;
  int I_HEADER_BEGIN = 45;
  int I_REFERENCE = 46;
  int I_HEADER_END = 47;
  int I_TABLE_CELL = 48;
  int I_VERBATIM_INLINE = 49;
  int I_FORMAT_SYMBOL = 50;
  int I_URI = 51;
  int I_NL = 52;
  int I_SPACE = 53;
  int I_WORD = 54;
  int I_SPECIAL_SYMBOL = 55;
  int D_VERBATIM_START = 56;
  int D_ESCAPE = 57;
  int D_LIST_ITEM = 58;
  int D_TABLE_ROW = 59;
  int D_PROPERTY = 60;
  int D_HEADER_BEGIN = 61;
  int D_REFERENCE = 62;
  int D_HEADER_END = 63;
  int D_TABLE_CELL = 64;
  int D_VERBATIM_INLINE = 65;
  int D_FORMAT_SYMBOL = 66;
  int D_URI = 67;
  int D_NL = 68;
  int D_SPACE = 69;
  int D_WORD = 70;
  int D_SPECIAL_SYMBOL = 71;

  int VERBATIM_CONTEXT = 0;
  int DEFAULT = 1;
  int INITIAL_CONTEXT = 2;

  String[] tokenImage = {
    "<EOF>",
    "\"{{{\"",
    "\"}}}\"",
    "<INTERNAL_VERBATIM_CONTENT>",
    "<LI_SYMBOLS>",
    "<PROPERTY>",
    "<HEADER>",
    "<VERBATIM_INLINE>",
    "<REFERENCE>",
    "\"||\"",
    "<ESCAPE>",
    "<FORMAT_SYMBOL>",
    "<NEW_LINE>",
    "<SPACE>",
    "<SPECIAL_SYMBOL>",
    "<CHAR>",
    "<URI>",
    "<ALPHA>",
    "<DIGIT>",
    "<HEXDIG>",
    "<URI_GEN_DELIMS>",
    "<URI_SUB_DELIMS>",
    "<URI_UNRESERVED>",
    "<URI_RESERVED>",
    "<URI_SCHEME>",
    "<URI_PCT_ENCODED>",
    "<URI_PCHAR>",
    "<URI_QUERY>",
    "<URI_FRAGMENT>",
    "<URI_HIER_PART>",
    "<URI_AUTHORITY>",
    "<URI_USERINFO>",
    "<URI_PATH_ABEMPTY>",
    "<URI_PATH_ABSOLUTE>",
    "<URI_PATH_ROOTLESS>",
    "<URI_SEGMENT>",
    "<URI_SEGMENT_NZ>",
    "<URI_PORT>",
    "<URI_HOST>",
    "<URI_REG_NAME>",
    "\"{{{\"",
    "<I_ESCAPE>",
    "<I_LIST_ITEM>",
    "<I_TABLE_ROW>",
    "<I_PROPERTY>",
    "<I_HEADER_BEGIN>",
    "<I_REFERENCE>",
    "<I_HEADER_END>",
    "<I_TABLE_CELL>",
    "<I_VERBATIM_INLINE>",
    "<I_FORMAT_SYMBOL>",
    "<I_URI>",
    "<I_NL>",
    "<I_SPACE>",
    "<I_WORD>",
    "<I_SPECIAL_SYMBOL>",
    "\"{{{\"",
    "<D_ESCAPE>",
    "<D_LIST_ITEM>",
    "<D_TABLE_ROW>",
    "<D_PROPERTY>",
    "<D_HEADER_BEGIN>",
    "<D_REFERENCE>",
    "<D_HEADER_END>",
    "<D_TABLE_CELL>",
    "<D_VERBATIM_INLINE>",
    "<D_FORMAT_SYMBOL>",
    "<D_URI>",
    "<D_NL>",
    "<D_SPACE>",
    "<D_WORD>",
    "<D_SPECIAL_SYMBOL>",
  };

}
