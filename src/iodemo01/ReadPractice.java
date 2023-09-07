package src.iodemo01;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadPractice {
  public static void main(String[] args) throws IOException {
    /*
     * 题目: 用字节流读中文, 不能出现乱码, 读一行
     */
    // 创建字节流
    FileInputStream fis = new FileInputStream("src/file/sortGuShi.txt");
    // 字节流读中文会出现乱码, 所以需要转换成 字符流. 使用转换流进行转换
    InputStreamReader fr = new InputStreamReader(fis);
    // 读一行只能是高级流, 创建高级流
    BufferedReader bis = new BufferedReader(fr);
    System.out.println(bis.readLine());
  }
}
