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
    Object[] callArguments = makeCallArguments(op, arguments);
    MethodHandle invoker = this.methodHandleLookup.lookupInvoker(arguments == null ? 0 : arguments.length);
    // TODO could be null
    MemorySegment result;
    try {
      result = (MemorySegment) invoker.invoke(callArguments);
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
  
  private Object[] makeCallArguments(MemorySegment op, Object... arguments) {
    Object[] callArguments = new Object[arguments.length + 2];
    callArguments[0] = this.self;
    callArguments[1] = op;
    for (int i = 0; i < arguments.length; i++) {
      callArguments[i + 2] = makeCallArgument(arguments[i]);
      
    }
    return callArguments;
  }

  private Object makeCallArgument(Object object) {
    if (object instanceof ObjectiveCObjectImpl other) {
      return other.self;
    } else if (object instanceof String s) {
        return this.methodHandleLookup.lookupString(s);
    } else {
      return object;
    }
  }

}
