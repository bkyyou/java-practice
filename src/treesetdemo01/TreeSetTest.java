package src.treesetdemo01;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetTest {
  public static void main(String[] args) {
    Student s1 = new Student(18, "zs");
    Student s2 = new Student(18, "ls");
    Student s3 = new Student(16, "ww");

    TreeSet<Student> ts = new TreeSet<>();
    ts.add(s1);
    ts.add(s2);
    ts.add(s3);

    System.out.println(ts);

    // TreeSet<String> ts2 = new TreeSet<>((o1, o2) -> {
    //   int i = o1.length() - o2.length();
    //   // 如果长度为 0, 就按照默认的规则比较字母进行排序
    //   return i == 0 ? o1.compareTo(o2) : i;
    // });
    TreeSet<String> ts2 = new TreeSet<>(new Comparator<String>() {
      @Override
      public int compare(String o1, String o2) {
        int i = o1.length() - o2.length();
        // 如果长度为 0, 就按照默认的规则比较字母进行排序
        return i == 0 ? o1.compareTo(o2) : i;
      }
    });
    ts2.add("d");
    ts2.add("acd");
    ts2.add("b");
    ts2.add("ba");
    ts2.add("a");
    System.out.println(ts2);
  }
}
