package src.unicodedemo01;

import java.io.FileReader;
import java.io.IOException;

public class UnicodeTest2 {
  public static void main(String[] args) throws IOException {
    // 一次读取一个
    FileReader fr = new FileReader("src/test.txt");
    int file;
    while((file = fr.read()) != -1) {
      // System.out.println((char)file);
      System.out.println(file);
    }
    fr.close();

    // 一次读取多个
    FileReader fr2 = new FileReader("src/test.txt");
    char[] charArr = new char[2];
    int len;
    while ((len = fr2.read(charArr)) != -1) {
      System.out.print(charArr[0]); // 直接打印汉字了呀 ???
      // System.out.print(new String(charArr, 0, len)); // 和上面打印的一样
    }
    fr2.close();
  }
}
