package com.cleancoder.args;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

import static com.cleancoder.args.ArgsException.ErrorCode.*;

public class MapArgumentMarshaler implements ArgumentMarshaler {
  private final Map<String, String> map = new HashMap<>();

  public void set(final Iterator<String> currentArgument) throws ArgsException {
    try {
      final String[] mapEntries = currentArgument.next().split(",");

      for (final String entry : mapEntries) {
        final String[] entryComponents = entry.split(":");

        if (entryComponents.length != 2) {
          throw new ArgsException(MALFORMED_MAP);
        }
        map.put(entryComponents[0], entryComponents[1]);
      }
    } 
    catch (final NoSuchElementException e) {
      throw new ArgsException(MISSING_MAP);
    }
  }

  public static Map<String, String> getValue(final ArgumentMarshaler arg_marshaller) {
    if (arg_marshaller != null && arg_marshaller instanceof MapArgumentMarshaler)
      return ((MapArgumentMarshaler) arg_marshaller).map;
    else
      return new HashMap<>();
  }
}
