package src.filedemo01;

import java.io.File;
import java.io.IOException;

public class FileTest04 {
  public static void main(String[] args) throws IOException {
    File file = new File("/Users/j/Desktop/my/java/practice/src/bbb.js");
    boolean cb = file.createNewFile();
    System.out.println(cb);
    float count = 1;
    while (count < 3.402823e+8 - 2) {
      count++;
    }
    boolean db = file.delete();
    System.out.println(db);

  }
}
