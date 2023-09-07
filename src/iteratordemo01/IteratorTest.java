package src.iteratordemo01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

public class IteratorTest {
  public static void main(String[] args) {

    // 创建集合并添加元素
    Collection<String> coll = new ArrayList<>();
    coll.add("aaa");
    coll.add("bbb");
    coll.add("ccc");
    coll.add("ddd");

    coll.forEach(new Consumer<String>() {
      @Override
      public void accept(String s) {
        System.out.println(s);
      }
    });

    coll.forEach(s -> System.out.println(s));

    for(String s : coll) {
      System.out.println(s);
    }

    // 获取迭代器对象
    Iterator<String> it = coll.iterator();
    // 利用循环不断去获取元素中的每一个元素
    while (it.hasNext()) {
      String s = it.next();
      if (s == "aaa") {
        it.remove();
      }
      System.out.println(s);
    }

    // it.next();

  }
}
