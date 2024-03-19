#include <stdlib.h>
#include <stdio.h>
#include "lisp_functions.h"

int factorial(int n) {
    return lisp_eq_int(n, 0) ? 1 : lisp_mul_int(n, factorial(lisp_sub_int(n, 1)));
}

