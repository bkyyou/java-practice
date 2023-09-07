package src.util;

import java.util.StringJoiner;

public class ArrUtil {
  private ArrUtil() {}
  public static String printArr(int[] arr) {
    // StringBuilder sb = new StringBuilder();
    // sb.append("[");
    // for (int i = 0; i < arr.length; i++) {
    //   sb.append(arr[i]);
    //   sb.append(",");
    // }
    // // sb.substring(0, sb.length() - 1);
    // // sb.append("]");
    // // return sb.toString();

    // return sb.substring(0, sb.length() - 1) + "]";

    StringJoiner sj = new StringJoiner(",", "[", "]");
    for (int i = 0; i < arr.length; i++) {
      sj.add(arr[i] + "");
    }
    return sj.toString();
  }
}
