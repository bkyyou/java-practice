package src.setdemo01;

import java.util.HashSet;

public class HashCodeTest {
  public static void main(String[] args) {
    Student s1 = new Student("zs", 18);
    Student s2 = new Student("zs", 18);

    // 重写 hashCode
    System.out.println(s1.hashCode() == s2.hashCode()); // true

    // 哈希碰撞
    System.out.println("abc".hashCode()); // 96354
    System.out.println("acD".hashCode()); // 96354

    HashSet<Student> hs = new HashSet<>();
    hs.add(s1);
    hs.add(s2); // false

    System.out.println(hs); // [Student [name=zs, age=18]]
  }
}
