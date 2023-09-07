package src.regdemo1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegDemoTest {
  public static void main(String[] args) {
    String str = "Java自从95年问世， 经历了很多版本，目前企业中最多使用的是Java8和Java11，因为这两个是长期支持的版本，下一个长期支持的版本是Java17，相信在未来不就Java17也逐渐登上历史舞台";
    // method1(str);
    // method2(str);
    // method3(str);
    // method4();
    method5();

  }
  private static void method5() {
    // 字符串： 我要学编编编编编编程程程程程程程程 => 我要学编程
    String str = "我要学编编编编编编程程程程程程程程";
    String newStr = str.replaceAll("(.)\\1+", "$1");
    System.out.println(newStr);
  }
  // 分组
  private static void method4() {
    String str = "aaasdflkadaaa";
    // 判断一个字符串的开始字符和结束字符是否一致
    // Pattern p = Pattern.compile("(.).+\\1");
    String s1 = "(.).+\\1";
    // 判断一个字符串的开始部分和结束部分是否一致
    // Pattern p2 = Pattern.compile("(.+).+\\1");
    String s2 = "(.+).+\\1";
    // 判断一个字符串的开始部分和结束部分是否一致， 开始部分也需要一致
    // Pattern p3 = Pattern.compile("((.)\\2*).+\\1");
    String s3 = "((.)\\2*).+\\1";

    System.out.println(str.matches(s1));
    System.out.println(str.matches(s2));
    System.out.println(str.matches(s3));
  }
  private static void method3(String str) {
    // ?i 忽略大小写 ((?i)Java) 忽略 Java 的大小写
    // Pattern p = Pattern.compile("((?i)Java)(?=8|11|17)");
    // Pattern p = Pattern.compile("((?i)Java)(8|11|17)");
    // Pattern p = Pattern.compile("((?i)Java)(?:8|11|17)");
    // Pattern p = Pattern.compile("((?i)Java)(?!8|11|17)");
    Pattern p = Pattern.compile("((?i)Java)(?!11)(\\d{1,2})");
    Matcher m = p.matcher(str);
    StringBuilder sb = new StringBuilder();

    while (m.find()) {
      String s = m.group();
      sb.append(s);
      sb.append(" ");
      // System.out.println(s);
    }

    System.out.println(sb);
  }

  private static void method2(String str) {
    Pattern p = Pattern.compile("Java\\d{0,2}");
    Matcher m = p.matcher(str);
    StringBuilder sb = new StringBuilder();

    while (m.find()) {
      String s = m.group();
      sb.append(s);
      sb.append(" ");
      // System.out.println(s);
    }

    // System.out.println(sb);
  }

  private static void method1(String str) {
    // 获取正则表达式的对象
    Pattern p = Pattern.compile("Java\\d{0,2}");
    // 获取文本匹配器的对象
    // m: 文本匹配器的对象
    // p: 规则
    // m 要在 str 中找符合 p 规则的小串
    Matcher m = p.matcher(str);

    // 拿着文本匹配器从头开始读取， 寻找是否有满足规则的子串
    // 如果没有，方法返回 false
    // 如果有， 返回true。 在底层记录子串的起始索引和结束索引+1
    // 0, 4
    boolean b = m.find();

    // 方法底层会根据 find 方法记录的索引进行字符串截取
    // subString(i, j) 包头不包尾
    // 0, 4 不包括 4， 会把截取的小串返回
    String s1 = m.group();
    // System.out.println(s1);

    // 第二次在调用 find 的时候， 会继续读取后边的内容
    // 读取第二个满足的子串，方法会继续返回true
    // 并把第二个满足子串的起始索引进行记录(结束索引+1)
    b = m.find();

    // 截取第二个
    String s2 = m.group();
    // System.out.println(s2);
  }
}
