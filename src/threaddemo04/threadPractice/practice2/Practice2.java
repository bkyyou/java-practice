package src.threaddemo04.threadPractice.practice2;

import java.util.ArrayList;
import java.util.Collections;

public class Practice2 {
  public static void main(String[] args) {
    // MyThread mt1 = new MyThread("线程1");
    // MyThread mt2 = new MyThread("线程2");
    // MyThread mt3 = new MyThread("线程3");
    // MyThread mt4 = new MyThread("线程4");
    // MyThread mt5 = new MyThread("线程5");

    MyThread2 mt1 = new MyThread2("线程1");
    MyThread2 mt2 = new MyThread2("线程2");
    MyThread2 mt3 = new MyThread2("线程3");
    MyThread2 mt4 = new MyThread2("线程4");
    MyThread2 mt5 = new MyThread2("线程5");

    // mt1.start();
    // mt2.start();
    // mt3.start();
    // mt4.start();
    // mt5.start();

    ArrayList<Integer> list = new ArrayList<>();
    // ArrayList<Integer> list2 = new ArrayList<>();
    Collections.addAll(list, 100, 200, 300, 500, 600, 700, 800);
    // Collections.addAll(list2, 100, 200, 300, 500, 600, 700, 800);

    MyThread3 myThread31 = new MyThread3("线程一", list);
    MyThread3 myThread32 = new MyThread3("线程二", list);

    myThread31.start();
    myThread32.start();

  }
}
