package src.exceptiondemo01;

public class ExceptionTest2 {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5};

    try {
      int num = arr[10];
    // } catch (Exception e) { // 这么写我自己试也行
    } catch (IndexOutOfBoundsException e) {
      String msg = e.getMessage();
      System.out.println(msg);
      String err = e.toString();
      System.out.println(err);
      e.printStackTrace();
    }
    System.out.println("到我这了");
  }
}
