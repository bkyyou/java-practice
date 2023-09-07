package src.exercises;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class GenerateStudentFile {
  public static void main(String[] args) throws IOException {
    String[] xing = {"赵", "钱", "孙", "李", "周", "吴", "郑", "王", "冯", "陈", "褚", "卫", "蒋", "沈", "韩", "杨", "朱", "秦", "尤", "许"};
    int[] ageArr = {18, 19, 20};
    BufferedWriter bw = new BufferedWriter(new FileWriter("src/exercises/student.txt"));
    int studentCount = 10;
    for (int i = 0; i < studentCount; i++) {
      StringBuilder sb = new StringBuilder();
      sb.append(xing[i] + i + i);
      sb.append("-");
      sb.append(Math.random() > 0.5 ? "男" : "女");
      sb.append("-");
      sb.append(ageArr[(int) Math.floor(Math.random() * ageArr.length)]);
      sb.append("-");
      sb.append(1);
      bw.write(sb.toString());
      bw.newLine();
    }
    bw.close();
  }
}
