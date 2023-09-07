public class ThreadTest1 {
  public static void main(String[] args) {
    /**
     * 多线程的第一种启动方式
     */
    // MyThread t1 = new MyThread("线程1"); // 直接设置名字
    MyThread t1 = new MyThread();
    MyThread t2 = new MyThread();
    t1.setName("线程1");
    t2.setName("线程2");
    // start 开启线程
    t1.start();
    t2.start();
  }
}
