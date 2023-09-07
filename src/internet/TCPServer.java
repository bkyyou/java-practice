package src.internet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
  public static void main(String[] args) throws IOException {
    // TCP 协议 接收数据

    /**
     * 1. 创建对象 ServerSocker
     */
    ServerSocket server = new ServerSocket(10000);

    /**
     * 2. 监听客户端连接
     */
    Socket socket = server.accept();

    /**
     * 3. 从通道中获取输入流读取数据
     */
    InputStream is = socket.getInputStream();
    // 转换流
    InputStreamReader isr = new InputStreamReader(is);
    // 缓冲流
    BufferedReader br = new BufferedReader(isr);
    int b;
    // while ((b = isr.read()) != -1) {
    while ((b = br.read()) != -1) {
      System.out.println((char) b);
    }

    is.close();
    server.close();
  }
}
