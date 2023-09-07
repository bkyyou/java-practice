package src.exceptiondemo01;

public class ExceptionTest3 {
  public static void main(String[] args) {
    int[] arr = {};

    try {
      getMax(arr);
    } catch (IndexOutOfBoundsException e) {
      // TODO: handle exception
    }
    try {
      getMax(null);
    } catch (Exception e) {
      e.printStackTrace();
    }
    System.out.println("到我这了");

    System.out.println(Integer.parseInt("111q"));
  }
  public static int getMax(int[] arr) throws IndexOutOfBoundsException {
    // if (arr == null) {
    //   throw new NullPointerException();
    // }
    if (arr.length == 0) {
      throw new IndexOutOfBoundsException();
    }
    int max = arr[0];

    for (int i = 1; i < arr.length; i++) {
      if (max < arr[i]) {
        max = arr[i];
      }
    }
    return max;
  }
}
