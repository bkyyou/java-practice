package src.calenderdemo01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalenderTest {
  public static void main(String[] args) throws ParseException {
    // 获取日历对象 当前时间
    Calendar c = Calendar.getInstance();

    System.out.println(c);

    // 修改日历代表时间
    Date d = new Date(0l);
    c.setTime(d);
    System.out.println(c);

    // 获取具体时间
    System.out.println(c.get(Calendar.YEAR));
    System.out.println(c.get(Calendar.MONDAY));
    System.out.println(c.get(Calendar.DAY_OF_MONTH));
    System.out.println(c.get(Calendar.DAY_OF_WEEK));
    System.out.println(getWeek(c.get(Calendar.DAY_OF_WEEK)));

    testWeekStartIndex();

    c.set(Calendar.YEAR, 2000);
    // 最后一个月应该是 11， 写 12 不会报错， 是会到下一年
    c.set(Calendar.MONTH, 11);
    c.set(Calendar.DAY_OF_MONTH, 10);
    System.out.println(c);

    c.add(Calendar.YEAR, 1);
    System.out.println(c);
  }

  private static String getWeek(int i) {
    String[] arr = {"", "星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"};
    return arr[i];
  } 

  private static void testWeekStartIndex() throws ParseException {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    Date d = sdf.parse("2023-6-25");
    Calendar c = Calendar.getInstance();
    c.setTime(d);
    System.out.println(c.get(Calendar.DAY_OF_WEEK));
  } 
}
