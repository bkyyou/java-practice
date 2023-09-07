package src.test;
public class Test2 {
  public static void main(String[] args) {
    
  }

  public static double getSum(double[] args) {
    double sum = 0;
    for (int i = 0; i < args.length; i++) {
      sum += args[i];
    }
    return sum;
  }
}
