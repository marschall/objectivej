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
 * struct fsobj_id {
 *     u_int32_t fid_objno;
 *     u_int32_t fid_generation;
 * }
 * }
 */
public class fsobj_id {

    fsobj_id() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        ObjCRuntime.C_INT.withName("fid_objno"),
        ObjCRuntime.C_INT.withName("fid_generation")
    ).withName("fsobj_id");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt fid_objno$LAYOUT = (OfInt)$LAYOUT.select(groupElement("fid_objno"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * u_int32_t fid_objno
     * }
     */
    public static final OfInt fid_objno$layout() {
        return fid_objno$LAYOUT;
    }

    private static final long fid_objno$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * u_int32_t fid_objno
     * }
     */
    public static final long fid_objno$offset() {
        return fid_objno$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * u_int32_t fid_objno
     * }
     */
    public static int fid_objno(MemorySegment struct) {
        return struct.get(fid_objno$LAYOUT, fid_objno$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * u_int32_t fid_objno
     * }
     */
    public static void fid_objno(MemorySegment struct, int fieldValue) {
        struct.set(fid_objno$LAYOUT, fid_objno$OFFSET, fieldValue);
    }

    private static final OfInt fid_generation$LAYOUT = (OfInt)$LAYOUT.select(groupElement("fid_generation"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * u_int32_t fid_generation
     * }
     */
    public static final OfInt fid_generation$layout() {
        return fid_generation$LAYOUT;
    }

    private static final long fid_generation$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * u_int32_t fid_generation
     * }
     */
    public static final long fid_generation$offset() {
        return fid_generation$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * u_int32_t fid_generation
     * }
     */
    public static int fid_generation(MemorySegment struct) {
        return struct.get(fid_generation$LAYOUT, fid_generation$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * u_int32_t fid_generation
     * }
     */
    public static void fid_generation(MemorySegment struct, int fieldValue) {
        struct.set(fid_generation$LAYOUT, fid_generation$OFFSET, fieldValue);
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
