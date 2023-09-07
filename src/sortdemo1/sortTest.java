package src.sortdemo1;

import java.util.Arrays;
import java.util.Comparator;

public class sortTest {
  public static void main(String[] args) {
    int[] arr = { 3, 1, 5, 6, 7, 4, 8, 9 };

    // 冒泡排序
    int[] newArr = bubbleSort(arr);
    // println(newArr);

    // 选择排序
    int[] newArr2 = chooseSort(arr);
    // println(newArr2);

    // 插入排序
    int[] newArr3 = insertSort(arr);
    // println(newArr3);

    // 递归
    int sum = getSum(100);
    // System.out.println(sum);

    quickSort(arr, 0, arr.length - 1);
    // println(arr);

    Integer[] arr2 = { 3, 1, 5, 6, 7, 4, 8, 9 };
    // Arrays.sort(arr2, new Comparator<Integer>() {
    //   @Override
    //   public int compare(Integer o1, Integer o2) {
    //     // System.out.println(o1);
    //     // System.out.println(o2);
    //     return o1 - o2;
    //   }
    // });
    // Arrays.sort(arr2, (Integer o1, Integer o2) -> {
    //     return o1 - o2;
    //   }
    // );
    Arrays.sort(arr2, (o1, o2) -> o1 - o2);
    // Comparator cmp = new MyComparator();
    // Arrays.sort(arr2, cmp);
    // println(arr2);
    System.out.println(Arrays.toString(arr2));;

  }

  

  // private static int[] quickSort(int[] arr) {
  // // int[] _arr = copyArr(arr);
  // if (arr.length <= 1) {
  // return arr;
  // }

  // int start = arr[0];
  // // int[] minArr = new int[]

  // return arr;
  // }

  private static void quickSort(int[] arr, int i, int j) {

    int startI = i;
    int endY = j;

    if (startI > endY)
      return;

    int baseNumber = arr[startI];

    while (startI != endY) {

      // while (true) {
      // if (arr[startI] > baseNumber || startI >= endY) {
      // break;
      // }
      // startI++;
      // }
      // while (true) {
      // if (arr[endY] < baseNumber || startI >= endY) {
      // break;
      // }
      // endY--;
      // }

      // -- 和 ++ 还不能颠倒顺序，否则排序有问题
      // 原因： 因为拿的是开始值当 基准， 所以最后要移动的一定得是小的数， 所以 end 要先比较， 否则 当 startI == endY
      // 时，可能会是一个大数
      while (true) {
        if (endY <= startI || arr[endY] < baseNumber) {
          break;
        }
        endY--;
      }
      while (true) {
        if (endY <= startI || arr[startI] > baseNumber) {
          break;
        }
        startI++;
      }

      int tem = arr[startI];
      arr[startI] = arr[endY];
      arr[endY] = tem;
    }

    int tem = arr[startI];
    arr[startI] = arr[i];
    arr[i] = tem;

    quickSort(arr, i, startI - 1);
    quickSort(arr, startI + 1, j);
  }

  private static int getSum(int num) {
    if (num == 1) {
      return num;
    }
    return num + getSum(num - 1);
  }

  private static int[] insertSort(int[] arr) {
    // int[] _arr = new int[arr.length];
    // _arr[0] = arr[0];
    // for (int i = 1; i < arr.length; i++) {
    // for (int j = _arr.length - 1; j < 0; j++) {
    // if (arr[i] > _arr[j]) {
    // _arr.
    // }
    // }
    // }

    int[] _arr = copyArr(arr);
    int startIndex = 1;
    for (int i = 0; i < _arr.length - 1; i++) {
      if (_arr[i] > _arr[i + 1]) {
        startIndex = i + 1;
        break;
      }
    }

    for (int i = startIndex; i < _arr.length; i++) {
      int j = i;

      while (j > 0 && _arr[j] < _arr[j - 1]) {
        int tem = _arr[j];
        _arr[j] = _arr[j - 1];
        _arr[j - 1] = tem;
        j--;
      }
    }

    return _arr;
  }

  private static int[] chooseSort(int[] arr) {
    int[] _arr = copyArr(arr);
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] > arr[j]) {
          int tem = _arr[j];
          _arr[j] = _arr[j - 1];
          _arr[j - 1] = tem;
        }
      }
    }
    return _arr;
  }

  private static int[] copyArr(int[] arr) {
    int[] _arr = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
      _arr[i] = arr[i];
    }
    return _arr;
  }

  private static void println(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }

  private static void println(Integer[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }

  private static int[] bubbleSort(int[] arr) {
    int[] _arr = copyArr(arr);
    for (int i = 0; i < _arr.length - 1; i++) {
      for (int j = 0; j < _arr.length - i - 1; j++) {
        if (_arr[j] > _arr[j + 1]) {
          int tem = _arr[j];
          _arr[j] = _arr[j + 1];
          _arr[j + 1] = tem;
        }
      }
    }
    return _arr;
  }

}

class MyComparator implements Comparator<Integer> {
  @Override
  public int compare(Integer o1, Integer o2) {
    // 如果n1小于n2，我们就返回正值，如果n1大于n2我们就返回负值，
    // 这样颠倒一下，就可以实现反向排序了
    if (o1 < o2) {
      return 1;
    } else if (o1 > o2) {
      return -1;
    } else {
      return 0;
    }
  }
}