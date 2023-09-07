package src.iodemo01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedStreamTest {
  public static void main(String[] args) throws IOException {
    BufferedInputStream bis = new BufferedInputStream(new FileInputStream("src/aaa.txt"));
    BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("src/copy2.txt"));

    int by;
    while ((by = bis.read()) != -1) {
      bos.write(by);
    }

    bis.close();
    bos.close();
  }
}
