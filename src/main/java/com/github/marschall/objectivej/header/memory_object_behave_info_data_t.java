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
 * typedef struct memory_object_behave_info {
 *     memory_object_copy_strategy_t copy_strategy;
 *     boolean_t temporary;
 *     boolean_t invalidate;
 *     boolean_t silent_overwrite;
 *     boolean_t advisory_pageout;
 * } memory_object_behave_info_data_t
 * }
 */
public class memory_object_behave_info_data_t extends memory_object_behave_info {

    memory_object_behave_info_data_t() {
        // Should not be called directly
    }
}

