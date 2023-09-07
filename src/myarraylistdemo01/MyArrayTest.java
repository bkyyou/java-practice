package src.myarraylistdemo01;

import java.util.ArrayList;

public class MyArrayTest {
  public static void main(String[] args) {
    MyArrayList<String> alist1 = new MyArrayList<>();

    alist1.add("aaa");
    alist1.add("bbb");

    System.out.println(alist1.toString());

    MyArrayList<Integer> alist2 = new MyArrayList<>();
    alist2.add(1);
    alist2.add(2);

    System.out.println(alist2.toString());

    ArrayList<String> aList3 = new ArrayList<>();
    Demo01.addAll(aList3, "aaa", "bbb");
    Demo01.addAll(aList3, "aaa", "bbb", "ccc");
    System.out.println(aList3);
  }
}
