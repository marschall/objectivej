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
 * struct mach_service_port_info {
 *     char mspi_string_name[255];
 *     uint8_t mspi_domain_type;
 * }
 * }
 */
public class mach_service_port_info {

    mach_service_port_info() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.sequenceLayout(255, ObjCRuntime.C_CHAR).withName("mspi_string_name"),
        ObjCRuntime.C_CHAR.withName("mspi_domain_type")
    ).withName("mach_service_port_info");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final SequenceLayout mspi_string_name$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("mspi_string_name"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * char mspi_string_name[255]
     * }
     */
    public static final SequenceLayout mspi_string_name$layout() {
        return mspi_string_name$LAYOUT;
    }

    private static final long mspi_string_name$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * char mspi_string_name[255]
     * }
     */
    public static final long mspi_string_name$offset() {
        return mspi_string_name$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * char mspi_string_name[255]
     * }
     */
    public static MemorySegment mspi_string_name(MemorySegment struct) {
        return struct.asSlice(mspi_string_name$OFFSET, mspi_string_name$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * char mspi_string_name[255]
     * }
     */
    public static void mspi_string_name(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, mspi_string_name$OFFSET, mspi_string_name$LAYOUT.byteSize());
    }

    private static long[] mspi_string_name$DIMS = { 255 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * char mspi_string_name[255]
     * }
     */
    public static long[] mspi_string_name$dimensions() {
        return mspi_string_name$DIMS;
    }
    private static final VarHandle mspi_string_name$ELEM_HANDLE = mspi_string_name$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * char mspi_string_name[255]
     * }
     */
    public static byte mspi_string_name(MemorySegment struct, long index0) {
        return (byte)mspi_string_name$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * char mspi_string_name[255]
     * }
     */
    public static void mspi_string_name(MemorySegment struct, long index0, byte fieldValue) {
        mspi_string_name$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final OfByte mspi_domain_type$LAYOUT = (OfByte)$LAYOUT.select(groupElement("mspi_domain_type"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint8_t mspi_domain_type
     * }
     */
    public static final OfByte mspi_domain_type$layout() {
        return mspi_domain_type$LAYOUT;
    }

    private static final long mspi_domain_type$OFFSET = 255;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint8_t mspi_domain_type
     * }
     */
    public static final long mspi_domain_type$offset() {
        return mspi_domain_type$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint8_t mspi_domain_type
     * }
     */
    public static byte mspi_domain_type(MemorySegment struct) {
        return struct.get(mspi_domain_type$LAYOUT, mspi_domain_type$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint8_t mspi_domain_type
     * }
     */
    public static void mspi_domain_type(MemorySegment struct, byte fieldValue) {
        struct.set(mspi_domain_type$LAYOUT, mspi_domain_type$OFFSET, fieldValue);
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

