package com.github.marschall.objectivej.internal;

import java.lang.foreign.MemorySegment;
import java.util.HashMap;
import java.util.Map;

import com.github.marschall.objectivej.header.ObjCRuntime;

public class SelectorLookup {

  private final StringLookup stringLookup;
  private final Map<String, MemorySegment> selectors;

  public SelectorLookup(StringLookup stringLookup) {
    this.stringLookup = stringLookup;
    this.selectors = new HashMap<>();
  }

  public MemorySegment lookupString(String string) {
    return this.selectors.computeIfAbsent(string, key -> {
      MemorySegment str = this.stringLookup.lookupString(string);
      return ObjCRuntime.sel_registerName(str);
    });
  }

}
