package src.test;

import java.util.ArrayList;
import java.util.StringJoiner;

public class StringJoinerTest {
  public static void main(String[] args) {
    // StringJoiner sj = new StringJoiner("-", "[", "]");
    // sj.add("abc").add("ddd");
    // System.out.println(sj);

    ArrayList<String> aList = new ArrayList<>();
    aList.add("AAA");
    aList.add("bbb");
    aList.add("ccc");

    aList.remove(0);

    System.out.println(aList);
  }
}
