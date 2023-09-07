package src.collectiondemo01;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest {
  public static void main(String[] args) {

    Collection<String> coll = new ArrayList<>();
    coll.add("aaa");
    coll.add("aaa");

    coll.remove("add");

    Collection<Student> stus = new ArrayList<>();
    Student s1 = new Student("zs", 18);
    Student s2 = new Student("ls", 19);
    Student s3 = new Student("ww", 19);
    Student s4 = new Student("zs", 18);

    stus.add(s1);
    stus.add(s2);
    stus.add(s3);

    System.out.println(stus.contains(s4));
  }
}
