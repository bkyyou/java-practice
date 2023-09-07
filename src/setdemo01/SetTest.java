package src.setdemo01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {
  public static void main(String[] args) {
    Set<String> s = new HashSet<>();
    
    boolean b1 = s.add("张三"); // true
    boolean b2 = s.add("张三"); // false
    s.add("李四"); // false
    s.add("王五"); // false

    // 迭代器遍历
    Iterator<String> it = s.iterator();
    while (it.hasNext()) {
      String str = it.next();
    }

    // 增强 for 遍历
    for (String str : s) {
      System.out.println(str);
    }

    // Lambda 表达式
    s.forEach(str -> System.out.println(str));
  }
}
