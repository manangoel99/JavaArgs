package com.cleancoder.args;

import java.util.*;

public class ArgsMain {
  public static void main(String[] args) {
    try {
      // Declare Schema for arguments
      Args                arg             = new Args("f,s*,n#,a##,p[*],d&", args);
      // Fetch Each kind of command line argument
      boolean             booleanArg      = arg.getBoolean('f');
      int                 intArg          = arg.getInt('n');
      String              stringArg       = arg.getString('s');
      double              doubleArg       = arg.getDouble('a');
      String[]            stringArrayArg  = arg.getStringArray('p');
      Map<String, String> mapArg          = arg.getMap('d');
      

      executeApplication(booleanArg, intArg, stringArg, doubleArg, stringArrayArg, mapArg);

    } 
    catch (ArgsException e) {
      System.out.printf("Argument error: %s\n", e.errorMessage());
    }
  }

  private static void executeApplication(
    boolean   booleanArg,     int                 intArg, 
    String    stringArg,      double              doubleArg, 
    String[]  stringArrayArg, Map<String, String> mapArg) {

    System.out.printf("Boolean is %s\n", booleanArg);
    System.out.printf("Integer is %d\n", intArg);

    if (!stringArg.isEmpty()) {
      System.out.printf("String is %s\n", stringArg);
    }

    System.out.printf("Double is %f\n", doubleArg);

    if (stringArrayArg.length > 0) {
      System.out.println("String array elements are : ");
      for (int i = 0; i < stringArrayArg.length; i++) {
        System.out.printf("%s\n", stringArrayArg[i]);
      }
    }
    if (!mapArg.isEmpty()) {
      System.out.println(mapArg.toString());
    }
  }
}