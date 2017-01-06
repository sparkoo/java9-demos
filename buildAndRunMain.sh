#!/usr/bin/env bash

rm -rf out && mkdir out

${JAVAC} -d out src/Main.java
${JAVA} -cp out Main