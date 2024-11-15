#include <objc/objc-class.h>
#include <objc/objc-exception.h>
#include <objc/runtime.h>
#include <objc/message.h>
#include <objc/objc.h>
#include <objc/objc-auto.h>
#include <objc/objc-sync.h>

// objc/NSObjCRuntime.h

// OBJC_EXPORT id _Nullable
// objc_msgSend_X(id _Nullable self, SEL _Nonnull op, ...)
//     OBJC_AVAILABLE(10.0, 2.0, 9.0, 1.0, 2.0);
