CC=gcc
CFLAGS=-c -Wall
LIBNAME=liblisp_functions.a
BUILD_DIR=../../../../out/library
HEADERS_DIR=../../../../out/library

all: $(BUILD_DIR)/$(LIBNAME)

$(BUILD_DIR)/$(LIBNAME): lisp_functions.o
	mkdir -p $(BUILD_DIR) $(HEADERS_DIR)
	ar rcs $(BUILD_DIR)/$(LIBNAME) lisp_functions.o
	cp lisp_functions.h $(HEADERS_DIR)

lisp_functions.o: lisp_functions.c lisp_functions.h
	$(CC) $(CFLAGS) lisp_functions.c -o lisp_functions.o

clean:
	rm -f *.o $(BUILD_DIR)/$(LIBNAME)
	rm -rf $(HEADERS_DIR) $(BUILD_DIR)
