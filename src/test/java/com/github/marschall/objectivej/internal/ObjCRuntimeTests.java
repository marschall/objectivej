package com.github.marschall.objectivej.internal;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import java.util.Optional;

import org.junit.jupiter.api.Test;

import com.github.marschall.objectivej.api.ObjectiveCObject;
import com.github.marschall.objectivej.api.ObjectiveCRuntime;
import com.github.marschall.objectivej.header.MsgSend;
import com.github.marschall.objectivej.header.ObjCRuntime;

class ObjCRuntimeTests {
  
  @Test
  void lowLevel() throws Throwable {
    try (Arena arena = Arena.ofConfined()) {
      MemorySegment nsObjectString = arena.allocateFrom("NSObject");
      MemorySegment nsObjectClass = ObjCRuntime.objc_getClass(nsObjectString);
      MemorySegment allocString = arena.allocateFrom("alloc");
      MemorySegment allocSelector = ObjCRuntime.sel_registerName(allocString);
      MethodHandle invoker = MsgSend.objc_msgSend.makeInvoker().handle();

      MemorySegment result = (MemorySegment) invoker.invokeExact(nsObjectClass, allocSelector);
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
