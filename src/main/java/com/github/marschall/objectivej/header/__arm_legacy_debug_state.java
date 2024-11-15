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
 * struct __arm_legacy_debug_state {
 *     __uint32_t __bvr[16];
 *     __uint32_t __bcr[16];
 *     __uint32_t __wvr[16];
 *     __uint32_t __wcr[16];
 * }
 * }
 */
public class __arm_legacy_debug_state {

    __arm_legacy_debug_state() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.sequenceLayout(16, ObjCRuntime.C_INT).withName("__bvr"),
        MemoryLayout.sequenceLayout(16, ObjCRuntime.C_INT).withName("__bcr"),
        MemoryLayout.sequenceLayout(16, ObjCRuntime.C_INT).withName("__wvr"),
        MemoryLayout.sequenceLayout(16, ObjCRuntime.C_INT).withName("__wcr")
    ).withName("__arm_legacy_debug_state");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final SequenceLayout __bvr$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("__bvr"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * __uint32_t __bvr[16]
     * }
     */
    public static final SequenceLayout __bvr$layout() {
        return __bvr$LAYOUT;
    }

    private static final long __bvr$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * __uint32_t __bvr[16]
     * }
     */
    public static final long __bvr$offset() {
        return __bvr$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * __uint32_t __bvr[16]
     * }
     */
    public static MemorySegment __bvr(MemorySegment struct) {
        return struct.asSlice(__bvr$OFFSET, __bvr$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * __uint32_t __bvr[16]
     * }
     */
    public static void __bvr(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, __bvr$OFFSET, __bvr$LAYOUT.byteSize());
    }

    private static long[] __bvr$DIMS = { 16 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * __uint32_t __bvr[16]
     * }
     */
    public static long[] __bvr$dimensions() {
        return __bvr$DIMS;
    }
    private static final VarHandle __bvr$ELEM_HANDLE = __bvr$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * __uint32_t __bvr[16]
     * }
     */
    public static int __bvr(MemorySegment struct, long index0) {
        return (int)__bvr$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * __uint32_t __bvr[16]
     * }
     */
    public static void __bvr(MemorySegment struct, long index0, int fieldValue) {
        __bvr$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final SequenceLayout __bcr$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("__bcr"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * __uint32_t __bcr[16]
     * }
     */
    public static final SequenceLayout __bcr$layout() {
        return __bcr$LAYOUT;
    }

    private static final long __bcr$OFFSET = 64;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * __uint32_t __bcr[16]
     * }
     */
    public static final long __bcr$offset() {
        return __bcr$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * __uint32_t __bcr[16]
     * }
     */
    public static MemorySegment __bcr(MemorySegment struct) {
        return struct.asSlice(__bcr$OFFSET, __bcr$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * __uint32_t __bcr[16]
     * }
     */
    public static void __bcr(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, __bcr$OFFSET, __bcr$LAYOUT.byteSize());
    }

    private static long[] __bcr$DIMS = { 16 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * __uint32_t __bcr[16]
     * }
     */
    public static long[] __bcr$dimensions() {
        return __bcr$DIMS;
    }
    private static final VarHandle __bcr$ELEM_HANDLE = __bcr$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * __uint32_t __bcr[16]
     * }
     */
    public static int __bcr(MemorySegment struct, long index0) {
        return (int)__bcr$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * __uint32_t __bcr[16]
     * }
     */
    public static void __bcr(MemorySegment struct, long index0, int fieldValue) {
        __bcr$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final SequenceLayout __wvr$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("__wvr"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * __uint32_t __wvr[16]
     * }
     */
    public static final SequenceLayout __wvr$layout() {
        return __wvr$LAYOUT;
    }

    private static final long __wvr$OFFSET = 128;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * __uint32_t __wvr[16]
     * }
     */
    public static final long __wvr$offset() {
        return __wvr$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * __uint32_t __wvr[16]
     * }
     */
    public static MemorySegment __wvr(MemorySegment struct) {
        return struct.asSlice(__wvr$OFFSET, __wvr$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * __uint32_t __wvr[16]
     * }
     */
    public static void __wvr(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, __wvr$OFFSET, __wvr$LAYOUT.byteSize());
    }

    private static long[] __wvr$DIMS = { 16 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * __uint32_t __wvr[16]
     * }
     */
    public static long[] __wvr$dimensions() {
        return __wvr$DIMS;
    }
    private static final VarHandle __wvr$ELEM_HANDLE = __wvr$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * __uint32_t __wvr[16]
     * }
     */
    public static int __wvr(MemorySegment struct, long index0) {
        return (int)__wvr$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * __uint32_t __wvr[16]
     * }
     */
    public static void __wvr(MemorySegment struct, long index0, int fieldValue) {
        __wvr$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final SequenceLayout __wcr$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("__wcr"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * __uint32_t __wcr[16]
     * }
     */
    public static final SequenceLayout __wcr$layout() {
        return __wcr$LAYOUT;
    }

    private static final long __wcr$OFFSET = 192;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * __uint32_t __wcr[16]
     * }
     */
    public static final long __wcr$offset() {
        return __wcr$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * __uint32_t __wcr[16]
     * }
     */
    public static MemorySegment __wcr(MemorySegment struct) {
        return struct.asSlice(__wcr$OFFSET, __wcr$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * __uint32_t __wcr[16]
     * }
     */
    public static void __wcr(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, __wcr$OFFSET, __wcr$LAYOUT.byteSize());
    }

    private static long[] __wcr$DIMS = { 16 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * __uint32_t __wcr[16]
     * }
     */
    public static long[] __wcr$dimensions() {
        return __wcr$DIMS;
    }
    private static final VarHandle __wcr$ELEM_HANDLE = __wcr$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * __uint32_t __wcr[16]
     * }
     */
    public static int __wcr(MemorySegment struct, long index0) {
        return (int)__wcr$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * __uint32_t __wcr[16]
     * }
     */
    public static void __wcr(MemorySegment struct, long index0, int fieldValue) {
        __wcr$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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

