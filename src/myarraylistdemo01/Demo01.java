package src.myarraylistdemo01;

import java.util.ArrayList;

public class Demo01 {
  private Demo01() {}
  public static<E> void addAll(ArrayList<E> list, E e1, E e2) {
    list.add(e1);
    list.add(e2);
  }
  public static<E> void addAll(ArrayList<E> list, E...e) {
    for (int i = 0; i < e.length; i++) {
      list.add(e[i]);
    }
  }
}
