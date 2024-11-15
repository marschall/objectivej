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
 * struct task_affinity_tag_info {
 *     integer_t set_count;
 *     integer_t min;
 *     integer_t max;
 *     integer_t task_count;
 * }
 * }
 */
public class task_affinity_tag_info {

    task_affinity_tag_info() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        ObjCRuntime.C_INT.withName("set_count"),
        ObjCRuntime.C_INT.withName("min"),
        ObjCRuntime.C_INT.withName("max"),
        ObjCRuntime.C_INT.withName("task_count")
    ).withName("task_affinity_tag_info");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt set_count$LAYOUT = (OfInt)$LAYOUT.select(groupElement("set_count"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * integer_t set_count
     * }
     */
    public static final OfInt set_count$layout() {
        return set_count$LAYOUT;
    }

    private static final long set_count$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * integer_t set_count
     * }
     */
    public static final long set_count$offset() {
        return set_count$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * integer_t set_count
     * }
     */
    public static int set_count(MemorySegment struct) {
        return struct.get(set_count$LAYOUT, set_count$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * integer_t set_count
     * }
     */
    public static void set_count(MemorySegment struct, int fieldValue) {
        struct.set(set_count$LAYOUT, set_count$OFFSET, fieldValue);
    }

    private static final OfInt min$LAYOUT = (OfInt)$LAYOUT.select(groupElement("min"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * integer_t min
     * }
     */
    public static final OfInt min$layout() {
        return min$LAYOUT;
    }

    private static final long min$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * integer_t min
     * }
     */
    public static final long min$offset() {
        return min$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * integer_t min
     * }
     */
    public static int min(MemorySegment struct) {
        return struct.get(min$LAYOUT, min$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * integer_t min
     * }
     */
    public static void min(MemorySegment struct, int fieldValue) {
        struct.set(min$LAYOUT, min$OFFSET, fieldValue);
    }

    private static final OfInt max$LAYOUT = (OfInt)$LAYOUT.select(groupElement("max"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * integer_t max
     * }
     */
    public static final OfInt max$layout() {
        return max$LAYOUT;
    }

    private static final long max$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * integer_t max
     * }
     */
    public static final long max$offset() {
        return max$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * integer_t max
     * }
     */
    public static int max(MemorySegment struct) {
        return struct.get(max$LAYOUT, max$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * integer_t max
     * }
     */
    public static void max(MemorySegment struct, int fieldValue) {
        struct.set(max$LAYOUT, max$OFFSET, fieldValue);
    }

    private static final OfInt task_count$LAYOUT = (OfInt)$LAYOUT.select(groupElement("task_count"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * integer_t task_count
     * }
     */
    public static final OfInt task_count$layout() {
        return task_count$LAYOUT;
    }

    private static final long task_count$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * integer_t task_count
     * }
     */
    public static final long task_count$offset() {
        return task_count$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * integer_t task_count
     * }
     */
    public static int task_count(MemorySegment struct) {
        return struct.get(task_count$LAYOUT, task_count$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * integer_t task_count
     * }
     */
    public static void task_count(MemorySegment struct, int fieldValue) {
        struct.set(task_count$LAYOUT, task_count$OFFSET, fieldValue);
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
