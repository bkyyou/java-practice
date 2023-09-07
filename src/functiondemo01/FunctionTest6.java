package src.functiondemo01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Function;

public class FunctionTest6 {
  public static void main(String[] args) {
    ArrayList<Student> list = new ArrayList<>();
    Collections.addAll(list, new Student("zs", 18), new Student("ls", 18), new Student("ww", 17));
    String[] arr1 = list.stream().map(new Function<Student, String>() {

      @Override
      public String apply(Student t) {
        return t.getName();
      }
      
    }).toArray(String[]::new);
    System.out.println(Arrays.toString(arr1));
    // 使用类名引用成员方法 (其他调用方法)
    String[] arr2 = list.stream().map(Student::getName).toArray(String[]::new);
    System.out.println(Arrays.toString(arr2));

  }
}
