package src.myarraylistdemo01;

import java.util.Arrays;

public class MyArrayList<E> {
  Object[] arr = new Object[10];
  int size;

  public void add(E e) {
    arr[size] = e;
    size++;
  }

  public E get(int i) {
    return (E)arr[i];
  }

  public String toString() {
    return Arrays.toString(arr);
  }
}
