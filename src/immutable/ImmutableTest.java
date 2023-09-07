package src.immutable;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ImmutableTest {
  public static void main(String[] args) {
    List<String> list = List.of("zs", "ls", "ww");

    System.out.println(list.get(0));

    // for (String name : list) {
      // System.out.println(name);
    // }

    // Iterator<String> it = list.iterator();
    // while (it.hasNext()) {
      // System.out.println(it.next());
    // }

    // for (int i = 0; i < list.size(); i++) {
      // System.out.println(list.get(i));
    // }

    // Map<String, String> m = Map.of("zs", "北京", "ls", "南京", "ww", "河北"); // key: zs, value: 北京
    // Set<String> keys = m.keySet();
    // Set<Map.Entry<String, String>> enties = m.entrySet();

    HashMap<String, String> hMap = new HashMap<>();
    hMap.put("111", "aaa");
    hMap.put("222", "bbb");
    hMap.put("333", "ccc");
    hMap.put("444", "ddd");
    Set<Map.Entry<String, String>> entries = hMap.entrySet();
    // Object[] obj = entries.toArray();
    // for (Object o : obj) {
    //   // System.out.println(o.getKey());
    //   System.out.println(o);
    // }
    // entries 变成一个数组 简写
    // Map.Entry[] arr = entries.toArray(new Map.Entry[0]);
    // System.out.println(arr.toString());
    // 对简写的解释
    Map.Entry[] arr = new Map.Entry[0];
    /**
     * toArray 方法底层会比较集合长度和数组长度的两者大小
     * 如果集合的长度 > 数组的长度: 数据在数组中放不下, 此时会根据实际的数据个数, 创建新的数组
     * 如果集合的长度 < 数组的长度: 数据在数组中放得下, 直接用这个数组
     * 
     * 最好 写 0, 数组长度更长 里有 null 时, ofEntries 会报错
     */
    Map.Entry[] entriesArr = entries.toArray(arr);
    // for (Object a : entriesArr) {
    //   System.out.println(a);
    // }

    // 不可变的 map 集合
    Map map = Map.ofEntries(entriesArr);
    System.out.println(map);

    // 缩写
    // Map<Object, Object> map2 = Map.ofEntries(hMap.entrySet().toArray(new Map.Entry[0]));
    Map<String, String> map2 = Map.ofEntries(hMap.entrySet().toArray(new Map.Entry[0]));
    System.out.println(map2);
  
    // JDK10 API 简写
    Map<String, String> map3 = Map.copyOf(hMap);
    System.out.println(map3);
    
  }
}
