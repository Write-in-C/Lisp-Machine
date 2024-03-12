grammar Clojure;

import Lexer;

program : filename expressions EOF;

filename : OP NS IDENT CP;

expressions : expression*;

expression
    : call
    | atom
    | if
    | defn // for now
    | list
    ;

list : OP expressions CP;

call : OP ident arguments CP;

atom
    : number
    | ident
    | boolean
    | nil
//    | arithmetics
    ;

number: INT; // Add more types

ident: IDENT;

boolean: BOOLEAN;

nil : NIL;

hint
    : INT_HINT
    | DOUBLE_HINT
//    | CHAR_HINT
//    | STRING_HINT
    | BOOLEAN_HINT
    ;

if : OP IF ifBody then else CP;

ifBody: expression;

then: expression;

else: expression;

parameters
  :
  (hint ident)*
  ;

defnID: ident hint;

defn
    : OP DEFN defnID SO parameters SC body=expressions CP;

idents: ident*;

arguments:
    (expression)*
    ;
