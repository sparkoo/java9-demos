#!/usr/bin/env bash

JAVA=${JAVA_HOME}/bin/java
JAVAC=${JAVA_HOME}/bin/javac

OUT_DIR=out

rm -rf ${OUT_DIR} && mkdir ${OUT_DIR}

${JAVAC} -d ${OUT_DIR} $( find . -name "*.java" )
${JAVA} -cp ${OUT_DIR} Main