import java_cup.runtime.Symbol;

%%

%unicode
%cup
%line
%column
%states INCOMMENT


digit = [0-9]
number = {digit}+
letter = [a-zA-Z]

/*literal*/
identifier = [a-zA-Z_][a-zA-Z0-9_]*
integer = -?[0-9]+
booleanLiteral = (true|false)
charLiteral = \'.\'
stringLiteral = \".?*\"
floatLiteral = -?[:digit:]+\.[:digit:]+

/* Space and Comment*/
whitespace = [ \t\n\r\f]
newLine = \r|\n|\r\n
comment = "//".*{newLine}

%states ERROR
%%

/* Operators */
"+" {return new Symbol(sym.PLUS);}
"^" {return new Symbol(sym.POWER);}
"::" {return new Symbol(sym.CONCAT);}
":" {return new Symbol(sym.COLON);}
"*" {return new Symbol(sym.TIMES);}
"-" {return new Symbol(sym.MINUS);}
"/" {return new Symbol(sym.DIVIDE);}


//Comparison operators
"==" {return new Symbol(sym.EQQ);}
"!=" {return new Symbol(sym.NOTEQ);}
"<" {return new Symbol(sym.LT);}
">" {return new Symbol(sym.GT);}
"<=" {return new Symbol(sym.LTEQ);}
">=" {return new Symbol(sym.GTEQ);}

//General tokens
"," {return new Symbol(sym.COMMA);}
"{" {return new Symbol(sym.LBRACE);}
"}" {return new Symbol(sym.RBRACE);}
"(" {return new Symbol(sym.LPAREN);}
")" {return new Symbol(sym.RPAREN);}
";" {return new Symbol(sym.SEMI);}
"=" {return new Symbol(sym.EQ);}
"!" {return new Symbol(sym.NEGATE);}
"&&" {return new Symbol(sym.AND);}
"in" {return new Symbol(sym.IN);}

"string" {return new Symbol(sym.STRING);}
"int" {return new Symbol(sym.INT);}
"float" {return new Symbol(sym.FLOAT);}
"char" {return new Symbol(sym.CHAR);}
"bool" {return new Symbol(sym.BOOL);}
"list" {return new Symbol(sym.LIST);}
"dict" {return new Symbol(sym.DICT);}
"def" {return new Symbol(sym.DEF);}
"tdef" {return new Symbol(sym.TDEF);}

"if" {return new Symbol(sym.IF);}
"else" {return new Symbol(sym.ELSE);}
"while" {return new Symbol(sym.WHILE);}
"foreach" {return new Symbol(sym.FOREACH);}
"len" {return new Symbol(sym.LEN);}
"return" {return new Symbol(sym.RETURN);}
"do" {return new Symbol(sym.DO);}
"read" {return new Symbol(sym.READ);}
"print" {return new Symbol(sym.PRINT);}
"main" {return new Symbol(sym.MAIN);}
"void" {return new Symbol(sym.VOID);}
"/*"       { yybegin(INCOMMENT); }

<YYINITIAL>{booleanLiteral}	    {return new Symbol(sym.BOOLEANLITERAL, yytext().equals("true"));}  
<YYINITIAL>{identifier}         {return new Symbol(sym.ID, yytext());}
<YYINITIAL>{charLiteral}	    {return new Symbol(sym.CHARLITERAL, yytext().charAt(1));}
<YYINITIAL>{floatLiteral}		{return new Symbol(sym.FLOATLITERAL, yytext());}
<YYINITIAL>{integer}	        {return new Symbol(sym.INTEGER, Integer.parseInt(yytext()));}
<YYINITIAL>{stringLiteral}	 	{return new Symbol(sym.STRINGLITERAL, yytext().substring(1, yytext().length() - 1));}
<YYINITIAL>{whitespace} {}
<YYINITIAL>{comment} {}

<INCOMMENT> {
"*/"      { yybegin(YYINITIAL); }
"*"       {} 
[^*\n]+   {} 
"\n"      {} 
}

<ERROR> {
[\{\}\(\);] | {whitespace}
					{
					yypushback(1);
					yybegin(YYINITIAL);
					System.err.println("Error: unknown input " + yytext() + " found at line " + yyline + ", character " + yycolumn);
					}
}

