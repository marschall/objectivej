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
 * typedef struct __darwin_arm_vfp_state {
 *     __uint32_t __r[64];
 *     __uint32_t __fpscr;
 * } arm_vfp_state_t
 * }
 */
public class arm_vfp_state_t extends __darwin_arm_vfp_state {

    arm_vfp_state_t() {
        // Should not be called directly
    }
}
