package src.threaddemo02;

public class ThreadTest1 {
  public static void main(String[] args) {
    /**
     * 开启多线程的第二种方式
     */
    // 创建 MyRun 对象, 表示多线程要执行的任务
    MyRun mr = new MyRun();

    // 创建线程对象
    Thread t1 = new Thread(mr);
    Thread t2 = new Thread(mr);

    // 给线程设计名字
    t1.setName("t1");
    t2.setName("t2");

    // 开启线程
    t1.start();
    t2.start();
  }
}
