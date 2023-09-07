package src.functiondemo01;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionTest2 {
  public static void main(String[] args) {
    ArrayList<String> aList = new ArrayList<>();
    Collections.addAll(aList, "1", "2", "3", "4");

    aList.stream().map(new Function<String, Integer>() {
      @Override
      public Integer apply(String t) {
        return Integer.parseInt(t);
      }
    }).forEach(num -> System.out.println(num));;
    aList.stream().map(Integer::parseInt).forEach(num -> System.out.println(num));;


    ArrayList<String> aList2 = new ArrayList<>();
    Collections.addAll(aList2, "张三", "张三丰", "张无忌", "孙悟空", "猪八戒");
    aList2.stream().filter(new Predicate<String>() {
      @Override
      public boolean test(String s) {
        return s.startsWith("张") && s.length() == 3;
      }
    }).forEach(s -> System.out.println(s));
    aList2.stream().filter(new StringOperate()::stringJudge).forEach(s -> System.out.println(s));
    // 静态方法中是没有 this 的, 要用 this 需要在非静态的方法 自己调用自己警惕没有死循环，哈哈
    // aList2.stream().filter(this::stringJudge).forEach(s -> System.out.println(s)); 
    aList2.stream().filter(new FunctionTest2()::stringJudge).forEach(s -> System.out.println(s));
  }

  public boolean stringJudge(String s) {
    return s.startsWith("张") && s.length() == 3;
  }
}
