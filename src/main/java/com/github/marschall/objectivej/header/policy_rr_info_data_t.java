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
 * typedef struct policy_rr_info {
 *     integer_t max_priority;
 *     integer_t base_priority;
 *     integer_t quantum;
 *     boolean_t depressed;
 *     integer_t depress_priority;
 * } policy_rr_info_data_t
 * }
 */
public class policy_rr_info_data_t extends policy_rr_info {

    policy_rr_info_data_t() {
        // Should not be called directly
    }
}
