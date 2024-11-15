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
 * typedef struct vm_region_submap_info {
 *     vm_prot_t protection;
 *     vm_prot_t max_protection;
 *     vm_inherit_t inheritance;
 *     uint32_t offset;
 *     unsigned int user_tag;
 *     unsigned int pages_resident;
 *     unsigned int pages_shared_now_private;
 *     unsigned int pages_swapped_out;
 *     unsigned int pages_dirtied;
 *     unsigned int ref_count;
 *     unsigned short shadow_depth;
 *     unsigned char external_pager;
 *     unsigned char share_mode;
 *     boolean_t is_submap;
 *     vm_behavior_t behavior;
 *     vm32_object_id_t object_id;
 *     unsigned short user_wired_count;
 * } vm_region_submap_info_data_t
 * }
 */
public class vm_region_submap_info_data_t extends vm_region_submap_info {

    vm_region_submap_info_data_t() {
        // Should not be called directly
    }
}

