package com.github.marschall.objectivej.internal;

import java.lang.foreign.MemorySegment;
import java.util.HashMap;
import java.util.Map;

import com.github.marschall.objectivej.header.ObjCRuntime;

public class ClassLookup {

  private final StringLookup stringLookup;
  
  private final Map<String, Object> classes;

  public ClassLookup(StringLookup stringLookup) {
    this.stringLookup = stringLookup;
    this.classes = new HashMap<>();
  }

  public Object lookupClass(String className) {
    return this.classes.computeIfAbsent(className, key -> {
      MemorySegment classNameString = this.stringLookup.lookupString(className);
      return ObjCRuntime.objc_getClass(classNameString);
    });
  }

}
