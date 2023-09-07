package src.unicodedemo01;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class UnicodeTest4 {
  public static void main(String[] args) throws IOException {
    FileReader fr = new FileReader("src/long.txt"); // 这个文件有 8192 个字节
    fr.read(); // 会把文件放到缓冲区
    // 清空文件
    FileWriter fw = new FileWriter("src/long.txt");

    /**
     * 问题: 如果再次使用 fr 进行读取, 会读到数据么
     * 
     * 正确答案: 会把缓冲区中的文件全部读完, 也只能读缓冲区的文件, 文件中剩余的数据无法再次读取
     */
    int ch;
    while((ch = fr.read()) != -1) {
      System.out.println((char) ch);
    }
    // 用 for 循环打印到指定位置, 看缓冲区数据变化, 体会底层文件读取
    // for (int i = 0; i < 8192; i++) {
    //   fr.read();
    // }
    // 在这打断可以看到缓冲区再次读取的存储内容, 在 bb 字段里
    // fr.read();
    fw.close();
    fr.close();
  }
}
