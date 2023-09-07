package src.threadpoll;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor.DiscardPolicy;

public class ThreadPollTest01 {
  public static void main(String[] args) throws InterruptedException, RejectedExecutionException {
    // pollTest1();
    // pollTest2();
    // ThreadPoolExecutor.AbortPolicy
    // ThreadPoolExecutor.DiscardPolicy
    // ThreadPoolExecutor.DiscardOldestPolicy
    // ThreadPoolExecutor.CallerRunsPolicy

    getRunProcess();
  }
  public static void pollTest2() throws InterruptedException  {
    ExecutorService pool1 = Executors.newFixedThreadPool(3);

    pool1.submit(new MyRunnable());
    pool1.submit(new MyRunnable());
    pool1.submit(new MyRunnable());
    pool1.submit(new MyRunnable());
    pool1.submit(new MyRunnable());
    pool1.submit(new MyRunnable());
    pool1.submit(new MyRunnable());
    pool1.shutdown();
  }
  public static void pollTest1() throws InterruptedException  {
    MyRunnable mr = new MyRunnable();
    // Thread t = new Thread(mr, "线程一");
    ExecutorService pool1 = Executors.newCachedThreadPool();

    pool1.submit(new MyRunnable());
    Thread.sleep(1000);
    System.out.println("----");
    pool1.submit(new MyRunnable());
    pool1.shutdown();
  }
  public static void getRunProcess() {
    int count = Runtime.getRuntime().availableProcessors();
    System.out.println(count);
  }
}
