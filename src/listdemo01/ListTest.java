package src.listdemo01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListTest {
  public static void main(String[] args) {
    // 创建一个集合
    List<String> list = new ArrayList<>();
    // 添加元素
    list.add("aaa");
    list.add("bbb");
    list.add("ccc");
    System.out.println(list);
    list.add(1, "ddd"); // [aaa, ddd, bbb, ccc]
    System.out.println(list);

    // String str = "1";
    // int a = (int)str;

    // int b = 1;
    // String st = (String)b;

    ListIterator<String> it = list.listIterator();
    while (it.hasNext()) {
      String s = it.next();
      if (s == "aaa") {
      // if ("aaa".equals(s)) {
        it.add("eee");
      }
      System.out.println(s);
    } 
    System.out.println(list);

    List<Integer> list2 = new ArrayList<>();
    list2.add(1);
    list2.add(2);
    list2.add(3);
    list2.remove(2);
    Integer i = Integer.valueOf(1);
    list2.remove(i);

    for (int j = 0; j < list2.size(); j++) {
      int a = list2.get(j);
      // Integer a = list2.get(j);
      // System.out.println(a);
    }
    



  }
}
