lexer grammar Lexer;

// program
NS : 'ns';

NIL : 'nil';

//basics
OP : '(';

CP : ')';

SO : '[';

SC : ']';

IF : 'if';

DEFN : 'defn';

FN : 'fn';

CONS : 'cons';

LET : 'let';

IDENT : LETTER (DIGIT | LETTER | SYMBOLS)* | EQ | MUL | SUB | ADD | LEQ;


INT : DIGIT+ ;

// arithmetics

EQ: '=';

LEQ: '<=';

MUL: '*';

SUB: '-';

ADD: '+';

BOOLEAN
    : 'true'
    | 'false';


WHITESPACE : [ \r\n\t] + -> skip;

// hints

INT_HINT : HINT_HEAD 'Integer';

DOUBLE_HINT : HINT_HEAD 'double';

BOOLEAN_HINT : HINT_HEAD 'Boolean';

FUNCTION_HINT : HINT_HEAD 'java.lang.function';

NO_HINT : ' ';

fragment HINT_HEAD: '^';

fragment DIGIT  :  [0-9];

fragment LETTER : 'a'..'z' | 'A'..'Z';

fragment SYMBOLS
    : '_'
    | '-';

fragment ANY_CHAR : '\\';

