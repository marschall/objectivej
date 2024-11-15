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
 * struct thread_time_constraint_policy {
 *     uint32_t period;
 *     uint32_t computation;
 *     uint32_t constraint;
 *     boolean_t preemptible;
 * }
 * }
 */
public class thread_time_constraint_policy {

    thread_time_constraint_policy() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        ObjCRuntime.C_INT.withName("period"),
        ObjCRuntime.C_INT.withName("computation"),
        ObjCRuntime.C_INT.withName("constraint"),
        ObjCRuntime.C_INT.withName("preemptible")
    ).withName("thread_time_constraint_policy");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt period$LAYOUT = (OfInt)$LAYOUT.select(groupElement("period"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t period
     * }
     */
    public static final OfInt period$layout() {
        return period$LAYOUT;
    }

    private static final long period$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t period
     * }
     */
    public static final long period$offset() {
        return period$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t period
     * }
     */
    public static int period(MemorySegment struct) {
        return struct.get(period$LAYOUT, period$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t period
     * }
     */
    public static void period(MemorySegment struct, int fieldValue) {
        struct.set(period$LAYOUT, period$OFFSET, fieldValue);
    }

    private static final OfInt computation$LAYOUT = (OfInt)$LAYOUT.select(groupElement("computation"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t computation
     * }
     */
    public static final OfInt computation$layout() {
        return computation$LAYOUT;
    }

    private static final long computation$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t computation
     * }
     */
    public static final long computation$offset() {
        return computation$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t computation
     * }
     */
    public static int computation(MemorySegment struct) {
        return struct.get(computation$LAYOUT, computation$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t computation
     * }
     */
    public static void computation(MemorySegment struct, int fieldValue) {
        struct.set(computation$LAYOUT, computation$OFFSET, fieldValue);
    }

    private static final OfInt constraint$LAYOUT = (OfInt)$LAYOUT.select(groupElement("constraint"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t constraint
     * }
     */
    public static final OfInt constraint$layout() {
        return constraint$LAYOUT;
    }

    private static final long constraint$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t constraint
     * }
     */
    public static final long constraint$offset() {
        return constraint$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t constraint
     * }
     */
    public static int constraint(MemorySegment struct) {
        return struct.get(constraint$LAYOUT, constraint$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t constraint
     * }
     */
    public static void constraint(MemorySegment struct, int fieldValue) {
        struct.set(constraint$LAYOUT, constraint$OFFSET, fieldValue);
    }

    private static final OfInt preemptible$LAYOUT = (OfInt)$LAYOUT.select(groupElement("preemptible"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * boolean_t preemptible
     * }
     */
    public static final OfInt preemptible$layout() {
        return preemptible$LAYOUT;
    }

    private static final long preemptible$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * boolean_t preemptible
     * }
     */
    public static final long preemptible$offset() {
        return preemptible$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * boolean_t preemptible
     * }
     */
    public static int preemptible(MemorySegment struct) {
        return struct.get(preemptible$LAYOUT, preemptible$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * boolean_t preemptible
     * }
     */
    public static void preemptible(MemorySegment struct, int fieldValue) {
        struct.set(preemptible$LAYOUT, preemptible$OFFSET, fieldValue);
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

