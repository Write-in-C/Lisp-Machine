CC=gcc
CFLAGS=-Ilibrary
LDFLAGS=-Llibrary
LIBS=-llisp_functions
BUILD_DIR=build

all: $(BUILD_DIR)/main

$(BUILD_DIR)/main: main.o
	mkdir -p $(BUILD_DIR)
	$(CC) $(LDFLAGS) $^ -o $@ $(LIBS)

main.o: factorial.c
	$(CC) $(CFLAGS) -c $< -o $@

clean:
	rm -f *.o $(BUILD_DIR)/main
