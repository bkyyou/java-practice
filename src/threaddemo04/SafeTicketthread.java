package src.threaddemo04;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SafeTicketthread extends Thread {
  static int count = 100;
  static int currentCount = 1;
  static Lock lock = new ReentrantLock();
  static int runCount = 0;

  // 锁对象, 一定要是唯一的
  static Object obj = new Object();

  

  // @Override
  // public void run() {
  //   while (currentCount <= count) {
  //     synchronized (obj){
  //       try {
  //         Thread.sleep(10);
  //       } catch (InterruptedException e) {
  //         e.printStackTrace();
  //       }
  //       currentCount++;
  //       System.out.println("正在卖第" + currentCount + "张票");
  //     }
  //   }
  // }

  // @Override
  // public void run() {
  //   while (true) {
  //     // synchronized (obj){
  //     synchronized (SafeTicketthread.class){ // 一般使用的是当前类的字节码文件对象
  //       if (currentCount <= count) {
  //         try {
  //           Thread.sleep(10);
  //         } catch (InterruptedException e) {
  //           e.printStackTrace();
  //         }
  //         System.out.println("正在卖第" + currentCount + "张票");
  //         currentCount++;
  //       } else {
  //         break;
  //       }
  //     }
  //   }
  // }

  public SafeTicketthread() {
  }

  public SafeTicketthread(String name) {
    super(name);
  }



  @Override
  public void run() {
    while (true) {
      runCount++;
      System.out.println(1111);
      try {
        lock.lock();
        if (currentCount <= count) {
          try {
            Thread.sleep(1000);
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
          System.out.println(getName() +  ": 正在卖第" + currentCount + "张票");
          currentCount++;
        } else {
          break;
        }
      } catch (Exception e) {
        
      } finally {
        lock.unlock();
      }
    }
    System.out.println(runCount);
  }
}
