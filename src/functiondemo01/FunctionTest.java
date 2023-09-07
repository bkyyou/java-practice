package src.functiondemo01;

import java.util.Arrays;

public class FunctionTest {
  public static void main(String[] args) {
    Integer[] arr = {1, 2, 3, 4, 8, 5, 7};
    Arrays.sort(arr, FunctionTest::sutraction);

    System.out.println(Arrays.toString(arr));
  }
  public static int sutraction(int n1, int n2) {
    return n1 - n2;
  }
}
