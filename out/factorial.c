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

double lisp_add(ClojureValue a, ClojureValue b) {
    // some exception needs to be thrown
    if (a.type != INT || b.type != INT) return -1;
    return (int) a.value + (int) b.value;
}

double lisp_sub(ClojureValue a, ClojureValue b) {
    if (a.type != INT || b.type != INT) return -1;
    return (int) a.value - (int) b.value;
}

double lisp_mul(ClojureValue a, ClojureValue b) {
    if (a.type != INT || b.type != INT) return -1;
    return (int) a.value * (int) b.value;
}

double lisp_div(ClojureValue a, ClojureValue b) {
    if (a.type != INT || b.type != INT) return -1;
    return (int) a.value / (int) b.value;
}


int lisp_factorial(null n) {
return lisp_eq(n, 0) ? 1 : lisp_mul(n, factorial(lisp_sub(n, 1)))
}

