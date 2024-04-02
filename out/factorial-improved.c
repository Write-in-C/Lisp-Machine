#include "lisp_functions.h"

Object helper(Object n, Object acc) {
    return lisp_eq(createInt(1), n).b.v == 1 ? acc : helper(lisp_sub(n, createInt(1)), lisp_mul(acc, n));
}
Object factorial(Object n) {
    return helper(n, createInt(1));
}

int main() {
    nil.t = NIL;
    lisp_printf(factorial(createInt(10)));
    return 0;
}

