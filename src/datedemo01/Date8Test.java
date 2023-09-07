package src.datedemo01;

import java.util.Date;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Date8Test {
  public static void main(String[] args) {
    System.out.println(ZoneId.getAvailableZoneIds());
    System.out.println(ZoneId.systemDefault());
    System.out.println(ZoneId.of("Asia/Shanghai"));

    // 根据 (秒 / 毫秒 / 纳秒) 获取 Instant 对象
    Instant i1 = Instant.ofEpochMilli(0l); 
    System.out.println(i1);
    Instant i2 = Instant.ofEpochSecond(1l); // 秒
    System.out.println(i2);
    Instant i3 = Instant.ofEpochSecond(1l, 1000000000l); // 纳秒
    System.out.println(i3);

    // 指定时区
    ZonedDateTime time = Instant.now().atZone(ZoneId.of("Asia/Shanghai"));
    System.out.println(time);

    // isXXX 判断
    Instant i4 = Instant.ofEpochMilli(0l);
    Instant i5 = Instant.ofEpochMilli(1000l);
    boolean res = i4.isBefore(i5);
    System.out.println(res);
    boolean res2 = i4.isAfter(i5);
    System.out.println(res2);

    Instant i6 = Instant.ofEpochMilli(1000l);
    Instant i7 = i6.minusSeconds(2);
    System.out.println(i7);

    testZonedDateTime();
  }

  private static void testZonedDateTime() {
    // 当前时间对象 (带时区)
    ZonedDateTime now = ZonedDateTime.now();
    System.out.println(now);

    // 当前时间对象 (带时区)
    ZonedDateTime time1 = ZonedDateTime.of(2023, 10, 1, 11, 12, 12, 0, ZoneId.of("Asia/Shanghai"));
    System.out.println(time1);

    // 通过 Instant + 时区的方式指定获取时间对象
    Instant i1 = Instant.ofEpochMilli(0l);
    ZoneId zoneId1 = ZoneId.of("Asia/Shanghai");
    ZonedDateTime time2 = ZonedDateTime.ofInstant(i1, zoneId1);
    System.out.println(time2);

    // withXxx 修改时间系列的方法
    ZonedDateTime time3 = time2.withYear(2000);
    System.out.println(time3);

    // 减少时间
    ZonedDateTime time4 = time3.minusYears(2000);
    System.out.println(time4);

    // 增加时间
    ZonedDateTime time5 = time3.plusYears(2000);
    System.out.println(time5);


    dateTimeFormatterTest();
  }
  private static void dateTimeFormatterTest() {
    // 获取时间对象 atZone 指定时区
    ZonedDateTime z1 = Instant.now().atZone(ZoneId.of("Asia/Shanghai"));
    // 解析/格式化器 
    DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH-mm-ss EE a");
    // 格式化
    System.out.println(dtf1.format(z1)); // 2023-07-01 07-43-51 周六 上午

    // Date d = new Date();
    // System.out.println(dtf1.format(d));  // 报错
  }
}
