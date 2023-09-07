package src.filedemo01;

import java.io.File;

public class FileTest01 {
  public static void main(String[] args) {
    String path = "/Users/j/Desktop/my/java/practice/test.txt";
    File file1 = new File(path);
    System.out.println(file1);

    String parentPath = "/Users/j/Desktop/my/java/practice";
    String childPath = "test.txt";
    File file2 = new File(parentPath, childPath);
    System.out.println(file2);
  }
}
