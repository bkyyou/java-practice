package src.exceptiondemo01;

public class ExceptionTest1 {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5};

    try {
      // System.out.println(arr[10]);
      System.out.println(1/0);
    // } catch (Exception e) {
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("索引越界");
    }

    System.out.println("我执行了1");

    try {
      System.out.println(arr[10]);
      System.out.println(1);
      System.out.println(2/0);
      System.out.println(2);
      String str = null;
      System.out.println(str.equals("str"));
    } 
    catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("索引越界");
    } catch (ArithmeticException e) {
      System.out.println("除数不能为0");
    } 
    // catch (NullPointerException e) {
    //   System.out.println("空指针异常");
    // } 
    catch (Exception e) {
      System.out.println("Exception");
    }
    System.out.println("我执行了2");

  }
}
