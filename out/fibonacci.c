#include <stdio.h>
#include <malloc.h>
#include "lisp_functions.h"

Object fibonacci(Object N) {
    return lisp_leq(N, createInt(1)).b.v == 1 ? createInt(1) : lisp_add(fibonacci(lisp_sub(N, createInt(1))), fibonacci(lisp_sub(N, createInt(2))));
}

int main() {
    nil.t = NIL;
    lisp_printf(fibonacci(createInt(20)));
    return 0;
}

