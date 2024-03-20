#include <stdlib.h>
#include <stdio.h>
#include "lisp_functions.h"

int factorial1(int n) {
    return lisp_eq_int(n, 0) ? 1 : lisp_mul(n, factorial1(lisp_sub_int(n, 1)));
}
int fac_helper(int n, int acc) {
    return lisp_eq_int(1, n) ? acc : fac_helper(lisp_sub_int(n, 1), lisp_mul_int(acc, n));
}
int factorial(int n) {
    return fac_helper(n, 1);
}
int fibonacci(int N) {
    return lisp_leq_int(N, 1) ? 1 : lisp_add(fibonacci(lisp_sub_int(N, 1)), fibonacci(lisp_sub_int(N, 2)));
}
int sum(int a, int b) {
    return lisp_add_int(a, b);
}
int tribonacci(int N) {
    return lisp_leq_int(N, 2) ? 1 : lisp_add(lisp_add(tribonacci(lisp_sub_int(N, 1)), tribonacci(lisp_sub_int(N, 2))), tribonacci(lisp_sub_int(N, 3)));
}

