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
 * struct __darwin_arm_exception_state64_v2 {
 *     __uint64_t __far;
 *     __uint64_t __esr;
 * }
 * }
 */
public class __darwin_arm_exception_state64_v2 {

    __darwin_arm_exception_state64_v2() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        ObjCRuntime.C_LONG_LONG.withName("__far"),
        ObjCRuntime.C_LONG_LONG.withName("__esr")
    ).withName("__darwin_arm_exception_state64_v2");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfLong __far$LAYOUT = (OfLong)$LAYOUT.select(groupElement("__far"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * __uint64_t __far
     * }
     */
    public static final OfLong __far$layout() {
        return __far$LAYOUT;
    }

    private static final long __far$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * __uint64_t __far
     * }
     */
    public static final long __far$offset() {
        return __far$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * __uint64_t __far
     * }
     */
    public static long __far(MemorySegment struct) {
        return struct.get(__far$LAYOUT, __far$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * __uint64_t __far
     * }
     */
    public static void __far(MemorySegment struct, long fieldValue) {
        struct.set(__far$LAYOUT, __far$OFFSET, fieldValue);
    }

    private static final OfLong __esr$LAYOUT = (OfLong)$LAYOUT.select(groupElement("__esr"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * __uint64_t __esr
     * }
     */
    public static final OfLong __esr$layout() {
        return __esr$LAYOUT;
    }

    private static final long __esr$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * __uint64_t __esr
     * }
     */
    public static final long __esr$offset() {
        return __esr$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * __uint64_t __esr
     * }
     */
    public static long __esr(MemorySegment struct) {
        return struct.get(__esr$LAYOUT, __esr$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * __uint64_t __esr
     * }
     */
    public static void __esr(MemorySegment struct, long fieldValue) {
        struct.set(__esr$LAYOUT, __esr$OFFSET, fieldValue);
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

