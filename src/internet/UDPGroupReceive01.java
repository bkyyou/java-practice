package src.internet;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class UDPGroupReceive01 {
  public static void main(String[] args) throws IOException {
    // 创建 MulticastSocket 对象
    MulticastSocket ms = new MulticastSocket(10000);

    // 2. 将当前本机添加到 224.0.0.1 这一组当中
    InetAddress address = InetAddress.getByName("224.0.0.1");
    ms.joinGroup(address);

    // 3. 创建 
    byte[] bytes = new byte[1024];
    DatagramPacket dp = new DatagramPacket(bytes, bytes.length);

    ms.receive(dp);

    byte[] data = dp.getData();
    int len = dp.getLength();
    InetAddress addr = dp.getAddress();
    System.out.println("接收到的数据是: " + new String(data, 0, len));
    // System.out.println("ip是:" + addr.getHostAddress());
    System.out.println("ip是:" + addr);
    System.out.println("名字是:" + addr.getHostName());
    System.out.println("端口是:" + dp.getPort());

    ms.close();
  }
}
