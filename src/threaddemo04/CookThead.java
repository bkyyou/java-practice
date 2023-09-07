package src.threaddemo04;

public class CookThead extends Thread {
  
  public CookThead() {
  }

  public CookThead(String name) {
    super(name);
  }

  @Override
  public void run() {
    while (true) {
      synchronized(DeskThead.lock) {
        if (DeskThead.count == DeskThead.eatTotal) {
          break;
        } else {
          if (DeskThead.theadFlag == 1) {
            try {
              DeskThead.lock.wait();
            } catch (InterruptedException e) {
              e.printStackTrace();
            }
          } else {
            DeskThead.count++;
            System.out.println("厨师正在做第" + DeskThead.count + "碗面条");
            DeskThead.lock.notifyAll();
            DeskThead.theadFlag = 1;
          }
        }
      }
    }
  }
}
