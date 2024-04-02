#include "lisp_functions.h"

Object f0(Object n) {
    return lisp_eq(n, createInt(5));
}

Object filter(Object (*foo)(Object), Object xs) {
    return lisp_eq(xs, nil).b.v == 1 ? nil : (*foo)(lisp_list_fst(xs)).b.v == 1 ? createElem(lisp_list_fst(xs), filter(foo, lisp_list_snd(xs))) : filter(foo, lisp_list_snd(xs));
}

int main() {
    nil.t = NIL;
    lisp_printf(filter(f0, createElem(createInt(1), createElem(createInt(2), createElem(createInt(3), createElem(createInt(4), createElem(createInt(5), createInt(6))))))));
    return 0;
}

