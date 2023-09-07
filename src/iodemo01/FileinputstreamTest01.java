package src.iodemo01;

import java.io.FileInputStream;
import java.io.IOException;

public class FileinputstreamTest01 {
  public static void main(String[] args) throws IOException {
    FileInputStream fis = new FileInputStream("src/aaa.txt");
    // while (true) {
    //   int b = fis.read(); // 每次打印一个字母
    //   if(b == -1) {
    //     break;
    //   }
    //   System.out.println((char) b);
    // }
    int b;
    while ((b = fis.read()) != -1) {
      System.out.println((char) b);
    }
    fis.close();
  }
}
