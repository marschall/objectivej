package com.github.marschall.objectivej.internal;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.github.marschall.objectivej.header.MsgSend;
import com.github.marschall.objectivej.header.ObjCRuntime;

class MethodHandleLookup {
  
  private final StringLookup stringLookup;
  private final List<MethodHandle> invokers;
  private final SelectorLookup selectorLookup;

  MethodHandleLookup(StringLookup stringLookup, SelectorLookup selectorLookup) {
    this.stringLookup = stringLookup;
    this.selectorLookup = selectorLookup;
    this.invokers = new ArrayList<>();
  }

  public MemorySegment lookupSelector(String selector) {
    return this.selectorLookup.lookupString(selector);
  }

  public MethodHandle lookupInvoker(int varargCount) {
    // TODO shortcut 0
    while (this.invokers.size() <= varargCount) {
      this.invokers.add(null);
    }
    MethodHandle invoker = this.invokers.get(varargCount);
    if (invoker == null) {
      // FIXME not for numbers, string, boolean
      MemoryLayout[] layouts = new MemoryLayout[varargCount];
      Arrays.fill(layouts, ObjCRuntime.C_POINTER);
      invoker = MsgSend.objc_msgSend.makeInvoker(layouts).handle();
      this.invokers.set(varargCount, invoker);
    }
    return invoker;
  }

  public MemorySegment lookupString(String s) {
    return this.stringLookup.lookupString(s);
  }

}
