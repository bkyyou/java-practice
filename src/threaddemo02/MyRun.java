package src.threaddemo02;

public class MyRun implements Runnable {

  @Override
  public void run() {
    for (int i = 0; i < 1000; i++) {
      // 获取当前线程方法
      Thread t = Thread.currentThread();
      System.out.println(t.getName() + "-" + "helloworld");
    }
  }
  
}
