#include <stdlib.h>
#include <stdio.h>
#include "lisp_functions.h"

#define t1 createInt(0)
#define k0 createInt(1)
Object factorial(Object n) {
    return lisp_eq(n, t1).b.v == 1 ? k0 : lisp_mul(n, factorial(lisp_sub(n, k0)));
}

int main() {
    lisp_print_0(factorial(createInt(10)));
    lisp_print_0(factorial(createInt(5)));
    lisp_print_0(factorial(createInt(7)));
    return 0;
}

