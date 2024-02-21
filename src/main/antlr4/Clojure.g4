grammar Clojure;

import Lexer;

@members {
//  MakeGenerator gen;
//  public MakeParser(TokenStream input, MakeGenerator gen) {
//  super(input);
//  this.gen = gen;
//  }
}

program : filename expressions EOF;

filename : OP NS IDENT CP;

expressions : expression*;

expression
    : list
    | atom
    | if
    | defn // for now
    ;

list : OP expressions CP;

atom
    : number
    | ident
//    | defn
//    | symbol
//    | keyword
    | boolean
    | nil
    | arithmetics
    ;

number: DECIMAL; // Add more types

ident: IDENT;

boolean: BOOLEAN;

nil : NIL;

arithmetics
    : EQ
    | MUL
    | SUB
    ;

if : OP IF expression expression expression CP;

defn
    : OP DEFN ident SO idents SC expressions CP;

idents: ident*;