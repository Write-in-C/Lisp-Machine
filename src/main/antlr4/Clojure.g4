grammar Clojure;

import Lexer;

program : expression* EOF {#include <stdio.h>
};
expression: OP PLUS NUMBER+ CP;


