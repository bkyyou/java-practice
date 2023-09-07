package src.streamdemo01;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class StreamTest {
  public static void main(String[] args) {
    /*
     * 单列集合
     */
    ArrayList<String> aList = new ArrayList<>();
    Collections.addAll(aList, "zs", "ls", "ww");
    Stream<String> st = aList.stream();
    st.forEach(str -> System.out.println(str));
    /*
     * 双列集合
     */
    HashMap<String, String> hmap = new HashMap<>();
    hmap.put("111", "aaa");
    hmap.put("222", "bbb");
    hmap.put("333", "ccc");
    Set<String> keySets = hmap.keySet();
    Stream<String> keyStream = keySets.stream();
    keyStream.forEach(key -> System.out.println(key));
    Set<Map.Entry<String, String>> entriesSets = hmap.entrySet();
    Stream<Map.Entry<String, String>> entriesStream = entriesSets.stream();
    entriesStream.forEach(entry -> System.out.println(entry.getValue()));

    /*
     * 数组
     */
    int[] arr = {1, 2, 3, 4, 5, 6};
    Arrays.stream(arr).forEach(num -> System.out.println(num));

    /*
     * 零散数据
     */
    Stream.of(1, 2, 3, 4, 5).forEach(num -> System.out.println(num));
    Stream.of("a", "b").forEach(num -> System.out.println(num));
  }
}
