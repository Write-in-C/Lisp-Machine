#include "lisp_functions.h"

Object list() {
    return createElem(createInt(1), createElem(createInt(2), createElem(createInt(3), createElem(createInt(4), createElem(createInt(5), nil)))));
}

int main() {
    nil.t = NIL;
    lisp_printf(list());
    return 0;
}

