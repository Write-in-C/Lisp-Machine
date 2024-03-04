#include <stdlib.h>

typedef enum {
    INT,
    LONG,
    FLOAT,
    DOUBLE,
    CHAR,
    POINTER
    //...
} ValueType;


typedef struct {
    ValueType type;
    void *value;
} ClojureValue;

ClojureValue lisp_add(ClojureValue a, ClojureValue b) {
    // some exception needs to be thrown
    if (a.type != INT || b.type != INT) exit(1);
    a.value = (void *) ((int) a.value + (int) b.value);
    return a;
}

ClojureValue lisp_neg(ClojureValue a) {
    if (a.type != INT) exit(1);
    a.value = (void *) -(int) a.value;
    return a;
}

ClojureValue lisp_sub(ClojureValue a, ClojureValue b) {
    if (a.type != INT || b.type != INT) exit(1);
    return lisp_add(a, lisp_neg(b));
}

ClojureValue lisp_mul(ClojureValue a, ClojureValue b) {
    if (a.type != INT || b.type != INT)exit(1);
    a.value = (void *) ((int) a.value * (int) b.value);
    return a;
}

ClojureValue lisp_div(ClojureValue a, ClojureValue b) {
    if (a.type != INT || b.type != INT) exit(1);
    a.value = (void *) ((int) a.value / (int) b.value);
    return a;
}
