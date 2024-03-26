#ifndef LISP_FUNCTIONS_H
#define LISP_FUNCTIONS_H

#include <stdio.h>
#include <malloc.h>

enum Type {
    INT, BOOL, ELEM, FUNC, NIL
};

struct Int {
    enum Type t;
    int v;
};

struct Bool {
    enum Type t;
    int v;
};

struct Elem {
    enum Type t;
    union Object * fst;
    union Object * snd;
};

struct Func {
    enum Type t;
    void *f;
};


union Object {
    enum Type t;
    struct Int i;
    struct Bool b;
    struct Elem e;
    struct Func f;
};

typedef union Object Object;

Object createInt(int i);

Object createBool(int b);

Object createElem(Object fst, Object snd);

Object lisp_add(Object a, Object b);

Object lisp_sub(Object a, Object b);

Object lisp_mul(Object a, Object b);

Object lisp_div(Object a, Object b);

Object lisp_mod(Object a, Object b);

Object lisp_leq(Object a, Object b);

Object lisp_eq(Object a, Object b);

Object lisp_not(Object a);

Object lisp_list_fst(Object a);

Object lisp_list_snd(Object b);

void lisp_printf(Object a);

#endif /* LISP_FUNCTIONS_H */
