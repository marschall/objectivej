package com.github.marschall.objectivej.header;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.Linker;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

public class MsgSend {
  

  /**
   * Variadic invoker class for:
   * {@snippet lang=c :
   * extern id  _Nullable objc_msgSend(id  _Nullable self, SEL  _Nonnull op, ...)
   * }
   */
  public static class objc_msgSend {
      private static final FunctionDescriptor BASE_DESC = FunctionDescriptor.of(
              ObjCRuntime.C_POINTER,
              ObjCRuntime.C_POINTER,
              ObjCRuntime.C_POINTER
          );
      private static final MemorySegment ADDR = ObjCRuntime.findOrThrow("objc_msgSend");

      private final MethodHandle handle;
      private final FunctionDescriptor descriptor;
      private final MethodHandle spreader;

      private objc_msgSend(MethodHandle handle, FunctionDescriptor descriptor, MethodHandle spreader) {
          this.handle = handle;
          this.descriptor = descriptor;
          this.spreader = spreader;
      }

      /**
       * Variadic invoker factory for:
       * {@snippet lang=c :
       * extern id  _Nullable objc_msgSend(id  _Nullable self, SEL  _Nonnull op, ...)
       * }
       */
      public static objc_msgSend makeInvoker(MemoryLayout... layouts) {
          FunctionDescriptor desc$ = BASE_DESC.appendArgumentLayouts(layouts);
          Linker.Option fva$ = Linker.Option.firstVariadicArg(BASE_DESC.argumentLayouts().size());
          var mh$ = Linker.nativeLinker().downcallHandle(ADDR, desc$, fva$);
          var spreader$ = mh$.asSpreader(Object[].class, layouts.length);
          return new objc_msgSend(mh$, desc$, spreader$);
      }

      /**
       * {@return the address}
       */
      public static MemorySegment address() {
          return ADDR;
      }

      /**
       * {@return the specialized method handle}
       */
      public MethodHandle handle() {
          return handle;
      }

      /**
       * {@return the specialized descriptor}
       */
      public FunctionDescriptor descriptor() {
          return descriptor;
      }

      public MemorySegment apply(MemorySegment self, MemorySegment op, Object... x2) {
          try {
              if (ObjCRuntime.TRACE_DOWNCALLS) {
                ObjCRuntime.traceDowncall("objc_msgSend", self, op, x2);
              }
              return (MemorySegment) spreader.invokeExact(self, op, x2);
          } catch(IllegalArgumentException | ClassCastException ex$)  {
              throw ex$; // rethrow IAE from passing wrong number/type of args
          } catch (Throwable ex$) {
             throw new AssertionError("should not reach here", ex$);
          }
      }
  }

}
