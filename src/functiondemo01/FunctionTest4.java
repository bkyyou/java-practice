package src.functiondemo01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.IntFunction;

public class FunctionTest4 {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    Collections.addAll(list, 1, 2, 3, 4, 5, 6);
    Integer[] arr = list.stream().toArray(new IntFunction<Integer[]>() {
 
      @Override
      public Integer[] apply(int value) {
        return new Integer[value];
      }
      
    });

    System.out.println(Arrays.toString(arr));

    Integer[] arr2 = list.stream().toArray(Integer[]::new);
    System.out.println(Arrays.toString(arr2));
  }
  
}
