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
      StringLookup stringLookup = new StringLookup(arena);
      MethodHandleLookup methodHandleLookup = new MethodHandleLookup(stringLookup);
      ObjectiveCRuntime runtime = new FfaObjectiveCRuntime(stringLookup, methodHandleLookup);
      Optional<ObjectiveCObject> maybeNSObjectClass = runtime.lookupClass("NSObject");
      assertTrue(maybeNSObjectClass.isPresent(), "NSObject can be looked up");
      ObjectiveCObject nsObjectClass = maybeNSObjectClass.get();
      ObjectiveCObject nsObject = nsObjectClass.msgSend("alloc").msgSend("init");
      assertNotNull(nsObject);
    }
  }

}
