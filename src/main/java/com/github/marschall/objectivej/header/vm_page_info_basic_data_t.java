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
 * typedef struct vm_page_info_basic {
 *     int disposition;
 *     int ref_count;
 *     vm_object_id_t object_id;
 *     memory_object_offset_t offset;
 *     int depth;
 *     int __pad;
 * } vm_page_info_basic_data_t
 * }
 */
public class vm_page_info_basic_data_t extends vm_page_info_basic {

    vm_page_info_basic_data_t() {
        // Should not be called directly
    }
}
