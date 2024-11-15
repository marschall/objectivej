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
 * typedef struct task_power_info_v2 {
 *     task_power_info_data_t cpu_energy;
 *     gpu_energy_data gpu_energy;
 *     uint64_t task_energy;
 *     uint64_t task_ptime;
 *     uint64_t task_pset_switches;
 * } task_power_info_v2_data_t
 * }
 */
public class task_power_info_v2_data_t extends task_power_info_v2 {

    task_power_info_v2_data_t() {
        // Should not be called directly
    }
}

