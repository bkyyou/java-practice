package src.threaddemo04;

import java.util.concurrent.ArrayBlockingQueue;

public class ThreadMethodTest {
  public static void main(String[] args) throws InterruptedException {
    // System.out.println(111);
    // Thread.sleep(3000);
    // System.out.println(2222);

    // setDaemonTest();

    // Mythread1 mt1 = new Mythread1("女神");
    // mt1.start();
    // // 把 女神这个线程插入到当前线程, 当前线程是 main 线程, 就是 女神线程执行完之后再开始执行 main 线程
    // mt1.join();
    // for (int i = 0; i < 10; i++) {
    //   System.out.println("在 main 线程执行");
    // }

    // safeTicketThreadTest();
    // runnableSafeTicketTest();
    // dieLock();

    // producersAndConsumersTest();
    producersAndConsumersTest2();
  }
  public static void setDaemonTest() {
    Mythread1 mt1 = new Mythread1("女神");
    Mythread2 mt2 = new Mythread2("备胎");
    mt2.setDaemon(true);
    mt1.start();
    mt2.start();
  }
  public static void safeTicketThreadTest() {
    SafeTicketthread stt1 = new SafeTicketthread("窗口1");
    SafeTicketthread stt2 = new SafeTicketthread("窗口2");
    SafeTicketthread stt3 = new SafeTicketthread("窗口3");

    stt1.start();
    stt2.start();
    stt3.start();
  }
  public static void runnableSafeTicketTest() {
    SafeTicketMyRunnable st = new SafeTicketMyRunnable();

    Thread t1 = new Thread(st, "窗口1");
    Thread t2 = new Thread(st, "窗口2");
    Thread t3 = new Thread(st, "窗口3");

    t1.start();
    t2.start();
    t3.start();

  }

  public static void dieLock() {
    DieLock dieLockThread1 = new DieLock("线程一");
    DieLock dieLockThread2 = new DieLock("线程二");

    dieLockThread1.start();
    dieLockThread2.start();
  }

  static void producersAndConsumersTest() {
    CookThead ck = new CookThead("厨师");
    FoodieThead ft = new FoodieThead("吃货");

    ck.start();
    ft.start();
  }

  static void producersAndConsumersTest2() {
    ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(1);
    Cook2 ck = new Cook2("厨师", queue);
    Foodie2 ft = new Foodie2("吃货", queue);

    ck.start();
    ft.start();
  }
}
