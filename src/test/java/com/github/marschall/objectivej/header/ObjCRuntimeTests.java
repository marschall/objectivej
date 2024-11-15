package com.github.marschall.objectivej.header;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;

import org.junit.jupiter.api.Test;

class ObjCRuntimeTests {

  @Test
  void lookupClass() {
    try (Arena arena = Arena.ofConfined()) {
      MemorySegment nsObjectString = arena.allocateFrom("NSObject");
      MemorySegment nsObjectClass = ObjCRuntime.objc_getClass(nsObjectString);
      assertNotNull(nsObjectClass);
    }
  }

}
