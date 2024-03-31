grammar Clojure;

import Lexer;

program : filename expressions EOF;

filename : OP NS IDENT CP;

expressions : expression*;

expression
    : list
    | call
    | atom
    | if
    | defn // for now
    | let
    ;

list : OP list_elem CP;

list_elem : CONS expression (expression | OP list_elem CP);

call : OP ident arguments CP;

atom
    : number
    | nil
    | boolean
    | ident
    | fn
    ;

number: INT; // Add more types

ident: IDENT;

boolean: BOOLEAN;

nil : NIL;

hint
    : INT_HINT
    | DOUBLE_HINT
    | FUNCTION_HINT
//    | STRING_HINT
    | BOOLEAN_HINT
    | NO_HINT
    ;

if : OP IF ifBody then else CP;

ifBody: expression;

then: expression;

else: expression;

parameter
    : hint? ident
    ;

parameters
  :
  parameter*
  ;

defnID: ident hint?;

defn
    : OP DEFN defnID SO parameters SC body=expressions CP;

idents: ident*;

arguments:
    (expression)*
    ;

let
    : OP LET SO ident expression SC body=expression CP;

fn: OP FN SO parameters SC body=expressions CP;