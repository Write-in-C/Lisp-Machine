#include "lisp_functions.h"

Object nil;

Object createInt(int i) {
    Object o;
    o.i.t = INT;
    o.i.v = i;
    return o;
}

Object createBool(int b) {
    Object o;
    o.b.t = BOOL;
    o.b.v = b;
    return o;
}

Object createElem(Object fst, Object snd) {
    Object o;
    o.e.t = ELEM;
    o.e.fst = malloc(sizeof(Object));
    o.e.snd = malloc(sizeof(Object));
    *o.e.fst = fst;
    *o.e.snd = snd;
    return o;
}

Object lisp_add(Object a, Object b) {
    if (a.t == INT && b.t == INT) {
        a.i.v = a.i.v + b.i.v;
    } else {
        if (a.t == ELEM && b.t == ELEM) {
            return lisp_add(*a.e.fst, *b.e.fst);
        }
        exit(1);
    }
    return a;
}

Object lisp_sub(Object a, Object b) {
    if (a.t == INT && b.t == INT) {
        a.i.v = a.i.v - b.i.v;
    } else {
        if (a.t == ELEM && b.t == ELEM) {
            return lisp_sub(*a.e.fst, *b.e.fst);
        }
        exit(1);
    }
    return a;
}


Object lisp_mul(Object a, Object b) {
    if (a.t == INT && b.t == INT) {
        a.i.v = a.i.v * b.i.v;
    } else {
        if (a.t == ELEM && b.t == ELEM) {
            return lisp_mul(*a.e.fst, *b.e.fst);
        }
        exit(1);
    }
    return a;
}

Object lisp_div(Object a, Object b) {
    if (a.t == INT && b.t == INT) {
        a.i.v = a.i.v / b.i.v;
    } else {
        if (a.t == ELEM && b.t == ELEM) {
            return lisp_div(*a.e.fst, *b.e.fst);
        }
        exit(1);
    }
    return a;
}

Object lisp_mod(Object a, Object b) {
    if (a.t == INT && b.t == INT) {
        a.i.v = a.i.v % b.i.v;
    } else {
        if (a.t == ELEM && b.t == ELEM) {
            return lisp_mod(*a.e.fst, *b.e.fst);
        }
        exit(1);
    }
    return a;
}

Object lisp_leq(Object a, Object b) {
    if (a.t == INT && b.t == INT) {
        return createBool(a.i.v <= b.i.v ? 1 : 0);
    }
    exit(1);
}

Object lisp_eq(Object a, Object b) {
    if (a.t == NIL) {
        if (b.t == NIL) {
            return createBool(1);
        }
        return createBool(0);
    }
    if (a.t == INT && b.t == INT) {
        return createBool(a.i.v == b.i.v ? 1 : 0);
    }
    if (a.t == ELEM && b.t == ELEM) {
        return createBool(a.e.fst->i.v == b.e.fst->i.v ? 1 : 0);
    }
    exit(1);
}

Object lisp_not(Object a) {
    if (a.t == BOOL) {
        return createBool(a.b.v ? 0 : 1);
    }
    exit(1);
}

Object lisp_list_fst(Object a) {
    if (a.t == ELEM) {
        if (a.e.fst->t == INT) {
            return createInt(a.e.fst->i.v);
        }
        exit(1);
    }
    exit(1);
}

Object lisp_list_snd(Object a) {
    if (a.t == ELEM) {
        if (a.e.snd->t == INT) {
            return createInt(a.e.snd->i.v);
        }
        return *a.e.snd;
    }
    exit(1);
}

// is not defined
void lisp_print(Object a) {
    if (a.t == NIL)return;
    if (a.t == INT) {
        printf("%d", a.i.v);
        return;
    } else {
        if (a.t == ELEM) {
            printf("(");
            if (a.e.fst != 0)
                lisp_print(*a.e.fst);
            if (a.e.snd != 0 && a.e.snd->t != NIL) {
                printf(" ");
                lisp_print(*a.e.snd);
            }
            printf(")");
            return;
        }
    }
    exit(1);
}

void lisp_printf(Object a) {
    lisp_print(a);
    printf("\n");
}
