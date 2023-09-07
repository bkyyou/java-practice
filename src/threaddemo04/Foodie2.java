package src.threaddemo04;

import java.util.concurrent.ArrayBlockingQueue;

public class Foodie2 extends Thread {
  public ArrayBlockingQueue<String> queue;

  public Foodie2(String name, ArrayBlockingQueue<String> queue) {
    super(name);
    this.queue = queue;
  }

  @Override
  public void run() {
    while (true) {
      try {
        String food = queue.take();
        System.out.println(food);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}
