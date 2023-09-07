package src.streamdemo01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamTest3 {
  public static void main(String[] args) {
    ArrayList<String> aList = new ArrayList<>();
    Collections.addAll(aList, "zs", "ls", "ww", "zl");

    System.out.println(aList.stream().count());

    // toArray()
    Object[] arr1 = aList.stream().toArray();
    System.out.println(Arrays.toString(arr1));

    // 写 Object 类型 使用 Arrays.toString方法 还不行。。。
    // IntFunction的泛型: 具体类型的数组
    // apply 的形参: 流中数据具体的个数, 要和数组长度保持一致
    // apply 的返回值: 具体类型的数组
    // 方法体: 就是创建数组
    // toArray 方法的参数的作用: 负责创建一个指定类型的数组
    // toArray 方法的底层: 会依次得到流中的每个数据, 并放到数组中
    // toArray 的返回值: 是一个装着流里面所有数据的数组
    String[] arr2 = aList.stream().toArray(new IntFunction<String[]>() {
      @Override
      public String[] apply(int value) {
        return new String[value];
      }
    });
    System.out.println(Arrays.toString(arr2));

    ArrayList<String> alist2 = new ArrayList<>();
    Collections.addAll(alist2, "张三-男-18", "李四-女-18", "王五-男-18", "赵六-女-18");

    // 把 男的 收集到 list 中
    List<String> newList1 = alist2.stream().filter(str -> "男".equals(str.split("-")[1])).collect(Collectors.toList());
    System.out.println(newList1);

    // 把 男的 收集到 set 中
    Set<String> newSet1 = alist2.stream().filter(str -> "男".equals(str.split("-")[1])).collect(Collectors.toSet());
    System.out.println(newSet1);

    // 把 男的 收集到 map 中, 要给出 键 和 值
    Map<String, Integer> newMap1 = alist2
        .stream()
        .filter(str -> "男".equals(str.split("-")[1]))
        /**
         * toMap: 参数一表示键的生成规则
         * 参数二表示值的生成规则
         * 
         * 参数一
         * Function 泛型一: 表示 流 里面每一个数据的类型
         * 泛型二: 表示 Map 集合中键的数据类型
         * 方法 apply 形参: 依次表示流里面每一个数据
         * 方法体: 生成键的代码
         * 返回值: 已经生成的键
         * 参数二
         * Function 泛型一: 表示 流 里面每一个数据的类型
         * 泛型二: 表示 Map 集合中键的数据类型
         * 方法 apply 形参: 依次表示流里面每一个数据
         * 方法体: 生成值的代码
         * 返回值: 已经生成的值
         */
        .collect(Collectors.toMap(new Function<String, String>() {
          @Override
          public String apply(String s) {
            return s.split("-")[0];
          }
        }, new Function<String, Integer>() {
          @Override
          public Integer apply(String s) {
            return Integer.parseInt(s.split("-")[2]);
          }
        }));
    System.out.println(newMap1);

  }
}
