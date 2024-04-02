#include "lisp_functions.h"

Object f0(Object n, Object k) {
    return lisp_mul(n, k);
}

Object reduce(Object (*foo)(Object), Object acc, Object xs) {
    return lisp_eq(nil, xs).b.v == 1 ? acc : reduce(foo, (*foo)(lisp_list_snd(xs), acc), lisp_list_snd(xs));
}

int main() {
    nil.t = NIL;
    lisp_printf(reduce(f0, createInt(1), createElem(createInt(1), createElem(createInt(2), createElem(createInt(3), createElem(createInt(4), createElem(createInt(5), nil)))))));
    return 0;
}

