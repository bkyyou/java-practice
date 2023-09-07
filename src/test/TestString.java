package src.test;

import java.util.StringJoiner;

public class TestString {
  public static void main(String[] args) {
    String s1 = "abc";
    String s2 = "abc";

    System.out.println(s1 == s2); // true
 
    String s3 = new String("abc");
    String s4 = new String("abc");
    System.out.println(s3 == s4); // false

    Boolean res1 = s3.equals(s4);
    Boolean res2 = s3.equalsIgnoreCase(s4);

    for (int i = 0; i < s3.length(); i++) {
      char c = s3.charAt(i);
      System.out.println(c);
    }

    String str2 = "asldjflajfldlfajdsl";
    String sliceStr2 = str2.substring(0, 4);
    String sliceStr3 = str2.substring(4);

    StringBuilder str3 = new StringBuilder();
    StringBuilder str4 = new StringBuilder("zs");
    // StringBuilder str5 = "zs";
    str3.append(true);
    str3.append(2.3);

    StringJoiner sj = new StringJoiner("-", "[", "]");
    sj.add("abc").add("ddd");
    System.out.println(sj);
  }
}
