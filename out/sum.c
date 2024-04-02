#include "lisp_functions.h"

Object sum(Object a, Object b) {
    return lisp_add(a, b);
}

int main() {
    nil.t = NIL;
    lisp_printf(sum(createInt(15), createInt(27)));
    return 0;
}

