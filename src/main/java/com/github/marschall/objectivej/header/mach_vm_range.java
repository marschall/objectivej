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
 * struct mach_vm_range {
 *     mach_vm_offset_t min_address;
 *     mach_vm_offset_t max_address;
 * }
 * }
 */
public class mach_vm_range {

    mach_vm_range() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        ObjCRuntime.C_LONG_LONG.withName("min_address"),
        ObjCRuntime.C_LONG_LONG.withName("max_address")
    ).withName("mach_vm_range");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfLong min_address$LAYOUT = (OfLong)$LAYOUT.select(groupElement("min_address"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * mach_vm_offset_t min_address
     * }
     */
    public static final OfLong min_address$layout() {
        return min_address$LAYOUT;
    }

    private static final long min_address$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * mach_vm_offset_t min_address
     * }
     */
    public static final long min_address$offset() {
        return min_address$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * mach_vm_offset_t min_address
     * }
     */
    public static long min_address(MemorySegment struct) {
        return struct.get(min_address$LAYOUT, min_address$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * mach_vm_offset_t min_address
     * }
     */
    public static void min_address(MemorySegment struct, long fieldValue) {
        struct.set(min_address$LAYOUT, min_address$OFFSET, fieldValue);
    }

    private static final OfLong max_address$LAYOUT = (OfLong)$LAYOUT.select(groupElement("max_address"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * mach_vm_offset_t max_address
     * }
     */
    public static final OfLong max_address$layout() {
        return max_address$LAYOUT;
    }

    private static final long max_address$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * mach_vm_offset_t max_address
     * }
     */
    public static final long max_address$offset() {
        return max_address$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * mach_vm_offset_t max_address
     * }
     */
    public static long max_address(MemorySegment struct) {
        return struct.get(max_address$LAYOUT, max_address$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * mach_vm_offset_t max_address
     * }
     */
    public static void max_address(MemorySegment struct, long fieldValue) {
        struct.set(max_address$LAYOUT, max_address$OFFSET, fieldValue);
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
