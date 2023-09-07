package src.myarraylistdemo01;

import java.util.ArrayList;

public class GenericsDemo {
  public static void main(String[] args) {
    ArrayList<Ye> aList1 = new ArrayList<>();
    ArrayList<Fu> aList2 = new ArrayList<>();

    method(aList1);
    method(aList2); // 问题： The method method(ArrayList<Ye>) in the type GenericsDemo is not applicable for the arguments (ArrayList<Fu>)

    aList1.add(new Ye());
    aList1.add(new Fu());
  }

  public static void method1(ArrayList<?> list) {}

  public static void method(ArrayList<? extends Ye> list) {}
  public static void method3(ArrayList<? super Su> list) {}
}

