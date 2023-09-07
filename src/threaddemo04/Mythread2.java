package src.threaddemo04;

public class Mythread2 extends Thread {

  public Mythread2() {
  }

  public Mythread2(String name) {
    super(name);
  }

  @Override
  public void run() {
    for (int i = 0; i < 1000; i++) {
      System.out.println(getName() + "-" + i);
    }
  }
}
