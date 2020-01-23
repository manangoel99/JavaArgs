package com.cleancoder.args;

import java.util.Iterator;

public interface ArgumentMarshaler {
  /*
  Parent Class for each kind of argument marshaler
  */
  void set(Iterator<String> currentArgument) throws ArgsException;
}
