package com.github.marschall.objectivej.internal;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.util.HashMap;
import java.util.Map;

public class StringLookup {

  private final Arena arena;
  private final Map<String, MemorySegment> strings;

  public StringLookup(Arena arena) {
    this.arena = arena;
    this.strings = new HashMap<>();
  }

  public MemorySegment lookupString(String string) {
    return this.strings.computeIfAbsent(string, arena::allocateFrom);
  }

}
