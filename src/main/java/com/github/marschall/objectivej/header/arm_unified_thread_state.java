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
 * struct arm_unified_thread_state {
 *     arm_state_hdr_t ash;
 *     union {
 *         arm_thread_state32_t ts_32;
 *         arm_thread_state64_t ts_64;
 *     } uts;
 * }
 * }
 */
public class arm_unified_thread_state {

    arm_unified_thread_state() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        arm_state_hdr.layout().withName("ash"),
        arm_unified_thread_state.uts.layout().withName("uts")
    ).withName("arm_unified_thread_state");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout ash$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("ash"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * arm_state_hdr_t ash
     * }
     */
    public static final GroupLayout ash$layout() {
        return ash$LAYOUT;
    }

    private static final long ash$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * arm_state_hdr_t ash
     * }
     */
    public static final long ash$offset() {
        return ash$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * arm_state_hdr_t ash
     * }
     */
    public static MemorySegment ash(MemorySegment struct) {
        return struct.asSlice(ash$OFFSET, ash$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * arm_state_hdr_t ash
     * }
     */
    public static void ash(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, ash$OFFSET, ash$LAYOUT.byteSize());
    }

    /**
     * {@snippet lang=c :
     * union {
     *     arm_thread_state32_t ts_32;
     *     arm_thread_state64_t ts_64;
     * }
     * }
     */
    public static class uts {

        uts() {
            // Should not be called directly
        }

        private static final GroupLayout $LAYOUT = MemoryLayout.unionLayout(
            __darwin_arm_thread_state.layout().withName("ts_32"),
            __darwin_arm_thread_state64.layout().withName("ts_64")
        ).withName("$anon$167:2");

        /**
         * The layout of this union
         */
        public static final GroupLayout layout() {
            return $LAYOUT;
        }

        private static final GroupLayout ts_32$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("ts_32"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * arm_thread_state32_t ts_32
         * }
         */
        public static final GroupLayout ts_32$layout() {
            return ts_32$LAYOUT;
        }

        private static final long ts_32$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * arm_thread_state32_t ts_32
         * }
         */
        public static final long ts_32$offset() {
            return ts_32$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * arm_thread_state32_t ts_32
         * }
         */
        public static MemorySegment ts_32(MemorySegment union) {
            return union.asSlice(ts_32$OFFSET, ts_32$LAYOUT.byteSize());
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * arm_thread_state32_t ts_32
         * }
         */
        public static void ts_32(MemorySegment union, MemorySegment fieldValue) {
            MemorySegment.copy(fieldValue, 0L, union, ts_32$OFFSET, ts_32$LAYOUT.byteSize());
        }

        private static final GroupLayout ts_64$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("ts_64"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * arm_thread_state64_t ts_64
         * }
         */
        public static final GroupLayout ts_64$layout() {
            return ts_64$LAYOUT;
        }

        private static final long ts_64$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * arm_thread_state64_t ts_64
         * }
         */
        public static final long ts_64$offset() {
            return ts_64$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * arm_thread_state64_t ts_64
         * }
         */
        public static MemorySegment ts_64(MemorySegment union) {
            return union.asSlice(ts_64$OFFSET, ts_64$LAYOUT.byteSize());
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * arm_thread_state64_t ts_64
         * }
         */
        public static void ts_64(MemorySegment union, MemorySegment fieldValue) {
            MemorySegment.copy(fieldValue, 0L, union, ts_64$OFFSET, ts_64$LAYOUT.byteSize());
        }

        /**
         * Obtains a slice of {@code arrayParam} which selects the array element at {@code index}.
         * The returned segment has address {@code arrayParam.address() + index * layout().byteSize()}
         */
        public static MemorySegment asSlice(MemorySegment array, long index) {
            return array.asSlice(layout().byteSize() * index);
        }

        /**
         * The size (in bytes) of this union
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

    private static final GroupLayout uts$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("uts"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * union {
     *     arm_thread_state32_t ts_32;
     *     arm_thread_state64_t ts_64;
     * } uts
     * }
     */
    public static final GroupLayout uts$layout() {
        return uts$LAYOUT;
    }

    private static final long uts$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * union {
     *     arm_thread_state32_t ts_32;
     *     arm_thread_state64_t ts_64;
     * } uts
     * }
     */
    public static final long uts$offset() {
        return uts$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * union {
     *     arm_thread_state32_t ts_32;
     *     arm_thread_state64_t ts_64;
     * } uts
     * }
     */
    public static MemorySegment uts(MemorySegment struct) {
        return struct.asSlice(uts$OFFSET, uts$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * union {
     *     arm_thread_state32_t ts_32;
     *     arm_thread_state64_t ts_64;
     * } uts
     * }
     */
    public static void uts(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, uts$OFFSET, uts$LAYOUT.byteSize());
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
