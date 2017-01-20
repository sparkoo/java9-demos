#!/usr/bin/env bash
source ../j9.sh

JAVA=${JAVA_HOME}/bin/java
JAVAC=${JAVA_HOME}/bin/javac

OUT_DIR=out

rm -rf ${OUT_DIR} && mkdir ${OUT_DIR}

printf "build .......... "
if
    ${JAVAC} -d ${OUT_DIR} \
        --module-source-path src \
        $( find . -name '*.java' )
then
    printf "done\n"
else
    printf "fail\n"
    exit 1
fi


printf "running java ........ \n\n"
${JAVA} --module-path ${OUT_DIR} -m app/cz.sparko.j9demo.app.Main
printf "\n................ done\n"