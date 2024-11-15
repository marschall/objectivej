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
 * typedef struct vm_statistics {
 *     natural_t free_count;
 *     natural_t active_count;
 *     natural_t inactive_count;
 *     natural_t wire_count;
 *     natural_t zero_fill_count;
 *     natural_t reactivations;
 *     natural_t pageins;
 *     natural_t pageouts;
 *     natural_t faults;
 *     natural_t cow_faults;
 *     natural_t lookups;
 *     natural_t hits;
 *     natural_t purgeable_count;
 *     natural_t purges;
 *     natural_t speculative_count;
 * } vm_statistics_data_t
 * }
 */
public class vm_statistics_data_t extends vm_statistics {

    vm_statistics_data_t() {
        // Should not be called directly
    }
}
