#include <stdio.h>
#include <malloc.h>
#include "lisp_functions.h"

#define b1 createInt(10)
#define a0 createInt(5)
Object sum_with_let() {
    return lisp_add(a0, b1);
}

int main() {
    nil.t = NIL;
    lisp_printf(sum_with_let());
    return 0;
}

