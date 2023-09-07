package src.datedemo01;

import java.time.Duration;
import java.time.LocalDateTime;

public class DurationTest {
  public static void main(String[] args) {
    LocalDateTime nowDateTime = LocalDateTime.now();
    LocalDateTime birDateTime = LocalDateTime.of(2000, 1, 1, 0, 0, 0);
    Duration d = Duration.between(birDateTime, nowDateTime);

    // 相差的时间间隔
    System.out.println("相差的时间间隔 " + d);

    System.out.println("两个时间差天数 " + d.toDays());
    System.out.println("两个时间差小时数 " + d.toHours());
    System.out.println("两个时间差分钟数 " + d.toMinutes());
    System.out.println("两个时间差毫秒数 " + d.toMillis());
    System.out.println("两个时间差纳秒数 " + d.toNanos());
  }
}
