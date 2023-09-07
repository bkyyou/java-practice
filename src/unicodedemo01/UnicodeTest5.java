package src.unicodedemo01;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class UnicodeTest5 {
  public static void main(String[] args) throws IOException {
    String path = "src/unicodetest4.txt";
    FileWriter fw1 = new FileWriter(path);
    fw1.write("2-5-9-6-3-8");
    fw1.close();

    FileReader fr1 = new FileReader(path);
    FileWriter fw2 = new FileWriter("src/copyunicodetest4.txt");
    ArrayList<String> aList1 = new ArrayList<>();
    StringBuilder sb = new StringBuilder();
    int ch;
    while ((ch = fr1.read()) != -1) {
      // System.out.println(ch);
      sb.append((char) ch);
      // System.out.println((char) ch);
      aList1.add(Character.toString((char) ch));
    }
    // System.out.println(aList1);
    // System.out.println(aList1.stream().filter(s -> !"-".equals(s)).collect(Collectors.toList()));
    // List<Integer> list = aList1.stream().filter(s -> !"-".equals(s)).map(s -> Integer.parseInt(s)).collect(Collectors.toList());
    // Integer[] arr = list.toArray(s -> new Integer[6]);
    /*
     * 1
     */
    // Integer[] arr = aList1.stream().filter(s -> !"-".equals(s)).map(s -> Integer.parseInt(s)).toArray(s -> new Integer[6]);
    // Arrays.sort(arr);

    /*
     * 2
     */
    Integer[] arr = aList1.stream().filter(s -> !"-".equals(s)).map(Integer::parseInt).sorted().toArray(Integer[]::new);
    // arr.sort(); 这个不能用类型是 Integer
    // System.out.println(Arrays.toString(arr.sort((a: int, b:int) -> a - b)));
    // System.out.println(arr);
    /*
     * 1
     */
    // for (int i = 0; i < arr.length; i++) {
    //   fw2.write(arr[i].toString());
    //   if (i < arr.length - 1) {
    //     fw2.write("-");
    //   }
    // }
    /*
     * 2 这块使用 substring 也行, 截取字符串 截掉 [ 或 ]
     */
    String writeString = Arrays.toString(arr).replace(", ", "-").replaceAll("(\\[|\\])", "");
    fw2.write(writeString);
    fr1.close();
    fw2.close();
  }
}
