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
 * struct __darwin_arm_exception_state {
 *     __uint32_t __exception;
 *     __uint32_t __fsr;
 *     __uint32_t __far;
 * }
 * }
 */
public class __darwin_arm_exception_state {

    __darwin_arm_exception_state() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        ObjCRuntime.C_INT.withName("__exception"),
        ObjCRuntime.C_INT.withName("__fsr"),
        ObjCRuntime.C_INT.withName("__far")
    ).withName("__darwin_arm_exception_state");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt __exception$LAYOUT = (OfInt)$LAYOUT.select(groupElement("__exception"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * __uint32_t __exception
     * }
     */
    public static final OfInt __exception$layout() {
        return __exception$LAYOUT;
    }

    private static final long __exception$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * __uint32_t __exception
     * }
     */
    public static final long __exception$offset() {
        return __exception$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * __uint32_t __exception
     * }
     */
    public static int __exception(MemorySegment struct) {
        return struct.get(__exception$LAYOUT, __exception$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * __uint32_t __exception
     * }
     */
    public static void __exception(MemorySegment struct, int fieldValue) {
        struct.set(__exception$LAYOUT, __exception$OFFSET, fieldValue);
    }

    private static final OfInt __fsr$LAYOUT = (OfInt)$LAYOUT.select(groupElement("__fsr"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * __uint32_t __fsr
     * }
     */
    public static final OfInt __fsr$layout() {
        return __fsr$LAYOUT;
    }

    private static final long __fsr$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * __uint32_t __fsr
     * }
     */
    public static final long __fsr$offset() {
        return __fsr$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * __uint32_t __fsr
     * }
     */
    public static int __fsr(MemorySegment struct) {
        return struct.get(__fsr$LAYOUT, __fsr$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * __uint32_t __fsr
     * }
     */
    public static void __fsr(MemorySegment struct, int fieldValue) {
        struct.set(__fsr$LAYOUT, __fsr$OFFSET, fieldValue);
    }

    private static final OfInt __far$LAYOUT = (OfInt)$LAYOUT.select(groupElement("__far"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * __uint32_t __far
     * }
     */
    public static final OfInt __far$layout() {
        return __far$LAYOUT;
    }

    private static final long __far$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * __uint32_t __far
     * }
     */
    public static final long __far$offset() {
        return __far$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * __uint32_t __far
     * }
     */
    public static int __far(MemorySegment struct) {
        return struct.get(__far$LAYOUT, __far$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * __uint32_t __far
     * }
     */
    public static void __far(MemorySegment struct, int fieldValue) {
        struct.set(__far$LAYOUT, __far$OFFSET, fieldValue);
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

