/* The following code was generated by JFlex 1.5.0-SNAPSHOT */

class Yytoken {
  String token;
  int value;
  String name;

  Yytoken (String token) {
    this.token = token;
  }

  Yytoken (String token, int value) {
    this.token=token;
    this.value=value;
  }

  Yytoken (String token, String name) {
    this.token=token;
    this.name=name;
  }

  String getToken() {
    return token;
  }

  int getValue() {
    return value;
  }

  String getName() {
    return name;
  }
}


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.5.0-SNAPSHOT
 * from the specification file <tt>/Users/jujsandhu/Downloads/jlex-example (1)/calculator-nocomment.lex</tt>
 */
class Yylex {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int COMMENT = 2;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1, 1
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\5\1\32\1\33\1\32\1\32\22\0\1\5\1\47\1\31"+
    "\3\0\1\55\1\30\1\43\1\44\1\41\1\37\1\52\1\2\1\0"+
    "\1\42\12\1\1\40\1\45\1\50\1\46\1\51\2\0\32\3\1\34"+
    "\1\0\1\36\1\0\1\4\1\0\1\17\1\22\1\20\1\23\1\24"+
    "\1\14\1\13\1\21\1\6\2\3\1\15\1\3\1\7\1\16\1\26"+
    "\1\3\1\12\1\11\1\10\1\27\1\3\1\25\3\3\1\53\1\35"+
    "\1\54\7\0\1\33\u1fa2\0\1\33\1\33\udfd6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\2\0\1\1\1\2\1\3\1\4\1\5\13\4\3\1"+
    "\1\6\1\1\1\7\1\10\1\11\1\12\1\13\1\14"+
    "\1\15\1\16\1\17\1\20\1\21\1\22\1\1\1\3"+
    "\1\5\1\7\1\10\1\5\2\23\16\4\2\0\1\24"+
    "\2\0\1\25\1\26\1\27\1\30\1\31\1\32\1\33"+
    "\1\34\1\35\1\36\15\4\1\37\1\0\1\25\5\4"+
    "\1\40\4\4";

  private static int [] zzUnpackAction() {
    int [] result = new int[98];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\56\0\134\0\212\0\212\0\270\0\134\0\346"+
    "\0\u0114\0\u0142\0\u0170\0\u019e\0\u01cc\0\u01fa\0\u0228\0\u0256"+
    "\0\u0284\0\u02b2\0\u02e0\0\u030e\0\u033c\0\u036a\0\u0398\0\134"+
    "\0\u03c6\0\134\0\134\0\134\0\u03f4\0\u0422\0\u0450\0\u047e"+
    "\0\134\0\134\0\134\0\u04ac\0\134\0\u0398\0\u04da\0\134"+
    "\0\u04ac\0\u0508\0\270\0\u0536\0\u0564\0\u0592\0\u05c0\0\u05ee"+
    "\0\u061c\0\u064a\0\u0678\0\u06a6\0\u06d4\0\u0702\0\u0730\0\u075e"+
    "\0\u078c\0\u07ba\0\u030e\0\u030e\0\u07e8\0\u0816\0\u07e8\0\134"+
    "\0\134\0\134\0\134\0\134\0\134\0\134\0\134\0\134"+
    "\0\u0844\0\u0872\0\u08a0\0\u08ce\0\u08fc\0\u0508\0\u092a\0\u0958"+
    "\0\u0986\0\u09b4\0\u09e2\0\u0a10\0\u0a3e\0\134\0\u0a6c\0\u0816"+
    "\0\u0a9a\0\u0ac8\0\u0af6\0\u0b24\0\u0b52\0\u0816\0\u0b80\0\u0bae"+
    "\0\u0bdc\0\u0c0a";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[98];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\3\1\4\1\5\2\6\1\7\1\10\2\6\1\11"+
    "\1\12\1\6\1\13\1\14\2\6\1\15\1\6\1\16"+
    "\1\17\1\20\1\21\1\22\1\6\1\23\1\24\1\7"+
    "\1\0\1\25\2\3\1\26\1\27\1\30\1\31\1\32"+
    "\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42"+
    "\1\43\1\44\2\7\1\45\27\7\2\0\3\7\1\26"+
    "\1\46\1\47\1\50\1\32\1\33\1\34\1\35\1\36"+
    "\1\37\1\40\1\41\1\42\1\43\1\51\57\0\1\4"+
    "\55\0\1\6\1\0\2\6\1\0\22\6\27\0\1\6"+
    "\1\0\2\6\1\0\1\6\1\52\4\6\1\53\13\6"+
    "\27\0\1\6\1\0\2\6\1\0\2\6\1\54\17\6"+
    "\27\0\1\6\1\0\2\6\1\0\16\6\1\55\3\6"+
    "\27\0\1\6\1\0\2\6\1\0\7\6\1\56\1\57"+
    "\11\6\27\0\1\6\1\0\2\6\1\0\1\60\15\6"+
    "\1\61\3\6\27\0\1\6\1\0\2\6\1\0\7\6"+
    "\1\62\3\6\1\63\6\6\27\0\1\6\1\0\2\6"+
    "\1\0\10\6\1\64\11\6\27\0\1\6\1\0\2\6"+
    "\1\0\1\65\7\6\1\53\11\6\27\0\1\6\1\0"+
    "\2\6\1\0\7\6\1\66\12\6\27\0\1\6\1\0"+
    "\2\6\1\0\13\6\1\67\6\6\27\0\1\6\1\0"+
    "\2\6\1\0\4\6\1\70\14\6\1\71\31\0\1\72"+
    "\2\0\22\72\26\0\31\73\1\74\2\0\22\73\32\75"+
    "\2\0\1\75\1\76\1\77\17\75\37\0\1\100\56\0"+
    "\1\101\56\0\1\102\62\0\1\103\55\0\1\104\55\0"+
    "\1\105\55\0\1\106\64\0\1\107\42\0\1\110\14\0"+
    "\1\6\1\0\2\6\1\0\2\6\1\53\17\6\27\0"+
    "\1\6\1\0\2\6\1\0\4\6\1\111\15\6\27\0"+
    "\1\6\1\0\2\6\1\0\2\6\1\112\6\6\1\113"+
    "\10\6\27\0\1\6\1\0\2\6\1\0\10\6\1\114"+
    "\11\6\27\0\1\6\1\0\2\6\1\0\4\6\1\115"+
    "\15\6\27\0\1\6\1\0\2\6\1\0\3\6\1\116"+
    "\16\6\27\0\1\6\1\0\2\6\1\0\1\6\1\53"+
    "\20\6\27\0\1\6\1\0\2\6\1\0\11\6\1\117"+
    "\10\6\27\0\1\6\1\0\2\6\1\0\11\6\1\120"+
    "\10\6\27\0\1\6\1\0\2\6\1\0\10\6\1\121"+
    "\11\6\27\0\1\6\1\0\2\6\1\0\12\6\1\116"+
    "\7\6\27\0\1\6\1\0\2\6\1\0\3\6\1\122"+
    "\16\6\27\0\1\6\1\0\2\6\1\0\1\123\21\6"+
    "\27\0\1\6\1\0\2\6\1\0\1\124\21\6\27\0"+
    "\1\6\1\0\2\6\1\0\14\6\1\125\5\6\56\0"+
    "\1\126\25\0\32\75\2\0\2\75\1\77\17\75\32\76"+
    "\2\0\1\76\1\127\1\130\17\76\1\0\1\6\1\0"+
    "\2\6\1\0\1\131\21\6\27\0\1\6\1\0\2\6"+
    "\1\0\21\6\1\132\27\0\1\6\1\0\2\6\1\0"+
    "\15\6\1\53\4\6\27\0\1\6\1\0\2\6\1\0"+
    "\11\6\1\116\10\6\27\0\1\6\1\0\2\6\1\0"+
    "\16\6\1\133\3\6\27\0\1\6\1\0\2\6\1\0"+
    "\3\6\1\134\16\6\27\0\1\6\1\0\2\6\1\0"+
    "\4\6\1\53\15\6\27\0\1\6\1\0\2\6\1\0"+
    "\7\6\1\53\12\6\27\0\1\6\1\0\2\6\1\0"+
    "\16\6\1\53\3\6\27\0\1\6\1\0\2\6\1\0"+
    "\7\6\1\122\12\6\27\0\1\6\1\0\2\6\1\0"+
    "\1\6\1\116\20\6\27\0\1\6\1\0\2\6\1\0"+
    "\7\6\1\135\12\6\26\0\32\76\2\0\1\76\1\127"+
    "\1\136\17\76\1\0\1\6\1\0\2\6\1\0\1\6"+
    "\1\137\20\6\27\0\1\6\1\0\2\6\1\0\4\6"+
    "\1\61\15\6\27\0\1\6\1\0\2\6\1\0\11\6"+
    "\1\140\10\6\27\0\1\6\1\0\2\6\1\0\3\6"+
    "\1\53\16\6\27\0\1\6\1\0\2\6\1\0\1\141"+
    "\21\6\27\0\1\6\1\0\2\6\1\0\5\6\1\53"+
    "\14\6\27\0\1\6\1\0\2\6\1\0\12\6\1\142"+
    "\7\6\27\0\1\6\1\0\2\6\1\0\12\6\1\53"+
    "\7\6\27\0\1\6\1\0\2\6\1\0\13\6\1\53"+
    "\6\6\26\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[3128];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\2\0\1\11\3\1\1\11\20\1\1\11\1\1\3\11"+
    "\4\1\3\11\1\1\1\11\2\1\1\11\21\1\2\0"+
    "\1\1\2\0\1\1\11\11\15\1\1\11\1\0\13\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[98];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Yylex(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  Yylex(java.io.InputStream in) {
    this(new java.io.InputStreamReader
             (in, java.nio.charset.Charset.forName("UTF-8")));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 134) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

    // numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Yytoken yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          zzR = false;
          break;
        case '\r':
          yyline++;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
          }
          break;
        default:
          zzR = false;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 1: 
          { System.out.println("error: unknown character " + yytext() + " found at line " + yyline);
          }
        case 33: break;
        case 2: 
          { return new Yytoken("NUM", (new Integer(yytext())).intValue());
          }
        case 34: break;
        case 3: 
          { return new Yytoken("MINUS");
          }
        case 35: break;
        case 4: 
          { return new Yytoken("ID", yytext());
          }
        case 36: break;
        case 5: 
          { 
          }
        case 37: break;
        case 6: 
          { return new Yytoken("PLUS");
          }
        case 38: break;
        case 7: 
          { return new Yytoken("TIMES");
          }
        case 39: break;
        case 8: 
          { return new Yytoken("DIVIDE");
          }
        case 40: break;
        case 9: 
          { return new Yytoken("LPAREN");
          }
        case 41: break;
        case 10: 
          { return new Yytoken("RPAREN");
          }
        case 42: break;
        case 11: 
          { return new Yytoken("SEMI");
          }
        case 43: break;
        case 12: 
          { return new Yytoken("EQ");
          }
        case 44: break;
        case 13: 
          { return new Yytoken("NEGATE");
          }
        case 45: break;
        case 14: 
          { return new Yytoken("LT");
          }
        case 46: break;
        case 15: 
          { return new Yytoken("GT");
          }
        case 47: break;
        case 16: 
          { return new Yytoken("COMMA");
          }
        case 48: break;
        case 17: 
          { return new Yytoken("LBRACE");
          }
        case 49: break;
        case 18: 
          { return new Yytoken("RBRACE");
          }
        case 50: break;
        case 19: 
          { return new Yytoken(yytext().toUpperCase(), yytext());
          }
        case 51: break;
        case 20: 
          { return new Yytoken("STRING", yytext());
          }
        case 52: break;
        case 21: 
          { return new Yytoken("LISTDEC", yytext());
          }
        case 53: break;
        case 22: 
          { return new Yytoken("INCR");
          }
        case 54: break;
        case 23: 
          { return new Yytoken("CONCAT");
          }
        case 55: break;
        case 24: 
          { yybegin(COMMENT);
          }
        case 56: break;
        case 25: 
          { return new Yytoken("EQQ");
          }
        case 57: break;
        case 26: 
          { return new Yytoken("NOTEQ");
          }
        case 58: break;
        case 27: 
          { return new Yytoken("LTEQ");
          }
        case 59: break;
        case 28: 
          { return new Yytoken("GTEQ");
          }
        case 60: break;
        case 29: 
          { return new Yytoken("AND");
          }
        case 61: break;
        case 30: 
          { yybegin(YYINITIAL);
          }
        case 62: break;
        case 31: 
          { return new Yytoken("CHAR", yytext());
          }
        case 63: break;
        case 32: 
          { return new Yytoken("DICT", yytext());
          }
        case 64: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            return null;
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
