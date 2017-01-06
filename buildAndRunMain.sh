#!/usr/bin/env bash

rm -rf out && mkdir out

${JAVAC} -d out $( find . -name "*.java" )
${JAVA} -cp out Main