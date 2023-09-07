package src.iodemo01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileinputstreamTest02 {
  public static void main(String[] args) throws IOException {
    FileInputStream fis = new FileInputStream("src/aaa.txt");
    FileOutputStream fos = new FileOutputStream("src/copy.txt");
    int b;
    while ((b = fis.read()) != -1) {
      fos.write(b);
    }
    // 先开的后关闭
    fos.close();
    fis.close();
  }
}
