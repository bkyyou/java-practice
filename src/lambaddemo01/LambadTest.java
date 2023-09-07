package src.lambaddemo01;

public class LambadTest {
  private static int fntotal = 0;
  public static void main(String[] args) {
    method(() -> {
      System.out.println("youyong");
    });

    System.out.println(fn(12));
    System.out.println(fntotal);

    // System.out.println(getSum(20));
    System.out.println(getSum(4));
  }

  private static void method(Swim s) {
    s.swimming();
  }

  private static int fn(int num) {
    if (num == 2) {
      fntotal++;
    }
    if (num == 1 || num == 2) {
      return 1;
    }
    return fn(num - 1) + fn(num - 2);
  }

  private static int getSum(int num) {
    if (num == 1) {
      return 1;
    }
    if (num == 2) {
      return 2;
    }
    return getSum(num - 1) + getSum(num - 2);
  }

  // private static int getSum(int num) {
  //   if (num == 1) {
  //     return 1;
  //   }
  //   if (num == 2) {
  //     return 2;
  //   }
  //   if (num == 3) {
  //     return 3;
  //   }
  //   return getSum(num - 1) + getSum(num - 2) + getSum(num - 3);
  // }

  
}