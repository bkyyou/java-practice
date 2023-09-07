package src.threaddemo04;

import java.util.concurrent.ArrayBlockingQueue;

public class Cook2 extends Thread {
  public ArrayBlockingQueue<String> queue;

  public Cook2(String name, ArrayBlockingQueue<String> queue) {
    super(name);
    this.queue = queue;
  }
  
  @Override
  public void run() {
    while (true) {
      try {
        queue.put("面条");
        System.out.println(getName());
      } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
    }
  }
}
