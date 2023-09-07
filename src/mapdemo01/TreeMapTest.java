package src.mapdemo01;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapTest {
  public static void main(String[] args) {
    // TreeMap<Integer, String> tm = new TreeMap<>();
    // TreeMap<Integer, String> tm = new TreeMap<>(new Comparator<Integer>() {
    //   @Override
    //   public int compare(Integer o1, Integer o2) {
    //     return o2 - o1;
    //   }
    // });
    TreeMap<Integer, String> tm = new TreeMap<>((o1, o2) -> o2 - o1);

    tm.put(2, "薯片");
    tm.put(1, "辣条");
    tm.put(4, "火腿肠");
    tm.put(3, "方便面");

    System.out.println(tm);

    Student1 s1 = new Student1("zs", 10);
    Student1 s2 = new Student1("zs", 10);
    Student1 s3 = new Student1("zs", 10);
    TreeMap<Student1, String> mp2 = new TreeMap<>();
    mp2.put(s1, "北京");
    mp2.put(s2, "北京1");
    mp2.put(s3, "北京2");
    System.out.println(mp2);

  }
}
