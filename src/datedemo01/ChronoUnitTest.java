package src.datedemo01;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest {
  public static void main(String[] args) {
    LocalDateTime nowDateTime = LocalDateTime.now();
    LocalDateTime birDateTime = LocalDateTime.of(2000, 1, 1, 0, 0, 0);

    System.out.println("相差的年数： " + ChronoUnit.YEARS.between(birDateTime, nowDateTime));
    System.out.println("相差的月数： " + ChronoUnit.MONTHS.between(birDateTime, nowDateTime));
    System.out.println("相差的周数： " + ChronoUnit.WEEKS.between(birDateTime, nowDateTime));
    System.out.println("相差的天数： " + ChronoUnit.DAYS.between(birDateTime, nowDateTime));
    System.out.println("相差的时数： " + ChronoUnit.HOURS.between(birDateTime, nowDateTime));
    System.out.println("相差的分钟： " + ChronoUnit.MINUTES.between(birDateTime, nowDateTime));
    System.out.println("相差的秒数： " + ChronoUnit.SECONDS.between(birDateTime, nowDateTime));
    System.out.println("相差的毫秒数： " + ChronoUnit.MILLIS.between(birDateTime, nowDateTime));
    System.out.println("相差的微秒数： " + ChronoUnit.MICROS.between(birDateTime, nowDateTime));
    System.out.println("相差的纳秒数： " + ChronoUnit.NANOS.between(birDateTime, nowDateTime));
    System.out.println("相差的半天数： " + ChronoUnit.HALF_DAYS.between(birDateTime, nowDateTime));
    System.out.println("相差的十年数： " + ChronoUnit.DECADES.between(birDateTime, nowDateTime));
    System.out.println("相差的世纪(百年)数： " + ChronoUnit.CENTURIES.between(birDateTime, nowDateTime));
    System.out.println("相差的千年数： " + ChronoUnit.MILLENNIA.between(birDateTime, nowDateTime));
    System.out.println("相差的纪元数： " + ChronoUnit.ERAS.between(birDateTime, nowDateTime));
  }
}
