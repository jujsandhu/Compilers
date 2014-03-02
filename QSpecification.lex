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

%%

%line

%state COMMENT

digit = [0-9]
number = {digit}+
integer = -?[0-9]+
letter = [a-zA-Z]
identifier = [a-zA-Z_][a-zA-Z0-9_]*
whitespace = [ \t\n\r\f]
dataType = (int|string|float|char|bool|list|dict)
keyword = (if|else|while|foreach|class|public|in|len|return|do|read|print)
char = \'{letter}\'
string = \".?*\"
dict = \[\|.?*\|\]
list = \[.?*\]

%%

"+" {return new Yytoken("PLUS");}
"::" {return new Yytoken("CONCAT");}
"*" {return new Yytoken("TIMES");}
"-" {return new Yytoken("MINUS");}
"/" {return new Yytoken("DIVIDE");}
"(" {return new Yytoken("LPAREN");}
")" {return new Yytoken("RPAREN");}
";" {return new Yytoken("SEMI");}
"=" {return new Yytoken("EQ");}
"==" {return new Yytoken("EQQ");}
"!=" {return new Yytoken("NOTEQ");}
"<" {return new Yytoken("LT");}
">" {return new Yytoken("GT");}
"<=" {return new Yytoken("LTEQ");}
">=" {return new Yytoken("GTEQ");}
"," {return new Yytoken("COMMA");}
"{" {return new Yytoken("LBRACE");}
"}" {return new Yytoken("RBRACE");}
"++" {return new Yytoken("INCR");}
"!" {return new Yytoken("NEGATE");}
"&&" {return new Yytoken("AND");}

<YYINITIAL>{integer} {return new Yytoken("NUM", (new Integer(yytext())).intValue());}
<YYINITIAL>{keyword} {return new Yytoken(yytext().toUpperCase(), yytext());}
<YYINITIAL>{dataType} {return new Yytoken(yytext().toUpperCase(), yytext());}
<YYINITIAL>{string} {return new Yytoken("STRING", yytext());}
<YYINITIAL>{dict} {return new Yytoken("DICT", yytext());}
<YYINITIAL>{list} {return new Yytoken("LISTDEC", yytext());}
<YYINITIAL>{char} {return new Yytoken("CHAR", yytext());}
<YYINITIAL>{identifier} {return new Yytoken("ID", yytext());}
<YYINITIAL>{whitespace} {}
<YYINITIAL>"/*" {yybegin(COMMENT);}
<COMMENT>"*/" {yybegin(YYINITIAL);}
<COMMENT>. {}
<YYINITIAL>. {System.out.println("error: unknown character " + yytext() + " found at line " + yyline);}
