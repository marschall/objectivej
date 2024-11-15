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
 * struct __darwin_arm_thread_state {
 *     __uint32_t __r[13];
 *     __uint32_t __sp;
 *     __uint32_t __lr;
 *     __uint32_t __pc;
 *     __uint32_t __cpsr;
 * }
 * }
 */
public class __darwin_arm_thread_state {

    __darwin_arm_thread_state() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.sequenceLayout(13, ObjCRuntime.C_INT).withName("__r"),
        ObjCRuntime.C_INT.withName("__sp"),
        ObjCRuntime.C_INT.withName("__lr"),
        ObjCRuntime.C_INT.withName("__pc"),
        ObjCRuntime.C_INT.withName("__cpsr")
    ).withName("__darwin_arm_thread_state");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final SequenceLayout __r$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("__r"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * __uint32_t __r[13]
     * }
     */
    public static final SequenceLayout __r$layout() {
        return __r$LAYOUT;
    }

    private static final long __r$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * __uint32_t __r[13]
     * }
     */
    public static final long __r$offset() {
        return __r$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * __uint32_t __r[13]
     * }
     */
    public static MemorySegment __r(MemorySegment struct) {
        return struct.asSlice(__r$OFFSET, __r$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * __uint32_t __r[13]
     * }
     */
    public static void __r(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, __r$OFFSET, __r$LAYOUT.byteSize());
    }

    private static long[] __r$DIMS = { 13 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * __uint32_t __r[13]
     * }
     */
    public static long[] __r$dimensions() {
        return __r$DIMS;
    }
    private static final VarHandle __r$ELEM_HANDLE = __r$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * __uint32_t __r[13]
     * }
     */
    public static int __r(MemorySegment struct, long index0) {
        return (int)__r$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * __uint32_t __r[13]
     * }
     */
    public static void __r(MemorySegment struct, long index0, int fieldValue) {
        __r$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final OfInt __sp$LAYOUT = (OfInt)$LAYOUT.select(groupElement("__sp"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * __uint32_t __sp
     * }
     */
    public static final OfInt __sp$layout() {
        return __sp$LAYOUT;
    }

    private static final long __sp$OFFSET = 52;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * __uint32_t __sp
     * }
     */
    public static final long __sp$offset() {
        return __sp$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * __uint32_t __sp
     * }
     */
    public static int __sp(MemorySegment struct) {
        return struct.get(__sp$LAYOUT, __sp$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * __uint32_t __sp
     * }
     */
    public static void __sp(MemorySegment struct, int fieldValue) {
        struct.set(__sp$LAYOUT, __sp$OFFSET, fieldValue);
    }

    private static final OfInt __lr$LAYOUT = (OfInt)$LAYOUT.select(groupElement("__lr"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * __uint32_t __lr
     * }
     */
    public static final OfInt __lr$layout() {
        return __lr$LAYOUT;
    }

    private static final long __lr$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * __uint32_t __lr
     * }
     */
    public static final long __lr$offset() {
        return __lr$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * __uint32_t __lr
     * }
     */
    public static int __lr(MemorySegment struct) {
        return struct.get(__lr$LAYOUT, __lr$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * __uint32_t __lr
     * }
     */
    public static void __lr(MemorySegment struct, int fieldValue) {
        struct.set(__lr$LAYOUT, __lr$OFFSET, fieldValue);
    }

    private static final OfInt __pc$LAYOUT = (OfInt)$LAYOUT.select(groupElement("__pc"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * __uint32_t __pc
     * }
     */
    public static final OfInt __pc$layout() {
        return __pc$LAYOUT;
    }

    private static final long __pc$OFFSET = 60;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * __uint32_t __pc
     * }
     */
    public static final long __pc$offset() {
        return __pc$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * __uint32_t __pc
     * }
     */
    public static int __pc(MemorySegment struct) {
        return struct.get(__pc$LAYOUT, __pc$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * __uint32_t __pc
     * }
     */
    public static void __pc(MemorySegment struct, int fieldValue) {
        struct.set(__pc$LAYOUT, __pc$OFFSET, fieldValue);
    }

    private static final OfInt __cpsr$LAYOUT = (OfInt)$LAYOUT.select(groupElement("__cpsr"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * __uint32_t __cpsr
     * }
     */
    public static final OfInt __cpsr$layout() {
        return __cpsr$LAYOUT;
    }

    private static final long __cpsr$OFFSET = 64;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * __uint32_t __cpsr
     * }
     */
    public static final long __cpsr$offset() {
        return __cpsr$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * __uint32_t __cpsr
     * }
     */
    public static int __cpsr(MemorySegment struct) {
        return struct.get(__cpsr$LAYOUT, __cpsr$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * __uint32_t __cpsr
     * }
     */
    public static void __cpsr(MemorySegment struct, int fieldValue) {
        struct.set(__cpsr$LAYOUT, __cpsr$OFFSET, fieldValue);
    }

    /**
     * Obtains a slice of {@code arrayParam} which selects the array element at {@code index}.
     * The returned segment has address {@code arrayParam.address() + index * layout().byteSize()}
     */
    public static MemorySegment asSlice(MemorySegment array, long index) {
        return array.asSlice(layout().byteSize() * index);
    }

    /**
     * The size (in bytes) of this struct
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
