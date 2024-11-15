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
 * union sigval {
 *     int sival_int;
 *     void *sival_ptr;
 * }
 * }
 */
public class sigval {

    sigval() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.unionLayout(
        ObjCRuntime.C_INT.withName("sival_int"),
        ObjCRuntime.C_POINTER.withName("sival_ptr")
    ).withName("sigval");

    /**
     * The layout of this union
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt sival_int$LAYOUT = (OfInt)$LAYOUT.select(groupElement("sival_int"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int sival_int
     * }
     */
    public static final OfInt sival_int$layout() {
        return sival_int$LAYOUT;
    }

    private static final long sival_int$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int sival_int
     * }
     */
    public static final long sival_int$offset() {
        return sival_int$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int sival_int
     * }
     */
    public static int sival_int(MemorySegment union) {
        return union.get(sival_int$LAYOUT, sival_int$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int sival_int
     * }
     */
    public static void sival_int(MemorySegment union, int fieldValue) {
        union.set(sival_int$LAYOUT, sival_int$OFFSET, fieldValue);
    }

    private static final AddressLayout sival_ptr$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("sival_ptr"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void *sival_ptr
     * }
     */
    public static final AddressLayout sival_ptr$layout() {
        return sival_ptr$LAYOUT;
    }

    private static final long sival_ptr$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void *sival_ptr
     * }
     */
    public static final long sival_ptr$offset() {
        return sival_ptr$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void *sival_ptr
     * }
     */
    public static MemorySegment sival_ptr(MemorySegment union) {
        return union.get(sival_ptr$LAYOUT, sival_ptr$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void *sival_ptr
     * }
     */
    public static void sival_ptr(MemorySegment union, MemorySegment fieldValue) {
        union.set(sival_ptr$LAYOUT, sival_ptr$OFFSET, fieldValue);
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

