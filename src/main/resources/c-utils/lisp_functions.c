#include "lisp_functions.h"

Object createInt(int n) {
    Object v;
    v.i.t = INT;
    v.i.v = n;
    return v;
}

Object createBool(int b) {
    Object v;
    v.b.t = BOOL;
    v.b.v = b;
    return v;
}

Object lisp_add(Object a, Object b) {
    if (a.t == INT && b.t == INT) {
        a.i.v = a.i.v + b.i.v;
    } else {
        exit(1);
    }
    return a;
}

Object lisp_sub(Object a, Object b) {
    if (a.t == INT && b.t == INT) {
        a.i.v = a.i.v - b.i.v;
    } else {
        exit(1);
    }
    return a;
}


Object lisp_mul(Object a, Object b) {
    if (a.t == INT && b.t == INT) {
        a.i.v = a.i.v * b.i.v;
    } else {
        exit(1);
    }
    return a;
}

Object lisp_div(Object a, Object b) {
    if (a.t == INT && b.t == INT) {
        a.i.v = a.i.v / b.i.v;
    } else {
        exit(1);
    }
    return a;
}

Object lisp_mod(Object a, Object b) {
    if (a.t == INT && b.t == INT) {
        a.i.v = a.i.v % b.i.v;
    } else {
        exit(1);
    }
    return a;
}

Object lisp_leq(Object a, Object b){
    if (a.t == INT && b.t == INT) {
        return createBool(a.i.v <= b.i.v ? 1 : 0);
    }
    exit(1);
}

Object lisp_eq(Object a, Object b) {
    if (a.t == INT && b.t == INT) {
        return createBool(a.i.v == b.i.v ? 1 : 0);
    }
    exit(1);
}

Object lisp_not(Object a) {
    if (a.t == BOOL) {
        return createBool(a.b.v ? 0 : 1);
    }
    exit(1);
}

// is not defined
void lisp_print(Object a) {
    if (a.t == INT) {
        printf("%d ", a.i.v);
    } else {
        exit(1);
    }
}

void lisp_printf(Object a) {
    lisp_print(a);
    printf("\n");
}
