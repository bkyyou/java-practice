package src.test;

import java.util.Scanner;

public class TestString2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("请输入字符串");
    String str = sc.next();

    int bigCount = 0;
    int smallCount = 0;
    int numberCount = 0;

    for (int i = 0; i < str.length(); i++) {
      // char 类型变量在参与计算的时候自动类型提升为 int， 查询 ascii 码表
      char c = str.charAt(i);

      if (c >= 'a' && c <= 'z') {
        smallCount++;
      } else if (c >= 'A' && c <= 'Z') {
        bigCount++;
      } else if (c >= '0' && c <= '9') {
        numberCount++;
      }
    }

    System.out.println(smallCount + " " + bigCount + " " + numberCount);
  }
}
