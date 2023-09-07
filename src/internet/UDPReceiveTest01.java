package src.internet;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPReceiveTest01 {
  public static void main(String[] args) throws IOException {
    /**
     * 1. 创建 DatagramSocket 对象
     * 细节: 在接收时一定要绑定端口号, 并且要和发送端保持一致
     */
    int port = 10086;
    DatagramSocket ds = new DatagramSocket(port);

    /**
     * 2. 接收数据包
     */
    byte[] bytes = new byte[1024];
    DatagramPacket dp = new DatagramPacket(bytes, bytes.length);
    // 该方法是阻塞的, 程序执行到这一个步, 会死等发送端发送数据
    ds.receive(dp);

    /**
     * 3. 解析数据包
     */
    byte[] data = dp.getData();
    int len = dp.getLength();
    InetAddress address = dp.getAddress();
    System.out.println("接收到的数据是: " + new String(data, 0, len));
    // System.out.println("ip是:" + address.getHostAddress());
    System.out.println("ip是:" + address);
    System.out.println("名字是:" + address.getHostName());
    System.out.println("端口是:" + dp.getPort());

    /**
     * 4. 释放资源
     */
    ds.close();
  }
}
