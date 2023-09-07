package src.functiondemo01;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FunctionTest5 {
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>();
    Collections.addAll(list, "zs,18", "ls,18", "ww,19");
    Student[] arr = list.stream().map(Student::new).toArray(Student[]::new);
    System.out.println(Arrays.toString(arr));
  }
}
