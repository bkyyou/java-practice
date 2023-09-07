package src.runtime;

import java.io.IOException;

public class Test {
  public static void main(String[] args) {
    Runtime r = Runtime.getRuntime();
    // r.exit(0);
    System.out.println(r.availableProcessors());
    System.out.println(r.maxMemory() / 1024 / 1024);
    System.out.println(r.totalMemory() / 1024 / 1024);

    // 运行 cmd 命令
    // shutdown 关机
    // 加上参数才能执行
    // -s 默认是在 1min 之后关机
    // -s -t 指定时间 : 指定关机时间
    // -a : 取消关机操作
    // -r: 关机并重启
    try {
      // r.exec("shutdown -s -t 3600");
      r.exec("shutdown -a");
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

  }
}
