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
 * struct {
 *     mach_port_context_t context;
 *     mach_msg_guard_flags_t flags : 16;
 *     mach_msg_type_name_t disposition : 8;
 *     mach_msg_descriptor_type_t type : 8;
 *     mach_port_name_t name;
 * }
 * }
 */
public class mach_msg_guarded_port_descriptor_t {

    mach_msg_guarded_port_descriptor_t() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        ObjCRuntime.align(ObjCRuntime.C_LONG, 4).withName("context"),
        MemoryLayout.paddingLayout(4),
        ObjCRuntime.C_INT.withName("name")
    ).withName("$anon$389:9");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfLong context$LAYOUT = (OfLong)$LAYOUT.select(groupElement("context"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * mach_port_context_t context
     * }
     */
    public static final OfLong context$layout() {
        return context$LAYOUT;
    }

    private static final long context$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * mach_port_context_t context
     * }
     */
    public static final long context$offset() {
        return context$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * mach_port_context_t context
     * }
     */
    public static long context(MemorySegment struct) {
        return struct.get(context$LAYOUT, context$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * mach_port_context_t context
     * }
     */
    public static void context(MemorySegment struct, long fieldValue) {
        struct.set(context$LAYOUT, context$OFFSET, fieldValue);
    }

    private static final OfInt name$LAYOUT = (OfInt)$LAYOUT.select(groupElement("name"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * mach_port_name_t name
     * }
     */
    public static final OfInt name$layout() {
        return name$LAYOUT;
    }

    private static final long name$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * mach_port_name_t name
     * }
     */
    public static final long name$offset() {
        return name$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * mach_port_name_t name
     * }
     */
    public static int name(MemorySegment struct) {
        return struct.get(name$LAYOUT, name$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * mach_port_name_t name
     * }
     */
    public static void name(MemorySegment struct, int fieldValue) {
        struct.set(name$LAYOUT, name$OFFSET, fieldValue);
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
