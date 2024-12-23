// Generated by jextract

package com.github.marschall.objectivej.header;

import java.lang.invoke.*;
import java.lang.foreign.*;
import java.nio.ByteOrder;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * typedef BOOL (*objc_hook_getClass)(const char * _Nonnull, Class  _Nullable * _Nonnull)
 * }
 */
public class objc_hook_getClass {

    objc_hook_getClass() {
        // Should not be called directly
    }

    /**
     * The function pointer signature, expressed as a functional interface
     */
    public interface Function {
        boolean apply(MemorySegment name, MemorySegment outClass);
    }

    private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
        ObjCRuntime.C_BOOL,
        ObjCRuntime.C_POINTER,
        ObjCRuntime.C_POINTER
    );

    /**
     * The descriptor of this function pointer
     */
    public static FunctionDescriptor descriptor() {
        return $DESC;
    }

    private static final MethodHandle UP$MH = ObjCRuntime.upcallHandle(objc_hook_getClass.Function.class, "apply", $DESC);

    /**
     * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
     * The lifetime of the returned segment is managed by {@code arena}
     */
    public static MemorySegment allocate(objc_hook_getClass.Function fi, Arena arena) {
        return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
    }

    private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

    /**
     * Invoke the upcall stub {@code funcPtr}, with given parameters
     */
    public static boolean invoke(MemorySegment funcPtr,MemorySegment name, MemorySegment outClass) {
        try {
            return (boolean) DOWN$MH.invokeExact(funcPtr, name, outClass);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
}

