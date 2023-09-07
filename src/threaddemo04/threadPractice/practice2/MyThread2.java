package src.threaddemo04.threadPractice.practice2;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class MyThread2 extends Thread {
  public static BigDecimal totalMoney = BigDecimal.valueOf(100);
  public static int count = 3;
  public static BigDecimal MIN_PRICE = BigDecimal.valueOf(0.01);
  
  public MyThread2(String name) {
    super(name);
  }

  @Override
  public void run() {
    synchronized(MyThread2.class) {
      if (count == 0) {
        System.out.println(getName() + "没有抢到红包");
      } else {
        BigDecimal price;
        if (count == 1) {
          price = totalMoney;
        } else {
          double bounds = totalMoney.subtract(BigDecimal.valueOf(count - 1).multiply(MIN_PRICE)).doubleValue();
          Random r = new Random();
          price = BigDecimal.valueOf(r.nextDouble(bounds)).setScale(2, RoundingMode.HALF_UP);
          if (price.compareTo(MIN_PRICE) < 0) {
            price = MIN_PRICE;
          }
        }
        System.out.println(getName() + "中了" + price + "元");
        count--;
        totalMoney = totalMoney.subtract(price);
      }
    }
  }
}
