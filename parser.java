
//----------------------------------------------------
// The following code was generated by CUP v0.11b beta 20140220
// Mon Mar 10 19:54:41 GMT 2014
//----------------------------------------------------

import java_cup.runtime.*;
import java_cup.runtime.ComplexSymbolFactory.Location;

/** CUP v0.11b beta 20140220 generated parser.
  * @version Mon Mar 10 19:54:41 GMT 2014
  */
public class parser extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\020\000\002\007\005\000\002\002\004\000\002\005" +
    "\004\000\002\005\002\000\002\006\005\000\002\006\007" +
    "\000\002\006\004\000\002\003\004\000\002\003\002\000" +
    "\002\004\006\000\002\004\004\000\002\002\003\000\002" +
    "\002\003\000\002\002\005\000\002\002\005\000\002\002" +
    "\005" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\037\000\010\003\ufffe\040\ufffe\050\ufffe\001\002\000" +
    "\004\002\041\001\002\000\010\003\007\040\011\050\010" +
    "\001\002\000\010\003\uffff\040\uffff\050\uffff\001\002\000" +
    "\004\024\040\001\002\000\010\002\ufff9\003\ufff9\052\ufff9" +
    "\001\002\000\004\052\012\001\002\000\006\013\013\024" +
    "\014\001\002\000\010\026\017\033\015\052\016\001\002" +
    "\000\010\003\ufffd\040\ufffd\050\ufffd\001\002\000\012\004" +
    "\ufff6\010\ufff6\024\ufff6\027\ufff6\001\002\000\012\004\ufff5" +
    "\010\ufff5\024\ufff5\027\ufff5\001\002\000\010\026\017\033" +
    "\015\052\016\001\002\000\010\004\021\010\023\024\022" +
    "\001\002\000\010\026\017\033\015\052\016\001\002\000" +
    "\010\003\ufffc\040\ufffc\050\ufffc\001\002\000\010\026\017" +
    "\033\015\052\016\001\002\000\012\004\ufff3\010\ufff3\024" +
    "\ufff3\027\ufff3\001\002\000\012\004\ufff4\010\023\024\ufff4" +
    "\027\ufff4\001\002\000\010\004\021\010\023\027\027\001" +
    "\002\000\012\004\ufff2\010\ufff2\024\ufff2\027\ufff2\001\002" +
    "\000\010\002\001\003\033\052\031\001\002\000\004\013" +
    "\035\001\002\000\010\002\ufffa\003\ufffa\052\ufffa\001\002" +
    "\000\004\024\034\001\002\000\010\002\ufff7\003\ufff7\052" +
    "\ufff7\001\002\000\010\026\017\033\015\052\016\001\002" +
    "\000\010\004\021\010\023\024\037\001\002\000\010\002" +
    "\ufff8\003\ufff8\052\ufff8\001\002\000\010\003\ufffb\040\ufffb" +
    "\050\ufffb\001\002\000\004\002\000\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\037\000\006\005\004\007\003\001\001\000\002\001" +
    "\001\000\004\006\005\001\001\000\002\001\001\000\002" +
    "\001\001\000\004\003\027\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\002\017\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\002\025\001" +
    "\001\000\002\001\001\000\004\002\024\001\001\000\002" +
    "\001\001\000\004\002\023\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\004\031\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\002\035\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$parser$actions {
  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$parser$do_action_part00000000(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // program ::= decllist MAIN exprlist 
            {
              Object RESULT =null;
		 System.out.println("========end parsing=========="); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("program",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= program EOF 
            {
              Object RESULT =null;
		Location start_valxleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).xleft;
		Location start_valxright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).xright;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // decllist ::= decllist decl 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("decllist",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // decllist ::= 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("decllist",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // decl ::= INT ID SEMI 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("decl",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // decl ::= INT ID EQ expr SEMI 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("decl",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // decl ::= error SEMI 
            {
              Object RESULT =null;
		 System.out.println("decl failed"); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("decl",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // exprlist ::= exprlist exprstmt 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("exprlist",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // exprlist ::= 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("exprlist",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // exprstmt ::= ID EQ expr SEMI 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("exprstmt",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // exprstmt ::= error SEMI 
            {
              Object RESULT =null;
		 System.out.println("expr failed"); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("exprstmt",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // expr ::= INTEGER 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // expr ::= ID 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // expr ::= expr PLUS expr 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // expr ::= expr TIMES expr 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // expr ::= LPAREN expr RPAREN 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
              return CUP$parser$do_action_part00000000(
                               CUP$parser$act_num,
                               CUP$parser$parser,
                               CUP$parser$stack,
                               CUP$parser$top);
    }
}

