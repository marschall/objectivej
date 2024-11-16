package com.github.marschall.objectivej.api;

import java.util.Optional;

public interface ObjectiveCRuntime {

  Optional<ObjectiveCObject> lookupClass(String className);

}
