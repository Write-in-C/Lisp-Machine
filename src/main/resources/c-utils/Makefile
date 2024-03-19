CC=gcc
CFLAGS=-c -Wall

all: liblisp_functions.a

liblisp_functions.a: lisp_functions.o
	ar rcs liblisp_functions.a lisp_functions.o

lisp_functions.o: lisp_functions.c lisp_functions.h
	$(CC) $(CFLAGS) lisp_functions.c -o lisp_functions.o

clean:
	rm -f *.o *.a
