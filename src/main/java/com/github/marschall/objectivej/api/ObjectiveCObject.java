package com.github.marschall.objectivej.api;

public interface ObjectiveCObject {

  ObjectiveCObject msgSend(String selector, Object... arguments);

}
