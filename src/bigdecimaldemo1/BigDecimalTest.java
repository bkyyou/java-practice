package src.bigdecimaldemo1;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalTest {
  public static void main(String[] args) {
    BigDecimal b1 = new BigDecimal(1.111);
    System.out.println(b1);

    BigDecimal b2 = new BigDecimal("1.111");
    BigDecimal b3 = new BigDecimal("1.111");
    System.out.println(b2);
    System.out.println(b2.add(b3));

    BigDecimal b4 = BigDecimal.valueOf(1.111);
    System.out.println(b4);
    b4.divide(b2, 2, RoundingMode.HALF_UP); // 保存两位，四舍五入
  }
}
