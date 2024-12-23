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
 * struct objc_super {
 *     id  _Nonnull receiver;
 *     Class  _Nonnull super_class;
 * }
 * }
 */
public class objc_super {

    objc_super() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        ObjCRuntime.C_POINTER.withName("receiver"),
        ObjCRuntime.C_POINTER.withName("super_class")
    ).withName("objc_super");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout receiver$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("receiver"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * id  _Nonnull receiver
     * }
     */
    public static final AddressLayout receiver$layout() {
        return receiver$LAYOUT;
    }

    private static final long receiver$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * id  _Nonnull receiver
     * }
     */
    public static final long receiver$offset() {
        return receiver$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * id  _Nonnull receiver
     * }
     */
    public static MemorySegment receiver(MemorySegment struct) {
        return struct.get(receiver$LAYOUT, receiver$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * id  _Nonnull receiver
     * }
     */
    public static void receiver(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(receiver$LAYOUT, receiver$OFFSET, fieldValue);
    }

    private static final AddressLayout super_class$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("super_class"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * Class  _Nonnull super_class
     * }
     */
    public static final AddressLayout super_class$layout() {
        return super_class$LAYOUT;
    }

    private static final long super_class$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * Class  _Nonnull super_class
     * }
     */
    public static final long super_class$offset() {
        return super_class$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * Class  _Nonnull super_class
     * }
     */
    public static MemorySegment super_class(MemorySegment struct) {
        return struct.get(super_class$LAYOUT, super_class$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * Class  _Nonnull super_class
     * }
     */
    public static void super_class(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(super_class$LAYOUT, super_class$OFFSET, fieldValue);
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

