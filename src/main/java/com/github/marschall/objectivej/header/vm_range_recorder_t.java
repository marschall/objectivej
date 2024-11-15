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
 * typedef void (vm_range_recorder_t)(task_t, void *, unsigned int, vm_range_t *, unsigned int)
 * }
 */
public class vm_range_recorder_t {

    vm_range_recorder_t() {
        // Should not be called directly
    }

    /**
     * The function pointer signature, expressed as a functional interface
     */
    public interface Function {
        void apply(int _x0, MemorySegment _x1, int type, MemorySegment _x3, int _x4);
    }

    private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
        ObjCRuntime.C_INT,
        ObjCRuntime.C_POINTER,
        ObjCRuntime.C_INT,
        ObjCRuntime.C_POINTER,
        ObjCRuntime.C_INT
    );

    /**
     * The descriptor of this function pointer
     */
    public static FunctionDescriptor descriptor() {
        return $DESC;
    }

    private static final MethodHandle UP$MH = ObjCRuntime.upcallHandle(vm_range_recorder_t.Function.class, "apply", $DESC);

    /**
     * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
     * The lifetime of the returned segment is managed by {@code arena}
     */
    public static MemorySegment allocate(vm_range_recorder_t.Function fi, Arena arena) {
        return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
    }

    private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

    /**
     * Invoke the upcall stub {@code funcPtr}, with given parameters
     */
    public static void invoke(MemorySegment funcPtr,int _x0, MemorySegment _x1, int type, MemorySegment _x3, int _x4) {
        try {
             DOWN$MH.invokeExact(funcPtr, _x0, _x1, type, _x3, _x4);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
}

