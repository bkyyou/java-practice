package src.datedemo01;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;

public class LocalDateTest {
  public static void main(String[] args) {
    localDateTimeTest();
    localDateTest();
    localTimeTest();
  }
  public static void localDateTimeTest() {
    
  }
  public static void localDateTest() {
    // 获取当前时间日历对象
    LocalDate ld = LocalDate.now();
    System.out.println(ld);

    // 指定日期格式
    LocalDate ld2 = LocalDate.of(2023, 1, 1);
    System.out.println(ld2);

    // get 方法获取指定属性值
    int year = ld2.getYear();
    System.out.println(year);

    // 获取月
    // 方式一
    Month m = ld2.getMonth();
    System.out.println(m);
    System.out.println(m.getValue());
    // 方式二
    int mValue = ld2.getMonthValue();
    System.out.println(mValue);

    // 获取日
    int d = ld2.getDayOfMonth();
    System.out.println(d);

    // 获取一年中的第几天
    int dofyear = ld2.getDayOfYear();
    System.out.println(dofyear);

    // 获取星期
    DayOfWeek dayofweek = ld2.getDayOfWeek();
    System.out.println(dayofweek);
    System.out.println(dayofweek.getValue());

    // is 开头方法表示判断
    System.out.println(ld.isAfter(ld2));
    System.out.println(ld.isBefore(ld2));

    // with 开头表示修改， 只能修改 年月日
    LocalDate ld3 = ld2.withYear(2034);
    System.out.println(ld3);

    // minus 开头表示减少， 只能修改 年月日
    LocalDate ld4 = ld3.minusYears(2);
    System.out.println(ld4);

    // plus 开头表示增加， 只能修改 年月日
    LocalDate ld5 = ld4.plusYears(1000);
    System.out.println(ld5);

    // 判断今天是否是你的生日
    LocalDate birDate = LocalDate.of(2000, 7, 1);
    LocalDate nowDate = LocalDate.now();

    // MonthDay birMd = MonthDay.of(birDate.getMonthValue(), birDate.getDayOfMonth());
    MonthDay birMd = MonthDay.from(birDate);
    MonthDay nowMd = MonthDay.from(nowDate);

    System.out.println("今天是你的生日么? " + birMd.equals(nowMd));

  }
  public static void localTimeTest() {

  }
}
