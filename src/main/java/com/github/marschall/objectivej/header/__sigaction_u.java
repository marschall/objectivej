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
 * union __sigaction_u {
 *     void (*__sa_handler)(int);
 *     void (*__sa_sigaction)(int, struct __siginfo *, void *);
 * }
 * }
 */
public class __sigaction_u {

    __sigaction_u() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.unionLayout(
        ObjCRuntime.C_POINTER.withName("__sa_handler"),
        ObjCRuntime.C_POINTER.withName("__sa_sigaction")
    ).withName("__sigaction_u");

    /**
     * The layout of this union
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    /**
     * {@snippet lang=c :
     * void (*__sa_handler)(int)
     * }
     */
    public static class __sa_handler {

        __sa_handler() {
            // Should not be called directly
        }

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            void apply(int _x0);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
            ObjCRuntime.C_INT
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = ObjCRuntime.upcallHandle(__sa_handler.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(__sa_handler.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static void invoke(MemorySegment funcPtr,int _x0) {
            try {
                 DOWN$MH.invokeExact(funcPtr, _x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout __sa_handler$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("__sa_handler"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*__sa_handler)(int)
     * }
     */
    public static final AddressLayout __sa_handler$layout() {
        return __sa_handler$LAYOUT;
    }

    private static final long __sa_handler$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*__sa_handler)(int)
     * }
     */
    public static final long __sa_handler$offset() {
        return __sa_handler$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*__sa_handler)(int)
     * }
     */
    public static MemorySegment __sa_handler(MemorySegment union) {
        return union.get(__sa_handler$LAYOUT, __sa_handler$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*__sa_handler)(int)
     * }
     */
    public static void __sa_handler(MemorySegment union, MemorySegment fieldValue) {
        union.set(__sa_handler$LAYOUT, __sa_handler$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * void (*__sa_sigaction)(int, struct __siginfo *, void *)
     * }
     */
    public static class __sa_sigaction {

        __sa_sigaction() {
            // Should not be called directly
        }

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            void apply(int _x0, MemorySegment _x1, MemorySegment _x2);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
            ObjCRuntime.C_INT,
            ObjCRuntime.C_POINTER,
            ObjCRuntime.C_POINTER
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = ObjCRuntime.upcallHandle(__sa_sigaction.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(__sa_sigaction.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static void invoke(MemorySegment funcPtr,int _x0, MemorySegment _x1, MemorySegment _x2) {
            try {
                 DOWN$MH.invokeExact(funcPtr, _x0, _x1, _x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout __sa_sigaction$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("__sa_sigaction"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*__sa_sigaction)(int, struct __siginfo *, void *)
     * }
     */
    public static final AddressLayout __sa_sigaction$layout() {
        return __sa_sigaction$LAYOUT;
    }

    private static final long __sa_sigaction$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*__sa_sigaction)(int, struct __siginfo *, void *)
     * }
     */
    public static final long __sa_sigaction$offset() {
        return __sa_sigaction$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*__sa_sigaction)(int, struct __siginfo *, void *)
     * }
     */
    public static MemorySegment __sa_sigaction(MemorySegment union) {
        return union.get(__sa_sigaction$LAYOUT, __sa_sigaction$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*__sa_sigaction)(int, struct __siginfo *, void *)
     * }
     */
    public static void __sa_sigaction(MemorySegment union, MemorySegment fieldValue) {
        union.set(__sa_sigaction$LAYOUT, __sa_sigaction$OFFSET, fieldValue);
    }

    /**
     * Obtains a slice of {@code arrayParam} which selects the array element at {@code index}.
     * The returned segment has address {@code arrayParam.address() + index * layout().byteSize()}
     */
    public static MemorySegment asSlice(MemorySegment array, long index) {
        return array.asSlice(layout().byteSize() * index);
    }

    /**
     * The size (in bytes) of this union
     */
    public static long sizeof() { return layout().byteSize(); }

    /**
     * Allocate a segment of size {@code layout().byteSize()} using {@code allocator}
     */
    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate(layout());
    }

    /**
     * Allocate an array of size {@code elementCount} using {@code allocator}.
     * The returned segment has size {@code elementCount * layout().byteSize()}.
     */
    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(elementCount, layout()));
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction} (if any).
     * The returned segment has size {@code layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, Arena arena, Consumer<MemorySegment> cleanup) {
        return reinterpret(addr, 1, arena, cleanup);
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction} (if any).
     * The returned segment has size {@code elementCount * layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr.reinterpret(layout().byteSize() * elementCount, arena, cleanup);
    }
}

