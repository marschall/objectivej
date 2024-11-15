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
 * typedef struct dyld_kernel_process_info {
 *     struct dyld_kernel_image_info cache_image_info;
 *     uint64_t timestamp;
 *     uint32_t imageCount;
 *     uint32_t initialImageCount;
 *     uint8_t dyldState;
 *     boolean_t no_cache;
 *     boolean_t private_cache;
 * } dyld_kernel_process_info_t
 * }
 */
public class dyld_kernel_process_info_t extends dyld_kernel_process_info {

    dyld_kernel_process_info_t() {
        // Should not be called directly
    }
}

