package com.cleancoder.args;

import java.util.Iterator;

public class BooleanArgumentMarshaler implements ArgumentMarshaler {
  private boolean booleanValue = false;

  public void set(Iterator<String> currentArgument) throws ArgsException {
    booleanValue = true;
  }

  public static boolean getValue(ArgumentMarshaler arg_marshaller) {
    if (arg_marshaller != null && arg_marshaller instanceof BooleanArgumentMarshaler) {
      return ((BooleanArgumentMarshaler) arg_marshaller).booleanValue;
    }
    else {
      return false;
    }
  }
}
