package src.threaddemo04;

public class SafeTicketMyRunnable implements Runnable {
  int count = 0;
  int ticketTotal = 100;

  @Override
  public void run() {
    while (true) {
      if (!this.safeTicket()) {
        break;
      }
    }
  }
  public synchronized boolean safeTicket() {
    boolean flag = true;
    if (count < ticketTotal) {
      try {
        Thread.sleep(10);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      count++;
      System.out.println(Thread.currentThread().getName() + "正在卖第" + count + "张票");
    } else {
      flag = false;
    }
    return flag;
  }


}
