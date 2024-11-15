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
 * struct task_power_info_v2 {
 *     task_power_info_data_t cpu_energy;
 *     gpu_energy_data gpu_energy;
 *     uint64_t task_energy;
 *     uint64_t task_ptime;
 *     uint64_t task_pset_switches;
 * }
 * }
 */
public class task_power_info_v2 {

    task_power_info_v2() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        task_power_info.layout().withName("cpu_energy"),
        gpu_energy_data.layout().withName("gpu_energy"),
        ObjCRuntime.align(ObjCRuntime.C_LONG_LONG, 4).withName("task_energy"),
        ObjCRuntime.align(ObjCRuntime.C_LONG_LONG, 4).withName("task_ptime"),
        ObjCRuntime.align(ObjCRuntime.C_LONG_LONG, 4).withName("task_pset_switches")
    ).withName("task_power_info_v2");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout cpu_energy$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("cpu_energy"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * task_power_info_data_t cpu_energy
     * }
     */
    public static final GroupLayout cpu_energy$layout() {
        return cpu_energy$LAYOUT;
    }

    private static final long cpu_energy$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * task_power_info_data_t cpu_energy
     * }
     */
    public static final long cpu_energy$offset() {
        return cpu_energy$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * task_power_info_data_t cpu_energy
     * }
     */
    public static MemorySegment cpu_energy(MemorySegment struct) {
        return struct.asSlice(cpu_energy$OFFSET, cpu_energy$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * task_power_info_data_t cpu_energy
     * }
     */
    public static void cpu_energy(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, cpu_energy$OFFSET, cpu_energy$LAYOUT.byteSize());
    }

    private static final GroupLayout gpu_energy$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("gpu_energy"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * gpu_energy_data gpu_energy
     * }
     */
    public static final GroupLayout gpu_energy$layout() {
        return gpu_energy$LAYOUT;
    }

    private static final long gpu_energy$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * gpu_energy_data gpu_energy
     * }
     */
    public static final long gpu_energy$offset() {
        return gpu_energy$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * gpu_energy_data gpu_energy
     * }
     */
    public static MemorySegment gpu_energy(MemorySegment struct) {
        return struct.asSlice(gpu_energy$OFFSET, gpu_energy$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * gpu_energy_data gpu_energy
     * }
     */
    public static void gpu_energy(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, gpu_energy$OFFSET, gpu_energy$LAYOUT.byteSize());
    }

    private static final OfLong task_energy$LAYOUT = (OfLong)$LAYOUT.select(groupElement("task_energy"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint64_t task_energy
     * }
     */
    public static final OfLong task_energy$layout() {
        return task_energy$LAYOUT;
    }

    private static final long task_energy$OFFSET = 80;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint64_t task_energy
     * }
     */
    public static final long task_energy$offset() {
        return task_energy$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint64_t task_energy
     * }
     */
    public static long task_energy(MemorySegment struct) {
        return struct.get(task_energy$LAYOUT, task_energy$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint64_t task_energy
     * }
     */
    public static void task_energy(MemorySegment struct, long fieldValue) {
        struct.set(task_energy$LAYOUT, task_energy$OFFSET, fieldValue);
    }

    private static final OfLong task_ptime$LAYOUT = (OfLong)$LAYOUT.select(groupElement("task_ptime"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint64_t task_ptime
     * }
     */
    public static final OfLong task_ptime$layout() {
        return task_ptime$LAYOUT;
    }

    private static final long task_ptime$OFFSET = 88;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint64_t task_ptime
     * }
     */
    public static final long task_ptime$offset() {
        return task_ptime$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint64_t task_ptime
     * }
     */
    public static long task_ptime(MemorySegment struct) {
        return struct.get(task_ptime$LAYOUT, task_ptime$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint64_t task_ptime
     * }
     */
    public static void task_ptime(MemorySegment struct, long fieldValue) {
        struct.set(task_ptime$LAYOUT, task_ptime$OFFSET, fieldValue);
    }

    private static final OfLong task_pset_switches$LAYOUT = (OfLong)$LAYOUT.select(groupElement("task_pset_switches"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint64_t task_pset_switches
     * }
     */
    public static final OfLong task_pset_switches$layout() {
        return task_pset_switches$LAYOUT;
    }

    private static final long task_pset_switches$OFFSET = 96;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint64_t task_pset_switches
     * }
     */
    public static final long task_pset_switches$offset() {
        return task_pset_switches$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint64_t task_pset_switches
     * }
     */
    public static long task_pset_switches(MemorySegment struct) {
        return struct.get(task_pset_switches$LAYOUT, task_pset_switches$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint64_t task_pset_switches
     * }
     */
    public static void task_pset_switches(MemorySegment struct, long fieldValue) {
        struct.set(task_pset_switches$LAYOUT, task_pset_switches$OFFSET, fieldValue);
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

