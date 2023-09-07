package src.threaddemo03;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadTest3 {
  public static void main(String[] args) throws InterruptedException, ExecutionException {
    /**
     * 多线程的第三种实现方式
     */

    // 创建 MyCallable 的对象 (表示多线程要执行的任务)
    MyCallable mc = new MyCallable();
    // 创建 FutureTask 的对象. (作用管理多线程运行的结果)
    FutureTask<Integer> ft = new FutureTask<>(mc);
    // 创建线程的对象
    Thread t1 = new Thread(ft);
    // 启动线程
    t1.start();
    // 获取多线程的运行结果
    Integer res = ft.get();
    System.out.println(res);

    Thread t = Thread.currentThread();
    String name = t.getName();
    System.out.println(name); // main
  }
}
