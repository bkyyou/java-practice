package src.bigIntegerdemo1;

import java.math.BigInteger;
import java.util.Random;

public class BigIntegerTest {
  public static void main(String[] args) {
    Random r = new Random();
    BigInteger b1 = new BigInteger(4, r);
    System.out.println(b1); // 0~2 ^4 -1 的范围

    BigInteger b2 = new BigInteger("999999999");
    System.out.println(b2); 

    BigInteger b3 = new BigInteger("100",2);
    System.out.println(b3); 

    BigInteger b4 = BigInteger.valueOf(100);
    System.out.println(b4); 

    BigInteger b5 = BigInteger.valueOf(6);
    BigInteger b6 = BigInteger.valueOf(6);
    System.out.println(b5 == b6);  // true 比较的是地址值，说明是同一个地址

    BigInteger b7 = BigInteger.valueOf(99);
    BigInteger b8 = BigInteger.valueOf(99);
    System.out.println(b7.equals(b8));  // true

    b7.doubleValue();
    b7.longValue();
  }
}
