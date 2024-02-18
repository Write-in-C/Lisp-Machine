lexer grammar Lexer;

// program
NS : 'ns';

//FILENAME : EXTENDED_STRING; // change

//basics
OP : '(';

CP : ')';

SO : '[';

SC : ']';

IF : 'if';

DEFN : 'defn';

IDENT : LETTER (DIGIT | LETTER | SYMBOLS)*;

//EXTENDED_STRING
//    : (SYMBOLS | LETTER | DIGIT)+;

DECIMAL : DIGIT+ ;

BOOLEAN
    : 'true'
    | 'false';

NIL : 'nil';

WHITESPACE : [ \r\n\t] + -> skip;

fragment DIGIT  :  [0-9];

fragment LETTER : 'a'..'z' | 'A'..'Z';

fragment SYMBOLS
    : '_'
    | '-';

fragment ANY_CHAR : '\\';

