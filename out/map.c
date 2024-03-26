#include <stdio.h>
#include <malloc.h>
#include "lisp_functions.h"

Object f0(Object n) {
    return lisp_add(n, createInt(42));
}

Object map(Object (*foo)(Object), Object xs) {
    return lisp_eq(nil, xs).b.v == 1 ? nil : createElem((*foo)(lisp_list_fst(xs)), map(foo, lisp_list_snd(xs)));
}

int main() {
    nil.t = NIL;
    lisp_printf(map(f0, createElem(createInt(1), createElem(createInt(2), createElem(createInt(3), createElem(createInt(4), createElem(createInt(5), nil)))))));
    return 0;
}

