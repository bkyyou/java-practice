package src.collectionsdemo01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CollectionsTest {
  public static void main(String[] args) {
    ArrayList<String> aList = new ArrayList<>();

    // 批量添加元素
    Collections.addAll(aList, "a", "abc", "a");

    System.out.println(aList);

    // 打乱
    Collections.shuffle(aList);
    System.out.println(aList);

    practice();
  }
  public static void practice() {
    HashMap<String, ArrayList<String>> hm = new HashMap<>();
    ArrayList<String> aListBeijing = new ArrayList<>();
    Collections.addAll(aListBeijing, "朝阳区", "海淀区", "顺义区");
    ArrayList<String> aListLiaoNing = new ArrayList<>();
    Collections.addAll(aListLiaoNing, "丹东市", "阜新市", "葫芦岛市");
    ArrayList<String> aListJiLin = new ArrayList<>();
    Collections.addAll(aListJiLin, "通化");
    hm.put("北京", aListBeijing);
    hm.put("辽宁", aListLiaoNing);
    hm.put("吉林", aListJiLin);
    System.out.println(hm);
    // Set<Map.Entry<String, ArrayList<String>>> entries = hm.entrySet();
    StringBuilder str = new StringBuilder();
    hm.forEach((sheng, citys) -> {
      str.append(sheng);
      str.append("=");
      citys.forEach(ctry -> {
        str.append(ctry);
        str.append(",");
      });
    });
    System.out.println(str);
  }
}
