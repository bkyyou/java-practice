package src.threaddemo04.threadPractice.practice2;

import java.util.Random;

public class MyThread extends Thread {
  public static double totalMoney = 100;
  public static int count = 3;
  public static double MIN_PRICE = 0.01;

  public MyThread(String name) {
    super(name);
  }
  
  @Override
  public void run() {
    synchronized(MyThread.class) {
      if (count == 0) {
        System.out.println(getName() + "没有抢到红包");
      } else {
        Random r = new Random();
        double price = r.nextDouble(totalMoney - MIN_PRICE * (count - 1));
        price = price == 0 ? MIN_PRICE : price;
        if (count == 1) {
          price = totalMoney;
        }
        System.out.println(getName() + "抢到了" + price + "元");
        count--;
        totalMoney = totalMoney - price;
      }
    }
  }
}
