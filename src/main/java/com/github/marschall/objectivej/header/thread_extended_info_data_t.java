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
 * typedef struct thread_extended_info {
 *     uint64_t pth_user_time;
 *     uint64_t pth_system_time;
 *     int32_t pth_cpu_usage;
 *     int32_t pth_policy;
 *     int32_t pth_run_state;
 *     int32_t pth_flags;
 *     int32_t pth_sleep_time;
 *     int32_t pth_curpri;
 *     int32_t pth_priority;
 *     int32_t pth_maxpriority;
 *     char pth_name[64];
 * } thread_extended_info_data_t
 * }
 */
public class thread_extended_info_data_t extends thread_extended_info {

    thread_extended_info_data_t() {
        // Should not be called directly
    }
}
