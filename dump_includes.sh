#!/bin/sh

set -u
set -e

JEXTRACT_HOME=${HOME}/Hacking/jextract/jextract-22

${JEXTRACT_HOME}/bin/jextract \
  --output src/main/java \
  --target-package com.github.marschall.objectivej.header \
  --header-class-name ObjCRuntime \
  -l objc \
  -I /System/Volumes/Data/Library/Developer/CommandLineTools/SDKs/MacOSX.sdk/usr/include \
  --dump-includes src/include/includes.txt \
  src/include/objc-all.h
