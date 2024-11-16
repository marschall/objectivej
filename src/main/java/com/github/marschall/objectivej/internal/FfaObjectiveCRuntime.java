package com.github.marschall.objectivej.internal;

import java.lang.foreign.MemorySegment;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import com.github.marschall.objectivej.api.ObjectiveCObject;
import com.github.marschall.objectivej.api.ObjectiveCRuntime;
import com.github.marschall.objectivej.header.ObjCRuntime;

final class FfaObjectiveCRuntime implements ObjectiveCRuntime {

  private final StringLookup stringLookup;
  
  private final Map<String, ObjectiveCObject> classes;

  private final MethodHandleLookup methodHandleLookup;

  public FfaObjectiveCRuntime(StringLookup stringLookup, MethodHandleLookup methodHandleLookup) {
    this.stringLookup = stringLookup;
    this.methodHandleLookup = methodHandleLookup;
    this.classes = new HashMap<>();
  }

  @Override
  public Optional<ObjectiveCObject> lookupClass(String className) {
    ObjectiveCObject clazzObject = this.classes.get(className);
    if (clazzObject != null) {
      return Optional.of(clazzObject);
    }
    MemorySegment classNameString = this.stringLookup.lookupString(className);
    MemorySegment clazz = ObjCRuntime.objc_getClass(classNameString);
    if (clazz.equals(ObjCRuntime.nil())) {
      return Optional.empty();
    }
    clazzObject = new ObjectiveCObjectImpl(clazz, this.methodHandleLookup);
    this.classes.put(className, clazzObject);
    return Optional.of(clazzObject);
  }

}
