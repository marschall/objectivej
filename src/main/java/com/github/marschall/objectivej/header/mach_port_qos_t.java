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
 * typedef struct mach_port_qos {
 *     unsigned int name : 1;
 *     unsigned int prealloc : 1;
 *     boolean_t pad1 : 30;
 *     natural_t len;
 * } mach_port_qos_t
 * }
 */
public class mach_port_qos_t extends mach_port_qos {

    mach_port_qos_t() {
        // Should not be called directly
    }
}

