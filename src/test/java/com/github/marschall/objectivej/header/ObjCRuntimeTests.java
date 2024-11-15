package com.github.marschall.objectivej.header;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;

import org.junit.jupiter.api.Test;

import com.github.marschall.objectivej.internal.ClassLookup;
import com.github.marschall.objectivej.internal.StringLookup;

class ObjCRuntimeTests {
  
  @Test
  void lowLevel() {
    try (Arena arena = Arena.ofConfined()) {
      MemorySegment nsObjectString = arena.allocateFrom("NSObject");
      MemorySegment nsObjectClass = ObjCRuntime.objc_getClass(nsObjectString);
      assertNotNull(nsObjectClass);
    }
  }

  @Test
  void abstracted() {
    try (Arena arena = Arena.ofConfined()) {
      StringLookup stringLookup = new StringLookup(arena);
      ClassLookup classLookup = new ClassLookup(stringLookup);
      Object nsObjectClass = classLookup.lookupClass("NSObject");
      assertNotNull(nsObjectClass);
    }
  }

}
