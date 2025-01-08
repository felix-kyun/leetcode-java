#!/usr/bin/env bash

BUILD=bin
SRC=src/main/java

javac -d "$BUILD" -sourcepath "$SRC" "$SRC"/problems/"$1".java
java -cp "$BUILD" "problems.$1"
