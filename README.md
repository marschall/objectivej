Objective-J
===========

A prototype Java interface for Objective-C using [Foreign Function and Memory (FFM) API](https://docs.oracle.com/en/java/javase/23/core/foreign-function-and-memory-api.html).

Far from complete or production ready.

Usage
-----

```java
ObjectiveCRuntime runtime = ..;
ObjectiveCObject nsObjectClass = runtime.lookupClass("NSObject").get();
ObjectiveCObject nsObject = nsObjectClass.msgSend("alloc").msgSend("init");
```


Resources
---------

https://cocoasamurai.blogspot.com/2010/01/understanding-objective-c-runtime.html

https://www.mikeash.com/pyblog/friday-qa-2009-05-22-objective-c-class-loading-and-initialization.html

https://developer.apple.com/library/archive/documentation/Cocoa/Conceptual/ObjCRuntimeGuide/Articles/ocrtInteracting.html#//apple_ref/doc/uid/TP40008048-CH103-SW1

https://gcc.gnu.org/onlinedocs/gcc/Modern-GNU-Objective-C-runtime-API.html

#define OBJC_EXPORT  OBJC_EXTERN OBJC_VISIBLE

OBJC_EXTERN extern

https://stackoverflow.com/questions/21843500/obj-msgsend-function-pointer-crash-when-build-with-64bit-arm64

/System/Volumes/Data/Library/Developer/CommandLineTools/SDKs/MacOSX.sdk/System/Library/Frameworks/Foundation.framework/Versions/Current/Headers

clang -cc1 -ast-dump -fblocks -x objective-c /System/Volumes/Data/Library/Developer/CommandLineTools/SDKs/MacOSX.sdk/System/Library/Frameworks/Foundation.framework/Versions/Current/Headers/NSObject.h
