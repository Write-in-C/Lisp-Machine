#include <stdio.h>
#include <malloc.h>
#include "lisp_functions.h"

Object tribonacci(Object N) {
    return lisp_leq(N, createInt(2)).b.v == 1 ? createInt(1) : lisp_add(lisp_add(tribonacci(lisp_sub(N, createInt(1))), tribonacci(lisp_sub(N, createInt(2)))), tribonacci(lisp_sub(N, createInt(3))));
}

int main() {
    lisp_printf(tribonacci(createInt(5)));
    return 0;
}

