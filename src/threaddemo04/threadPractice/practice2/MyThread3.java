package src.threaddemo04.threadPractice.practice2;

import java.util.ArrayList;
import java.util.Collections;

public class MyThread3 extends Thread {

  ArrayList<Integer> list; // 这个是传入了同一个 list, 才会抽奖不重复

  // static {
  //   ArrayList<Integer> list = new ArrayList<>();
  //   Collections.addAll(list, 100, 200, 300, 500, 600, 700, 800);
  //   this.list
  // }
  
  public MyThread3(String name, ArrayList<Integer> list) {
    super(name);
    this.list = list;
  }

  @Override
  public void run() {
    while (true) {
      synchronized(MyThread3.class) {
        if (list.size() == 0) {
          break;
        }
        Collections.shuffle(list);
        Integer amount = list.remove(0);
        // System.out.println(getName() + amount);
        System.out.println(getName() + ": " + list);
      }
      try {
        Thread.currentThread().sleep(10);
      } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
    }
  }
}
