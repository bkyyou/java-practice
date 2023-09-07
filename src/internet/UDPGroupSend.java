package src.internet;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class UDPGroupSend {
  public static void main(String[] args) throws IOException {
    MulticastSocket ms = new MulticastSocket();

    String str = "你好啊!!!";
    byte[] bytes = str.getBytes();
    // 发送组播时, 需要设置组播地址
    InetAddress address = InetAddress.getByName("224.0.0.1");
    int port = 10000;
    DatagramPacket dp = new DatagramPacket(bytes, bytes.length, address, port);
    ms.send(dp);
    ms.close();
  }
}
