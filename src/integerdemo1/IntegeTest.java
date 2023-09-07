package src.integerdemo1;

import java.time.LocalDate;
import java.util.Scanner;

public class IntegeTest {
  public static void main(String[] args) {

    Integer i1 = new Integer(1);

    Integer i2 = Integer.valueOf(127);
    Integer i3 = Integer.valueOf(127);
    System.out.println(i2 == i3); // true
    
    Integer i4 = Integer.valueOf(128);
    Integer i5 = Integer.valueOf(128);
    System.out.println(i4 == i5); // false

    // Integer.toBinaryString(0)
    // Integer.toOctalString(0)

    String s = "true";
    boolean b = Boolean.parseBoolean(s);
    System.out.println(b);

    Scanner sc = new Scanner(System.in);
    System.out.println("请输入一个数字");
    // String str = sc.next();
    String line = sc.nextLine();
    double d = Double.parseDouble(line);
    System.out.println(d);

    LocalDate ld = LocalDate.of(2000, 1, 1);
    System.out.println(ld.isLeapYear());
  }
}
