#include "lisp_functions.h"

#define b1 createInt(15)
#define a0 createInt(27)
Object sum_with_let() {
    return lisp_add(a0, b1);
}

int main() {
    nil.t = NIL;
    lisp_printf(sum_with_let());
    return 0;
}

