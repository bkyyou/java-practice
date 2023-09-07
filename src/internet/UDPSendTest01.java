package src.internet;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class UDPSendTest01 {
  public static void main(String[] args) throws IOException {
    /**
     * 1. 创建 DatagramSocket 对象
     * 细节: 无参 所有可用的端口随便使用一个
     *       有参 指定端口号进行绑定
     */
    DatagramSocket ds = new DatagramSocket();

    /**
     * 2. 打包数据
     */
    String str = "你好啊!!!";
    byte[] bytes = str.getBytes();
    InetAddress address = InetAddress.getByName("127.0.0.1");
    int port = 10086;
    DatagramPacket dp = new DatagramPacket(bytes, bytes.length, address, port);

    /**
     * 3. 发送数据
     */
    ds.send(dp);

    /**
     * 4. 释放资源
     */
    ds.close();
  }
}
