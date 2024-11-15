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
 * struct host_sched_info {
 *     integer_t min_timeout;
 *     integer_t min_quantum;
 * }
 * }
 */
public class host_sched_info {

    host_sched_info() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        ObjCRuntime.C_INT.withName("min_timeout"),
        ObjCRuntime.C_INT.withName("min_quantum")
    ).withName("host_sched_info");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt min_timeout$LAYOUT = (OfInt)$LAYOUT.select(groupElement("min_timeout"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * integer_t min_timeout
     * }
     */
    public static final OfInt min_timeout$layout() {
        return min_timeout$LAYOUT;
    }

    private static final long min_timeout$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * integer_t min_timeout
     * }
     */
    public static final long min_timeout$offset() {
        return min_timeout$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * integer_t min_timeout
     * }
     */
    public static int min_timeout(MemorySegment struct) {
        return struct.get(min_timeout$LAYOUT, min_timeout$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * integer_t min_timeout
     * }
     */
    public static void min_timeout(MemorySegment struct, int fieldValue) {
        struct.set(min_timeout$LAYOUT, min_timeout$OFFSET, fieldValue);
    }

    private static final OfInt min_quantum$LAYOUT = (OfInt)$LAYOUT.select(groupElement("min_quantum"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * integer_t min_quantum
     * }
     */
    public static final OfInt min_quantum$layout() {
        return min_quantum$LAYOUT;
    }

    private static final long min_quantum$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * integer_t min_quantum
     * }
     */
    public static final long min_quantum$offset() {
        return min_quantum$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * integer_t min_quantum
     * }
     */
    public static int min_quantum(MemorySegment struct) {
        return struct.get(min_quantum$LAYOUT, min_quantum$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * integer_t min_quantum
     * }
     */
    public static void min_quantum(MemorySegment struct, int fieldValue) {
        struct.set(min_quantum$LAYOUT, min_quantum$OFFSET, fieldValue);
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

