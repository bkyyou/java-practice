package src.streamdemo01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

public class StreamTest2 {
  public static void main(String[] args) {
    ArrayList<String> aList = new ArrayList<>();
    Collections.addAll(aList, "张一一", "王二二", "张三三");

    aList.stream().filter(str -> str.startsWith("张")).forEach(str -> System.out.println(str));

    ArrayList<String> aList2 = new ArrayList<>();
    Collections.addAll(aList2, "张一一-18", "王二二-19", "张三三-20");

    /*
     * map
     * 第一个参数是当前类型, 第二个参数是要转换的类型
     * 
     * apply 的参数 s, 一次表示流里面的每个数据
     * 返回值: 表示转换之后的数据
     * 
     * 当 map 方法执行完毕之后, 流上的数据变为整数
     * 所以在下面 foreach 中, s 依次表示流里面的每一个数据是整数
     */
    aList2.stream().map(new Function<String, Integer>() {
      @Override
      public Integer apply(String s) {
        String[] arr = s.split("-");
        return Integer.parseInt(arr[1]);
      }
    }).forEach(n -> System.out.println(n));
  }
}
