package src.threaddemo04.threadPractice.practice1;

public class MyThread extends Thread {
  public static int total = 100;
  public static int count = 1;
  
  public MyThread(String name) {
    super(name);
  }

  @Override
  public void run() {
    while (true) {
      synchronized(MyThread.class) {
        if (count > 100) {
          break;
        }
        if (count % 2 == 1) {
          System.out.println(getName() + ": 打印" + count);
        }
        count++;
      }
    }
  }
}
