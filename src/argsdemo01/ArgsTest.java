package src.argsdemo01;

public class ArgsTest {
  public static void main(String[] args) {
    System.out.println(getSum(1, 2, 3, 4));
    int[] arr = {1, 2, 3, 4, 5};
    System.out.println(getSum(arr));
  }

  private static int getSum(int...args) {
    int sum = 0;
    for(int a: args) {
      sum += a;
    }
    return sum;
  }
}
