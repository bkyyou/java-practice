package src.threaddemo04;

public class FoodieThead extends Thread {
  
  public FoodieThead() {
  }

  public FoodieThead(String name) {
    super(name);
  }

  @Override
  public void run() {
    while(true) {
      synchronized(DeskThead.lock) {
          if (DeskThead.theadFlag == 1) {
            // DeskThead.count += 1;
            System.out.println("吃货正在吃" + DeskThead.count + "碗面条");
            DeskThead.lock.notifyAll();
            DeskThead.theadFlag = 0;

            if (DeskThead.count == DeskThead.eatTotal) {
              break;
            }
          } else {
            try {
              DeskThead.lock.wait();
            } catch (InterruptedException e) {
              e.printStackTrace();
            }
          }
      }
    }
  }
}
