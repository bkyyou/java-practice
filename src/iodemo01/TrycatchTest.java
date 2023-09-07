package src.iodemo01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TrycatchTest {
  public static void main(String[] args) {
    FileInputStream fis = null;
    FileOutputStream fos = null;

    try {
      fis = new FileInputStream("src/aaa.txt");
      fos = new FileOutputStream("src/aaacopy2.txt");
      int len;
      byte[] streamArr = new byte[1024 * 1024 * 5];
      while ((len = fis.read(streamArr)) != -1) {
        fos.write(streamArr, 0, len);
      }
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      if (fis != null) {
        try {
          fis.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
      if (fos != null) {
        try {
          fos.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
    }
  }
}
