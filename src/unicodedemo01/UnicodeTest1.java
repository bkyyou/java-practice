package src.unicodedemo01;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class UnicodeTest1 {
  public static void main(String[] args) throws UnsupportedEncodingException {
    String str = "ai智能";

    byte[] arr1 = str.getBytes();
    System.out.println(Arrays.toString(arr1));
    String str1 = new String(arr1);
    System.out.println(str1);
    
    byte[] arr2 = str.getBytes("GBK");
    System.out.println(Arrays.toString(arr2));
    String str2 = new String(arr2, "GBK");
    System.out.println(str2);
  }
}
