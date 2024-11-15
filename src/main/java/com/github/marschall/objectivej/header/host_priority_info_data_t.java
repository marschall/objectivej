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
 * typedef struct host_priority_info {
 *     integer_t kernel_priority;
 *     integer_t system_priority;
 *     integer_t server_priority;
 *     integer_t user_priority;
 *     integer_t depress_priority;
 *     integer_t idle_priority;
 *     integer_t minimum_priority;
 *     integer_t maximum_priority;
 * } host_priority_info_data_t
 * }
 */
public class host_priority_info_data_t extends host_priority_info {

    host_priority_info_data_t() {
        // Should not be called directly
    }
}

