package src.threaddemo04;

public class Mythread1 extends Thread {
  
  public Mythread1() {
  }

  public Mythread1(String name) {
    super(name);
  }

  @Override
  public void run() {
    for (int i = 0; i < 10; i++) {
      System.out.println(getName() + "-" + i);
      Thread.yield();
    }
  }
}
