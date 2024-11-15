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
 * struct task_basic_info {
 *     integer_t suspend_count;
 *     vm_size_t virtual_size;
 *     vm_size_t resident_size;
 *     time_value_t user_time;
 *     time_value_t system_time;
 *     policy_t policy;
 * }
 * }
 */
public class task_basic_info {

    task_basic_info() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        ObjCRuntime.C_INT.withName("suspend_count"),
        ObjCRuntime.align(ObjCRuntime.C_LONG, 4).withName("virtual_size"),
        ObjCRuntime.align(ObjCRuntime.C_LONG, 4).withName("resident_size"),
        time_value.layout().withName("user_time"),
        time_value.layout().withName("system_time"),
        ObjCRuntime.C_INT.withName("policy")
    ).withName("task_basic_info");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt suspend_count$LAYOUT = (OfInt)$LAYOUT.select(groupElement("suspend_count"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * integer_t suspend_count
     * }
     */
    public static final OfInt suspend_count$layout() {
        return suspend_count$LAYOUT;
    }

    private static final long suspend_count$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * integer_t suspend_count
     * }
     */
    public static final long suspend_count$offset() {
        return suspend_count$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * integer_t suspend_count
     * }
     */
    public static int suspend_count(MemorySegment struct) {
        return struct.get(suspend_count$LAYOUT, suspend_count$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * integer_t suspend_count
     * }
     */
    public static void suspend_count(MemorySegment struct, int fieldValue) {
        struct.set(suspend_count$LAYOUT, suspend_count$OFFSET, fieldValue);
    }

    private static final OfLong virtual_size$LAYOUT = (OfLong)$LAYOUT.select(groupElement("virtual_size"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * vm_size_t virtual_size
     * }
     */
    public static final OfLong virtual_size$layout() {
        return virtual_size$LAYOUT;
    }

    private static final long virtual_size$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * vm_size_t virtual_size
     * }
     */
    public static final long virtual_size$offset() {
        return virtual_size$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * vm_size_t virtual_size
     * }
     */
    public static long virtual_size(MemorySegment struct) {
        return struct.get(virtual_size$LAYOUT, virtual_size$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * vm_size_t virtual_size
     * }
     */
    public static void virtual_size(MemorySegment struct, long fieldValue) {
        struct.set(virtual_size$LAYOUT, virtual_size$OFFSET, fieldValue);
    }

    private static final OfLong resident_size$LAYOUT = (OfLong)$LAYOUT.select(groupElement("resident_size"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * vm_size_t resident_size
     * }
     */
    public static final OfLong resident_size$layout() {
        return resident_size$LAYOUT;
    }

    private static final long resident_size$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * vm_size_t resident_size
     * }
     */
    public static final long resident_size$offset() {
        return resident_size$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * vm_size_t resident_size
     * }
     */
    public static long resident_size(MemorySegment struct) {
        return struct.get(resident_size$LAYOUT, resident_size$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * vm_size_t resident_size
     * }
     */
    public static void resident_size(MemorySegment struct, long fieldValue) {
        struct.set(resident_size$LAYOUT, resident_size$OFFSET, fieldValue);
    }

    private static final GroupLayout user_time$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("user_time"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * time_value_t user_time
     * }
     */
    public static final GroupLayout user_time$layout() {
        return user_time$LAYOUT;
    }

    private static final long user_time$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * time_value_t user_time
     * }
     */
    public static final long user_time$offset() {
        return user_time$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * time_value_t user_time
     * }
     */
    public static MemorySegment user_time(MemorySegment struct) {
        return struct.asSlice(user_time$OFFSET, user_time$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * time_value_t user_time
     * }
     */
    public static void user_time(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, user_time$OFFSET, user_time$LAYOUT.byteSize());
    }

    private static final GroupLayout system_time$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("system_time"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * time_value_t system_time
     * }
     */
    public static final GroupLayout system_time$layout() {
        return system_time$LAYOUT;
    }

    private static final long system_time$OFFSET = 28;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * time_value_t system_time
     * }
     */
    public static final long system_time$offset() {
        return system_time$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * time_value_t system_time
     * }
     */
    public static MemorySegment system_time(MemorySegment struct) {
        return struct.asSlice(system_time$OFFSET, system_time$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * time_value_t system_time
     * }
     */
    public static void system_time(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, system_time$OFFSET, system_time$LAYOUT.byteSize());
    }

    private static final OfInt policy$LAYOUT = (OfInt)$LAYOUT.select(groupElement("policy"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * policy_t policy
     * }
     */
    public static final OfInt policy$layout() {
        return policy$LAYOUT;
    }

    private static final long policy$OFFSET = 36;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * policy_t policy
     * }
     */
    public static final long policy$offset() {
        return policy$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * policy_t policy
     * }
     */
    public static int policy(MemorySegment struct) {
        return struct.get(policy$LAYOUT, policy$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * policy_t policy
     * }
     */
    public static void policy(MemorySegment struct, int fieldValue) {
        struct.set(policy$LAYOUT, policy$OFFSET, fieldValue);
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

