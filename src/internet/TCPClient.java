package src.internet;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class TCPClient {
  public static void main(String[] args) throws IOException, InterruptedException {
    // TCP 协议, 发送数据

    /**
     * 1. 创建 Socket 对象
     * 细节: 在创建对象的同时会连接服务端, 如果连接不上, 代码会报错
     */
    Socket socket = new Socket("127.0.0.1", 10000);

    /**
     * 2. 从连接通道获取输出流
     */
    OutputStream os = socket.getOutputStream();

    int count = 0;
    // 写出数据
    // os.write("aaa".getBytes());
    while (true) {
      if (count >= 3) {
        break;
      }
      os.write("你好啊！！！".getBytes());
      count++;
      Thread.sleep(3000);
    }

    /**
     * 3. 释放资源
     */
    os.close();
    socket.close();
  }
}
