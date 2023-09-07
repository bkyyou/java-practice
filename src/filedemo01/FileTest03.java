package src.filedemo01;

import java.io.File;
import java.io.IOException;

public class FileTest03 {
  public static void main(String[] args) throws IOException {
    String path = "/Users/j/Desktop/my/java/practice/src/aaa.js";
    File file1 = new File(path);
    // boolean b = file1.createNewFile();
    // System.out.println(b);

    // File file2 = new File("/Users/j/Desktop/my/java/practice/src/aaa");
    // boolean b2 = file2.mkdir();
    // System.out.println(b2);

    File file3 = new File("/Users/j/Desktop/my/java/practice/src/test/bb/aaa");
    boolean b3 = file3.mkdirs();
    System.out.println(b3);
  }
}
