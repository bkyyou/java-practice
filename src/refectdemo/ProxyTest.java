package src.refectdemo;

public class ProxyTest {
  public static void main(String[] args) {
    BigStar bigStar = new BigStar("某某哥");
    Star proxy = ProxyUtil.createProxy(bigStar);

    proxy.dance();
    String res = proxy.sing("xxxx");
    System.out.println(res);
  }
}
