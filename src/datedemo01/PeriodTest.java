package src.datedemo01;

import java.time.LocalDate;
import java.time.Period;

public class PeriodTest {
  public static void main(String[] args) {
    // 当地时间 年月日
    LocalDate nowDate = LocalDate.now();

    LocalDate birDate = LocalDate.of(2000, 7, 12);

    Period p = Period.between(birDate, nowDate); // 第二个参数减去起一个参数

    System.out.println("相差的时间间隔 " + p);
    System.out.println(p.getYears());
    System.out.println(p.getMonths());
    System.out.println(p.getDays());

    System.out.println(p.toTotalMonths());
  }
}
