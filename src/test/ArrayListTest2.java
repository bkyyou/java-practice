package src.test;

import java.util.ArrayList;

import src.people.Student;

// import src.com.bkyyou.abstractdemo1;

public class ArrayListTest2 {
  public static void main(String[] args) {
    ArrayList<Student> stuAList = new ArrayList<>();
    Student s1 = new Student("zs", 18);
    Student s2 = new Student("ls", 19);
    stuAList.add(s1);
    stuAList.add(s2);

    // System.out.println(s1.name);
    System.out.println(stuAList);
  }
}
