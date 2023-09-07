package src.threaddemo04;

public class DieLock extends Thread {
  static Object obj1 = new Object();
  static Object obj2 = new Object();
  public DieLock() {
  }

  public DieLock(String name) {
    super(name);
  }

  @Override
  public void run() {
    if (getName().equals("线程一")) {
      synchronized(obj1) {
        System.out.println("我是线程一 - 1");
        synchronized(obj2) {
          System.out.println("我是线程一 - 2");
        }
      }
    } else {
      synchronized(obj2) {
        System.out.println("我是线程二 - 1");
        synchronized(obj1) {
          System.out.println("我是线程二 - 2");
        }
      }
    }
  }
}
