package src.test;
// 导包， 找到 Scanner 这个类在哪
import java.util.Scanner;

public class Test1 {
  public static void main(String[] args) {
    // 创建对象
    // Scanner sc = new Scanner(System.in);
    // System.out.println("请输入数字");
    // // 接收数据, 赋值给 i
    // int i = sc.nextInt();
    // System.out.println(i);

    int a = 1;
    double b = a;

    System.out.println(true | false);
    System.out.println(true & false);

    int max = 1 > 0 ? 1 : 0;
    System.out.println(1 > 0 ? 1 : 0);

    int count = 1;
    switch (count) {
      case 1 -> {
        System.out.println(1);
      }
      case 2 -> {
        System.out.println(2);
      }
      default -> {
        System.out.println("default");
      }
    }
    switch (count) {
      case 1 -> System.out.println(1);
      case 2 -> System.out.println(2);
      default -> System.out.println("default");
    }

    int[] arr1 = new int[]{1, 2, 3};
    System.out.println(arr1);

    // for (int arr12 = 0; arr12 < arr1.length; arr12++) {
      
    // }
  }
}