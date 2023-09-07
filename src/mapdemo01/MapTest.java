package src.mapdemo01;

import java.util.HashMap;
import java.util.Map;
// 使用 Entry 也可以在这导包
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.Set;

public class MapTest {
  public static void main(String[] args) {
    // 创建 Map 集合的对象
    Map<String, String> m = new HashMap<>();

    // 添加键值对
    m.put("齐天大圣", "孙悟空");
    m.put("平天大圣", "牛魔王");
    m.put("二郎神", "杨戬");

    // 获取所有键, 并把这些键放到一个单例集合中
    Set<String> keys = m.keySet();

    // 遍历单列集合, 得到每一个键
    for(String k: keys) {
      // System.out.println(k);
      // System.out.println(m.get(k));
    }

    // idea ctrl alt v 自动生成左边代码
    // Set<Entry<String, String>> entries = m.entrySet(); // 使用 Entry 也可以在上面导包
    Set<Map.Entry<String, String>> entries = m.entrySet();
    // 遍历 entries 这个集合, 去获得里面每一个键值对对象
    for(Map.Entry<String, String> entry: entries) {
      System.out.println(entry.getKey());
      System.out.println(entry.getValue());
    }

    // m.forEach(new BiConsumer<String,String>() {
    //   @Override
    //   public void accept(String k, String v) {
    //     System.out.println("key: " + k);
    //     System.out.println("value: " + v);
    //   }
    // });
    m.forEach((k, v) -> System.out.println(k + " " + v));
  }
}
