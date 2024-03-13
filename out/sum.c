#include <stdlib.h>
#include <stdio.h>

int lisp_add_int(int a, int b) {
    return a + b;
}

int lisp_neg_int(int a) {
    return -a;
}

int lisp_sub_int(int a, int b) {
    return a - b;
}

int lisp_mul_int(int a, int b) {
    return a * b;
}

int lisp_div_int(int a, int b) {
    return a / b;
}

int lisp_eq_int(int a, int b) {
    return a == b;
}

int sum(int a, int b) {
    return lisp_add_int(a, b);
}

