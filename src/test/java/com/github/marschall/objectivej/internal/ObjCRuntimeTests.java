package com.github.marschall.objectivej.internal;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.util.Optional;

import org.junit.jupiter.api.Test;

import com.github.marschall.objectivej.api.ObjectiveCObject;
import com.github.marschall.objectivej.api.ObjectiveCRuntime;
import com.github.marschall.objectivej.header.ObjCRuntime;

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
      ObjectiveCRuntime runtime = setupRuntime(arena);
      Optional<ObjectiveCObject> maybeNSObjectClass = runtime.lookupClass("NSObject");
      assertTrue(maybeNSObjectClass.isPresent(), "NSObject can be looked up");
      ObjectiveCObject nsObjectClass = maybeNSObjectClass.get();
      ObjectiveCObject nsObject = nsObjectClass.msgSend("alloc").msgSend("init");
      assertNotNull(nsObject);
    }
  }

  private ObjectiveCRuntime setupRuntime(Arena arena) {
    StringLookup stringLookup = new StringLookup(arena);
    SelectorLookup selectorLookup = new SelectorLookup(stringLookup);
    MethodHandleLookup methodHandleLookup = new MethodHandleLookup(stringLookup, selectorLookup);
    ObjectiveCRuntime runtime = new FfaObjectiveCRuntime(stringLookup, methodHandleLookup);
    return runtime;
  }

}
