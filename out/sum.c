#include <stdio.h>
#include <malloc.h>
#include "lisp_functions.h"

Object sum(Object a, Object b) {
    return lisp_add(a, b);
}

int main() {
    lisp_printf(sum(createInt(15), createInt(27)));
    return 0;
}

