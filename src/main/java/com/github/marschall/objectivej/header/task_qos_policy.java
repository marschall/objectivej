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
 * struct task_qos_policy {
 *     task_latency_qos_t task_latency_qos_tier;
 *     task_throughput_qos_t task_throughput_qos_tier;
 * }
 * }
 */
public class task_qos_policy {

    task_qos_policy() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        ObjCRuntime.C_INT.withName("task_latency_qos_tier"),
        ObjCRuntime.C_INT.withName("task_throughput_qos_tier")
    ).withName("task_qos_policy");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt task_latency_qos_tier$LAYOUT = (OfInt)$LAYOUT.select(groupElement("task_latency_qos_tier"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * task_latency_qos_t task_latency_qos_tier
     * }
     */
    public static final OfInt task_latency_qos_tier$layout() {
        return task_latency_qos_tier$LAYOUT;
    }

    private static final long task_latency_qos_tier$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * task_latency_qos_t task_latency_qos_tier
     * }
     */
    public static final long task_latency_qos_tier$offset() {
        return task_latency_qos_tier$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * task_latency_qos_t task_latency_qos_tier
     * }
     */
    public static int task_latency_qos_tier(MemorySegment struct) {
        return struct.get(task_latency_qos_tier$LAYOUT, task_latency_qos_tier$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * task_latency_qos_t task_latency_qos_tier
     * }
     */
    public static void task_latency_qos_tier(MemorySegment struct, int fieldValue) {
        struct.set(task_latency_qos_tier$LAYOUT, task_latency_qos_tier$OFFSET, fieldValue);
    }

    private static final OfInt task_throughput_qos_tier$LAYOUT = (OfInt)$LAYOUT.select(groupElement("task_throughput_qos_tier"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * task_throughput_qos_t task_throughput_qos_tier
     * }
     */
    public static final OfInt task_throughput_qos_tier$layout() {
        return task_throughput_qos_tier$LAYOUT;
    }

    private static final long task_throughput_qos_tier$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * task_throughput_qos_t task_throughput_qos_tier
     * }
     */
    public static final long task_throughput_qos_tier$offset() {
        return task_throughput_qos_tier$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * task_throughput_qos_t task_throughput_qos_tier
     * }
     */
    public static int task_throughput_qos_tier(MemorySegment struct) {
        return struct.get(task_throughput_qos_tier$LAYOUT, task_throughput_qos_tier$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * task_throughput_qos_t task_throughput_qos_tier
     * }
     */
    public static void task_throughput_qos_tier(MemorySegment struct, int fieldValue) {
        struct.set(task_throughput_qos_tier$LAYOUT, task_throughput_qos_tier$OFFSET, fieldValue);
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

