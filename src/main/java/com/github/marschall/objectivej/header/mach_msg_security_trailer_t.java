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
 *     mach_msg_trailer_type_t msgh_trailer_type;
 *     mach_msg_trailer_size_t msgh_trailer_size;
 *     mach_port_seqno_t msgh_seqno;
 *     security_token_t msgh_sender;
 * }
 * }
 */
public class mach_msg_security_trailer_t {

    mach_msg_security_trailer_t() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        ObjCRuntime.C_INT.withName("msgh_trailer_type"),
        ObjCRuntime.C_INT.withName("msgh_trailer_size"),
        ObjCRuntime.C_INT.withName("msgh_seqno"),
        security_token_t.layout().withName("msgh_sender")
    ).withName("$anon$472:9");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt msgh_trailer_type$LAYOUT = (OfInt)$LAYOUT.select(groupElement("msgh_trailer_type"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * mach_msg_trailer_type_t msgh_trailer_type
     * }
     */
    public static final OfInt msgh_trailer_type$layout() {
        return msgh_trailer_type$LAYOUT;
    }

    private static final long msgh_trailer_type$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * mach_msg_trailer_type_t msgh_trailer_type
     * }
     */
    public static final long msgh_trailer_type$offset() {
        return msgh_trailer_type$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * mach_msg_trailer_type_t msgh_trailer_type
     * }
     */
    public static int msgh_trailer_type(MemorySegment struct) {
        return struct.get(msgh_trailer_type$LAYOUT, msgh_trailer_type$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * mach_msg_trailer_type_t msgh_trailer_type
     * }
     */
    public static void msgh_trailer_type(MemorySegment struct, int fieldValue) {
        struct.set(msgh_trailer_type$LAYOUT, msgh_trailer_type$OFFSET, fieldValue);
    }

    private static final OfInt msgh_trailer_size$LAYOUT = (OfInt)$LAYOUT.select(groupElement("msgh_trailer_size"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * mach_msg_trailer_size_t msgh_trailer_size
     * }
     */
    public static final OfInt msgh_trailer_size$layout() {
        return msgh_trailer_size$LAYOUT;
    }

    private static final long msgh_trailer_size$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * mach_msg_trailer_size_t msgh_trailer_size
     * }
     */
    public static final long msgh_trailer_size$offset() {
        return msgh_trailer_size$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * mach_msg_trailer_size_t msgh_trailer_size
     * }
     */
    public static int msgh_trailer_size(MemorySegment struct) {
        return struct.get(msgh_trailer_size$LAYOUT, msgh_trailer_size$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * mach_msg_trailer_size_t msgh_trailer_size
     * }
     */
    public static void msgh_trailer_size(MemorySegment struct, int fieldValue) {
        struct.set(msgh_trailer_size$LAYOUT, msgh_trailer_size$OFFSET, fieldValue);
    }

    private static final OfInt msgh_seqno$LAYOUT = (OfInt)$LAYOUT.select(groupElement("msgh_seqno"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * mach_port_seqno_t msgh_seqno
     * }
     */
    public static final OfInt msgh_seqno$layout() {
        return msgh_seqno$LAYOUT;
    }

    private static final long msgh_seqno$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * mach_port_seqno_t msgh_seqno
     * }
     */
    public static final long msgh_seqno$offset() {
        return msgh_seqno$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * mach_port_seqno_t msgh_seqno
     * }
     */
    public static int msgh_seqno(MemorySegment struct) {
        return struct.get(msgh_seqno$LAYOUT, msgh_seqno$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * mach_port_seqno_t msgh_seqno
     * }
     */
    public static void msgh_seqno(MemorySegment struct, int fieldValue) {
        struct.set(msgh_seqno$LAYOUT, msgh_seqno$OFFSET, fieldValue);
    }

    private static final GroupLayout msgh_sender$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("msgh_sender"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * security_token_t msgh_sender
     * }
     */
    public static final GroupLayout msgh_sender$layout() {
        return msgh_sender$LAYOUT;
    }

    private static final long msgh_sender$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * security_token_t msgh_sender
     * }
     */
    public static final long msgh_sender$offset() {
        return msgh_sender$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * security_token_t msgh_sender
     * }
     */
    public static MemorySegment msgh_sender(MemorySegment struct) {
        return struct.asSlice(msgh_sender$OFFSET, msgh_sender$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * security_token_t msgh_sender
     * }
     */
    public static void msgh_sender(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, msgh_sender$OFFSET, msgh_sender$LAYOUT.byteSize());
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

