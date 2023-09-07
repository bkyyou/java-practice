package src.filedemo01;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class FileTest02 {
  public static void main(String[] args) {
    String path = "/Users/j/Desktop/my/java/practice/src/test.js";
    File file1 = new File(path);
    System.out.println(file1.exists());
    System.out.println(file1.isFile());
    System.out.println(file1.isDirectory());

    File file2 = new File("/Users/j/Desktop/my/java/practice/src");
    System.out.println(file2.exists());
    System.out.println(file2.isFile());
    System.out.println(file2.isDirectory());

    long lastMod = file1.lastModified();
    Date d = new Date(lastMod);
    SimpleDateFormat s = new SimpleDateFormat("yyyy年MM月dd HH:mm:ss");
    System.out.println(s.format(d));

  }
}
