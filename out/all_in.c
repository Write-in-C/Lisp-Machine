#include "lisp_functions.h"

#define t1 createInt(0)
#define k0 createInt(1)
Object f2(Object n) {
    return lisp_eq(n, createInt(5));
}

Object g3(Object n) {
    return lisp_mul(n, createInt(777));
}

#define b5 createInt(15)
#define a4 createInt(27)
Object factorial(Object n) {
    return lisp_eq(n, t1).b.v == 1 ? k0 : lisp_mul(n, factorial(lisp_sub(n, k0)));
}
Object helper(Object n, Object acc) {
    return lisp_eq(createInt(1), n).b.v == 1 ? acc : helper(lisp_sub(n, createInt(1)), lisp_mul(acc, n));
}
Object factorial_improved(Object n) {
    return helper(n, createInt(1));
}
Object fibonacci(Object N) {
    return lisp_leq(N, createInt(1)).b.v == 1 ? createInt(1) : lisp_add(fibonacci(lisp_sub(N, createInt(1))), fibonacci(lisp_sub(N, createInt(2))));
}
Object filter(Object (*foo)(Object), Object xs) {
    return lisp_eq(xs, nil).b.v == 1 ? nil : (*foo)(lisp_list_fst(xs)).b.v == 1 ? createElem(lisp_list_fst(xs), filter(foo, lisp_list_snd(xs))) : filter(foo, lisp_list_snd(xs));
}
Object list() {
    return createElem(createInt(1), createElem(createInt(2), createElem(createInt(3), createElem(createInt(4), createElem(createInt(5), nil)))));
}
Object map(Object (*foo)(Object), Object xs) {
    return lisp_eq(nil, xs).b.v == 1 ? nil : createElem((*foo)(lisp_list_fst(xs)), map(foo, lisp_list_snd(xs)));
}
Object sum(Object a, Object b) {
    return lisp_add(a, b);
}
Object sum_with_let() {
    return lisp_add(a4, b5);
}
Object tribonacci(Object N) {
    return lisp_leq(N, createInt(2)).b.v == 1 ? createInt(1) : lisp_add(lisp_add(tribonacci(lisp_sub(N, createInt(1))), tribonacci(lisp_sub(N, createInt(2)))), tribonacci(lisp_sub(N, createInt(3))));
}

int main() {
    nil.t = NIL;
    lisp_printf(factorial(createInt(10)));
    lisp_printf(factorial(createInt(5)));
    lisp_printf(factorial(createInt(7)));
    lisp_printf(factorial_improved(createInt(10)));
    lisp_printf(fibonacci(createInt(20)));
    lisp_printf(filter(f2, createElem(createInt(1), createElem(createInt(2), createElem(createInt(3), createElem(createInt(4), createElem(createInt(5), createInt(6))))))));
    lisp_printf(list());
    lisp_printf(map(g3, createElem(createInt(1), createElem(createInt(2), createElem(createInt(3), createElem(createInt(4), createElem(createInt(5), nil)))))));
    lisp_printf(sum(createInt(15), createInt(27)));
    lisp_printf(sum_with_let());
    lisp_printf(tribonacci(createInt(5)));
    return 0;
}

