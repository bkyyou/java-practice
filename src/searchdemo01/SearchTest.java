package src.searchdemo01;

public class SearchTest {
  public static void main(String[] args) {
    int[] arr = {131, 127, 1, 68, 89, 166, 78};
    boolean b1 = baseSearch(68, arr);
    // System.out.println(b1);

    System.out.println(binarySearch(89, arr));

  }

  private static boolean baseSearch(int num, int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == num) {
        return true;
      }
    }
    return false;
  }

  private static int binarySearch(int num, int[] arr) {
    int min = 0;
    int max = arr.length - 1;
    
    while (min <= max) {
    // while (true) {
    //   if (min > max) {
    //     return -1;
    //   }
      int mid = (max + min) / 2;
      System.out.println(mid);
      if (arr[mid] > num) {
        max = mid - 1;
      } else if(arr[mid] < num) {
        min = mid + 1;
      } else {
        return mid;
      }
    }

    return -1;
  }
}
