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
 * struct processor_cpu_load_info {
 *     unsigned int cpu_ticks[4];
 * }
 * }
 */
public class processor_cpu_load_info {

    processor_cpu_load_info() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.sequenceLayout(4, ObjCRuntime.C_INT).withName("cpu_ticks")
    ).withName("processor_cpu_load_info");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final SequenceLayout cpu_ticks$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("cpu_ticks"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned int cpu_ticks[4]
     * }
     */
    public static final SequenceLayout cpu_ticks$layout() {
        return cpu_ticks$LAYOUT;
    }

    private static final long cpu_ticks$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned int cpu_ticks[4]
     * }
     */
    public static final long cpu_ticks$offset() {
        return cpu_ticks$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned int cpu_ticks[4]
     * }
     */
    public static MemorySegment cpu_ticks(MemorySegment struct) {
        return struct.asSlice(cpu_ticks$OFFSET, cpu_ticks$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned int cpu_ticks[4]
     * }
     */
    public static void cpu_ticks(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, cpu_ticks$OFFSET, cpu_ticks$LAYOUT.byteSize());
    }

    private static long[] cpu_ticks$DIMS = { 4 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * unsigned int cpu_ticks[4]
     * }
     */
    public static long[] cpu_ticks$dimensions() {
        return cpu_ticks$DIMS;
    }
    private static final VarHandle cpu_ticks$ELEM_HANDLE = cpu_ticks$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * unsigned int cpu_ticks[4]
     * }
     */
    public static int cpu_ticks(MemorySegment struct, long index0) {
        return (int)cpu_ticks$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * unsigned int cpu_ticks[4]
     * }
     */
    public static void cpu_ticks(MemorySegment struct, long index0, int fieldValue) {
        cpu_ticks$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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

