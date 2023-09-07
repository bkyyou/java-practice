package src.iodemo01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class BufferedStreamTest04 {
  public static void main(String[] args) throws IOException {
    /**
     * 这种方式不需要掌握, 因为在 JDK11 时候, 已经被替代
     */
    // newSortGuShi 我在 vscode 中使用 GBK 进行保存的, 需要使用 GBK 进行读取
    // InputStreamReader isr = new InputStreamReader(new FileInputStream("src/file/newSortGuShi.txt"), "UTF-8");
    InputStreamReader isr = new InputStreamReader(new FileInputStream("src/file/newSortGuShi.txt"), "GBK");
    int ch;
    while((ch = isr.read()) != -1) {
      // System.out.print((char) ch);
    }
    isr.close();

    /**
     * 替代方案
     */
    FileReader fr = new FileReader("src/file/newSortGuShi.txt", Charset.forName("GBK"));
    int ch2;
    while((ch2 = fr.read()) != -1) {
      System.out.print((char) ch2);
    }
    fr.close();
  }
}
