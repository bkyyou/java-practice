package src.mapdemo01;

import java.util.HashMap;

public class MatTest2 {
  public static void main(String[] args) {
    HashMap<Student, String> hm = new HashMap<>();
    Student s1 = new Student("zs", 10);
    Student s2 = new Student("ls", 11);
    Student s3 = new Student("ww", 12);
    Student s4 = new Student("ww", 12);
    hm.put(s1, "北京");
    hm.put(s2, "辽宁");
    hm.put(s3, "河北");
    hm.put(s4, "河北1");
    // hm.put(s1, "北京1");

    hm.forEach((s, v) -> System.out.println(s + " " + v));

  }
}
