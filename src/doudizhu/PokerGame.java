package src.doudizhu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringJoiner;
import java.util.TreeSet;

// 利用序号进行排序
public class PokerGame {
  // 静态代码块
  // 特点: 随着类的加载而加载, 且只执行一次
  static HashMap<Integer, String> hMap = new HashMap<>();
  static ArrayList<Integer> aList = new ArrayList<>();
  static {
    String[] color = {"♥", "♦", "♠", "♣"};
    String[] number = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
    int serialNumber = 1;
    for (String n : number) {
      for (String c : color) {
        hMap.put(serialNumber, c + n);
        aList.add(serialNumber);
        serialNumber++;
      }
    }
    hMap.put(serialNumber, "小王");
    aList.add(serialNumber);
    ++serialNumber;
    hMap.put(serialNumber, "大王");
    aList.add(serialNumber);
  }
  public PokerGame() {
    // 打乱
    Collections.shuffle(aList);
    System.out.println(hMap);

    // 发牌 TreeSet 会自动排序
    TreeSet<Integer> lord = new TreeSet<>();
    TreeSet<Integer> palyer1Poker = new TreeSet<>();
    TreeSet<Integer> palyer2Poker = new TreeSet<>();
    TreeSet<Integer> palyer3Poker = new TreeSet<>();
    for (int i = 0; i < aList.size(); i++) {
      int poker = aList.get(i);
      if (i <= 2) {
        lord.add(poker);
        continue;
      }

      if (i % 3 == 0) {
        palyer1Poker.add(poker);
      } else if (i % 3 == 1) {
        palyer2Poker.add(poker);
      } else if (i % 3 == 2) {
        palyer3Poker.add(poker);
      }
    }

    LookPoker(palyer1Poker);
    LookPoker(palyer2Poker);
    LookPoker(palyer3Poker);
  }

  public void LookPoker(TreeSet<Integer> palyerPoker) {
    StringJoiner sj = new StringJoiner(",", "", "");
    for (Integer p2 : palyerPoker) {
      sj.add(hMap.get(p2) + "");
    }
    System.out.println("玩家: " + sj);
  }

}
