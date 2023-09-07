package src.internet;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class AddressTest01 {
  public static void main(String[] args) throws UnknownHostException {
    InetAddress address = InetAddress.getByName("10.4.170.249");
    // InetAddress address = InetAddress.getByName("MacBook-Pro-7.local");
    String name = address.getHostName();
    System.out.println(name);
    String ip = address.getHostAddress();
    System.out.println(ip);
  }
}
