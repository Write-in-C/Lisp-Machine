#ifndef LISP_FUNCTIONS_H
#define LISP_FUNCTIONS_H

#include <stdio.h>
#include <malloc.h>

enum Type {
    INT, BOOL
};

struct Int {
    enum Type t;
    int v;
};

struct Bool {
    enum Type t;
    int v;
};

union Object {
    enum Type t;
    struct Int i;
    struct Bool b;
};

typedef union Object Object;

Object createInt(int n);

Object createBool(int b);

Object lisp_add(Object a, Object b);

Object lisp_sub(Object a, Object b);

Object lisp_mul(Object a, Object b);

Object lisp_div(Object a, Object b);

Object lisp_mod(Object a, Object b);

Object lisp_leq(Object a, Object b);

Object lisp_eq(Object a, Object b);

Object lisp_not(Object a);

void lisp_printf(Object a);

#endif
