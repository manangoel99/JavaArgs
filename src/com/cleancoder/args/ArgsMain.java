package com.cleancoder.args;

public class ArgsMain {
  public static void main(String[] args) {
    try {
      Args      arg       = new Args("f,s*,n#,a##,p[*]", args);
      boolean   logging   = arg.getBoolean('f');
      int       port      = arg.getInt('n');
      String    directory = arg.getString('s');
      double    ip        = arg.getDouble('a');
      String[]  map       = arg.getStringArray('p');
      

      executeApplication(logging, port, directory, ip, map);

    } 
    catch (ArgsException e) {
      System.out.printf("Argument error: %s\n", e.errorMessage());
    }
  }

  private static void executeApplication(boolean logging, int port, String directory, double ip, String[] map) {
    System.out.printf(
      "Boolean is %s, Integer is %d, String is %s, Double is %f\n",
      logging, 
      port, 
      directory,
      ip
    );
    System.out.println("String array elements are : ");
    for (int i = 0; i < map.length; i++) {
        System.out.printf("%s\n", map[i]);
    }
  }
}