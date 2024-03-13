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

IDENT : LETTER (DIGIT | LETTER | SYMBOLS)* | EQ | MUL | SUB | ADD;

//EXTENDED_STRING
//    : (SYMBOLS | LETTER | DIGIT)+;

INT : DIGIT+ ;

// arithmetics

EQ: '=';

MUL: '*';

SUB: '-';

ADD: '+';

BOOLEAN
    : 'true'
    | 'false';

NIL : 'nil';

WHITESPACE : [ \r\n\t] + -> skip;

// hints

INT_HINT : HINT_HEAD 'Integer';

DOUBLE_HINT : HINT_HEAD 'double';

BOOLEAN_HINT : HINT_HEAD 'Boolean';

fragment HINT_HEAD: '^';

fragment DIGIT  :  [0-9];

fragment LETTER : 'a'..'z' | 'A'..'Z';

fragment SYMBOLS
    : '_'
    | '-';

fragment ANY_CHAR : '\\';

