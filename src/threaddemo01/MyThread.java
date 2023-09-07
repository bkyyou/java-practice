// import java.lang.Thread;

public class MyThread extends Thread {
  
  
  public MyThread() {
  }

  public MyThread(String name) {
    super(name);
  }

  @Override
  public void run() {
    for (int i = 0; i < 1000; i++) {
      System.out.println(getName() + "-" + i);
    }
  }
}
