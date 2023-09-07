package src.datedemo01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest {
  public static void main(String[] args) {
    method1();
  }
  private static void method1() {
    // 默认格式
    SimpleDateFormat s = new SimpleDateFormat();
    Date d = new Date(0l);
    System.out.println(s.format(d));

    // 指定格式
    SimpleDateFormat s2 = new SimpleDateFormat("yyyy年MM月dd HH:mm:ss");
    Date d2 = new Date(0l);
    System.out.println(s2.format(d2));

    /**
     * parse
     */
    String str = "2023-11-11 0:0:0";
    SimpleDateFormat s3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    try {
      Date d3 = s3.parse(str);
      System.out.println(d3);
      System.out.println(d3.getTime());
    } catch (ParseException e) {
      // TODO Auto-generated catch block
      // e.printStackTrace();
    }
  }
}
