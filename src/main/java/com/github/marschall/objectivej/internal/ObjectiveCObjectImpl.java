package com.github.marschall.objectivej.internal;

import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import com.github.marschall.objectivej.api.ObjectiveCObject;

class ObjectiveCObjectImpl implements ObjectiveCObject {
  
  private final MemorySegment self;
  private final MethodHandleLookup methodHandleLookup;

  ObjectiveCObjectImpl(MemorySegment self, MethodHandleLookup methodHandleLookup) {
    this.self = self;
    this.methodHandleLookup = methodHandleLookup;
  }

  @Override
  public ObjectiveCObject msgSend(String selector, Object... arguments) {
    MemorySegment op = this.methodHandleLookup.lookupSelector(selector);
    // TODO could be null
    MemorySegment result;
    try {
      if (arguments.length == 0) {
        result = invokeWithoutArguments(op);
      } else {
        result = invokeWithArguments(op, arguments);
      }
    } catch(IllegalArgumentException | ClassCastException e)  {
        throw e; // rethrow IAE from passing wrong number/type of args
    } catch (Throwable e) {
       throw new AssertionError("should not reach here", e);
    }
    // TODO null
    if (result.equals(this.self)) {
      return this;
    } else {
      return new ObjectiveCObjectImpl(result, this.methodHandleLookup);
    }
  }

  private MemorySegment invokeWithoutArguments(MemorySegment op) throws Throwable {
    MethodHandle invoker = this.methodHandleLookup.lookupInvoker(0);
    return (MemorySegment) invoker.invoke(this.self, op);
  }

  private MemorySegment invokeWithArguments(MemorySegment op, Object[] arguments) throws Throwable {
    MemorySegment[] callArguments = makeCallArguments(arguments);
    MethodHandle invoker = this.methodHandleLookup.lookupInvoker(arguments.length);
    return (MemorySegment) invoker.invoke(this.self, op, callArguments);
  }

  private MemorySegment[] makeCallArguments(Object... arguments) {
    MemorySegment[] callArguments = new MemorySegment[arguments.length];
    for (int i = 0; i < arguments.length; i++) {
      callArguments[i] = makeCallArgument(arguments[i]);

    }
    return callArguments;
  }

  private MemorySegment makeCallArgument(Object object) {
    if (object instanceof ObjectiveCObjectImpl other) {
      return other.self;
    } else if (object instanceof String s) {
        return this.methodHandleLookup.lookupString(s);
    } else {
      throw new AssertionError("should not reach here");
    }
  }

}
