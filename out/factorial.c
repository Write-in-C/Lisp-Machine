#include <stdio.h>
#include <malloc.h>
#include "lisp_functions.h"

#define t1 createInt(0)
#define k0 createInt(1)
Object factorial(Object n) {
    return lisp_eq(n, t1).b.v == 1 ? k0 : lisp_mul(n, factorial(lisp_sub(n, k0)));
}

int main() {
    nil.t = NIL;
    lisp_printf(factorial(createInt(10)));
    lisp_printf(factorial(createInt(5)));
    lisp_printf(factorial(createInt(7)));
    return 0;
}

