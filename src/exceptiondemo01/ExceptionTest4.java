package src.exceptiondemo01;

import java.util.Scanner;

public class ExceptionTest4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    People p = new People();

    while (true) {
      try {
        System.out.println("请输入名字");
        String name = sc.nextLine();
        p.setName(name);
        System.out.println("请输入年龄");
        String ageStr = sc.nextLine();
        int age = Integer.parseInt(ageStr);
        p.setAge(age);
        break;
      } catch (NumberFormatException e) {
        e.printStackTrace();
      } catch (RuntimeException e) {
        e.printStackTrace();
      }
    }
  }
}
