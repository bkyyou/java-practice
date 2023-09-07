package src.datedemo01;

import java.util.Date;
import java.util.Random;

public class DateTest {
  public static void main(String[] args) {
    // new SimpleDateFormat()
    // new Calendar();

    // 创建一个时间
    Date d1 = new Date();
    System.out.println(d1);

    // 创建一个指定的时间
    Date d2 = new Date(0l);
    System.out.println(d2);

    // setTime 修改时间
    d2.setTime(1000l);
    System.out.println(d2);

    // getTime 获取当前时间毫秒值
    long t1 = d1.getTime();
    System.out.println(t1);

    // 打印原始点开始一年之后的时间
    Date d3 = new Date(0l);
    long time = d3.getTime();
    time = time + 1000l * 60 * 60 * 24 * 365;
    d3.setTime(time);
    System.out.println(d3);

    method1();

  }

  private static void method1() {
    // 任意两个时间对象, 比较哪个在前，哪个在后
    Random r = new Random();
    Date d1 = new Date(Math.abs(r.nextInt())); // int 隐式转换 long
    Date d2 = new Date(Math.abs(r.nextInt()));

    System.out.println(d1.getTime());;
    System.out.println(d2.getTime());;
  }
}
