import java_cup.runtime.Symbol;

%%

%unicode
%cup
%line
%column
%states INCOMMENT

%{
	private StringBuilder input = null;
%}


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
"+" {return new Symbol(sym.PLUS,yyline, yycolumn);}
"^" {return new Symbol(sym.POWER,yyline, yycolumn);}
"::" {return new Symbol(sym.CONCAT,yyline, yycolumn);}
":" {return new Symbol(sym.COLON,yyline, yycolumn);}
"*" {return new Symbol(sym.TIMES,yyline, yycolumn);}
"-" {return new Symbol(sym.MINUS,yyline, yycolumn);}
"/" {return new Symbol(sym.DIVIDE,yyline, yycolumn);}
"." {return new Symbol(sym.DOT,yyline, yycolumn);}
"|" {return new Symbol(sym.LINE,yyline, yycolumn);} 

//Comparison operators
"==" {return new Symbol(sym.EQQ,yyline, yycolumn);}
"!=" {return new Symbol(sym.NOTEQ,yyline, yycolumn);}
"<" {return new Symbol(sym.LT,yyline, yycolumn);}
">" {return new Symbol(sym.GT,yyline, yycolumn);}
"<=" {return new Symbol(sym.LTEQ,yyline, yycolumn);}
">=" {return new Symbol(sym.GTEQ,yyline, yycolumn);}

//General tokens
"," {return new Symbol(sym.COMMA,yyline, yycolumn);}
"{" {return new Symbol(sym.LBRACE,yyline, yycolumn);}
"}" {return new Symbol(sym.RBRACE,yyline, yycolumn);}
"[" {return new Symbol(sym.LBRACKET,yyline, yycolumn);}
"]" {return new Symbol(sym.RBRACKET,yyline, yycolumn);}
"(" {return new Symbol(sym.LPAREN,yyline, yycolumn);}
")" {return new Symbol(sym.RPAREN,yyline, yycolumn);}
";" {return new Symbol(sym.SEMI,yyline, yycolumn);}
"=" {return new Symbol(sym.EQ,yyline, yycolumn);}
"!" {return new Symbol(sym.NEGATE,yyline, yycolumn);}
"&&" {return new Symbol(sym.AND,yyline, yycolumn);}
"in" {return new Symbol(sym.IN,yyline, yycolumn);}

"string" {return new Symbol(sym.STRING,yyline, yycolumn);}
"int" {return new Symbol(sym.INT,yyline, yycolumn);}
"float" {return new Symbol(sym.FLOAT,yyline, yycolumn);}
"char" {return new Symbol(sym.CHAR,yyline, yycolumn);}
"bool" {return new Symbol(sym.BOOL,yyline, yycolumn);}
"list" {return new Symbol(sym.LIST,yyline, yycolumn);}
"dict" {return new Symbol(sym.DICT,yyline, yycolumn);}
"def" {return new Symbol(sym.DEF,yyline, yycolumn);}
"tdef" {return new Symbol(sym.TDEF,yyline, yycolumn);}

"if" {return new Symbol(sym.IF,yyline, yycolumn);}
"else" {return new Symbol(sym.ELSE,yyline, yycolumn);}
"while" {return new Symbol(sym.WHILE,yyline, yycolumn);}
"foreach" {return new Symbol(sym.FOREACH,yyline, yycolumn);}
"len" {return new Symbol(sym.LEN,yyline, yycolumn);}
"return" {return new Symbol(sym.RETURN,yyline, yycolumn);}
"do" {return new Symbol(sym.DO,yyline, yycolumn);}
"read" {return new Symbol(sym.READ,yyline, yycolumn);}
"print" {return new Symbol(sym.PRINT,yyline, yycolumn);}
"main" {return new Symbol(sym.MAIN,yyline, yycolumn);}
"void" {return new Symbol(sym.VOID,yyline, yycolumn);}
"/*"       { yybegin(INCOMMENT); }

<YYINITIAL>{booleanLiteral}	    {return new Symbol(sym.BOOLEANLITERAL, yytext().equals("true"));}  
<YYINITIAL>{identifier}         {return new Symbol(sym.ID,yyline, yycolumn, yytext());}
<YYINITIAL>{charLiteral}	    {return new Symbol(sym.CHARLITERAL, yytext().charAt(1));}
<YYINITIAL>{floatLiteral}		{return new Symbol(sym.FLOATLITERAL, yytext());}
<YYINITIAL>{integer}	        {return new Symbol(sym.INTEGER,Integer.parseInt(yytext()));}
<YYINITIAL>{stringLiteral}	 	{return new Symbol(sym.STRINGLITERAL, yytext().substring(1, yytext().length() - 1));}
<YYINITIAL>{whitespace} {}
<YYINITIAL>{comment} {}

.					{ 
						yybegin(ERROR);
						input = new StringBuilder(yytext()); 
       		}

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
					System.err.println("Error in line " + yyline + ": character " + input + " in column "+yycolumn);
					}
.					{input.append(yytext());}
}

