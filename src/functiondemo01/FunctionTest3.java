package src.functiondemo01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FunctionTest3 {
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>();
    Collections.addAll(list, "zs,18", "ls,18", "ww,18");
    List<Student> studentList = list.stream().map(new Function<String, Student>() {
      @Override
      public Student apply(String t) {
        String[] arr = t.split(",");
        String name = arr[0];
        int age = Integer.parseInt(arr[1]);
        return new Student(name, age);
      }
    }).collect(Collectors.toList());
    System.out.println(studentList);

    List<Student> newlist = list.stream().map(Student::new).collect(Collectors.toList());
    System.out.println(newlist);

    ArrayList<String> list2 = new ArrayList<>();
    Collections.addAll(list2, "aaa", "bbb", "ccc");
    list2.stream().map(String::toUpperCase).forEach(s -> System.out.println(s));

  }
}
