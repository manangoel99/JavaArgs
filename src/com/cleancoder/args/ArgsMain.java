package com.cleancoder.args;

import java.util.*;

public class ArgsMain {
  public static void main(String[] args) {
    try {
      Args                arg             = new Args("f,s*,n#,a##,p[*],d&", args);
      boolean             logging         = arg.getBoolean('f');
      int                 port            = arg.getInt('n');
      String              directory       = arg.getString('s');
      double              ip              = arg.getDouble('a');
      String[]            string_array    = arg.getStringArray('p');
      Map<String, String> map             = arg.getMap('d');
      

      executeApplication(logging, port, directory, ip, string_array, map);

    } 
    catch (ArgsException e) {
      System.out.printf("Argument error: %s\n", e.errorMessage());
    }
  }

  private static void executeApplication(boolean logging, int port, String directory, double ip, String[] string_array, Map<String, String> map) {
    System.out.printf(
      "Boolean is %s, Integer is %d, String is %s, Double is %f\n",
      logging, 
      port, 
      directory,
      ip
    );
    System.out.println("String array elements are : ");
    for (int i = 0; i < string_array.length; i++) {
        System.out.printf("%s\n", string_array[i]);
    }
    System.out.println(map.toString());
  }
}