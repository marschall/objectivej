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
 * typedef struct processor_cpu_stat64 {
 *     uint64_t irq_ex_cnt;
 *     uint64_t ipi_cnt;
 *     uint64_t timer_cnt;
 *     uint64_t undef_ex_cnt;
 *     uint64_t unaligned_cnt;
 *     uint64_t vfp_cnt;
 *     uint64_t vfp_shortv_cnt;
 *     uint64_t data_ex_cnt;
 *     uint64_t instr_ex_cnt;
 *     uint64_t pmi_cnt;
 * } processor_cpu_stat64_data_t
 * }
 */
public class processor_cpu_stat64_data_t extends processor_cpu_stat64 {

    processor_cpu_stat64_data_t() {
        // Should not be called directly
    }
}

