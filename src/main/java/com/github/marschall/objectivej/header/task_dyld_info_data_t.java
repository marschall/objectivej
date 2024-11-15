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
 * typedef struct task_dyld_info {
 *     mach_vm_address_t all_image_info_addr;
 *     mach_vm_size_t all_image_info_size;
 *     integer_t all_image_info_format;
 * } task_dyld_info_data_t
 * }
 */
public class task_dyld_info_data_t extends task_dyld_info {

    task_dyld_info_data_t() {
        // Should not be called directly
    }
}
