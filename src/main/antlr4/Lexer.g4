lexer grammar Lexer;

PLUS : '+';
OP : '(';
CP : ')';

NUMBER : DIGIT+ ;

WHITESPACE : [ \r\n\t] + -> channel (HIDDEN);

DIGIT  :  [0-9];

LETTER : [a-zA-Z];
