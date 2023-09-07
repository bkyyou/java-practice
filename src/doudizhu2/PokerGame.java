package src.doudizhu2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class PokerGame {
  // 静态代码块
  // 特点: 随着类的加载而加载, 且只执行一次
  static ArrayList<String> aList = new ArrayList<>();
  static HashMap<String, Integer> pokerValue = new HashMap<>();
  static {
    String[] color = {"♥", "♦", "♠", "♣"};
    String[] number = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
    for (String n : number) {
      for (String c : color) {
        aList.add(c + n);
      }
    } 
    aList.add(" 小王");
    aList.add(" 大王");

    pokerValue.put("J", 11);
    pokerValue.put("Q", 12);
    pokerValue.put("K", 13);
    pokerValue.put("A", 14);
    pokerValue.put("2", 15);
    pokerValue.put("小王", 16);
    pokerValue.put("大王", 17);
  }
  public PokerGame() {
    // 打乱
    Collections.shuffle(aList);
    // System.out.println(aList);

    ArrayList<String> lord = new ArrayList<>();
    ArrayList<String> palyer1Poker = new ArrayList<>();
    ArrayList<String> palyer2Poker = new ArrayList<>();
    ArrayList<String> palyer3Poker = new ArrayList<>();
    for (int i = 0; i < aList.size(); i++) {
      String poker = aList.get(i);
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


    order(lord);
    order(palyer1Poker);
    order(palyer2Poker);
    order(palyer3Poker);

    System.out.println(lord);
    System.out.println(palyer1Poker);
    System.out.println(palyer2Poker);
    System.out.println(palyer3Poker);
  }
  public void order(ArrayList<String> poker) {
    Collections.sort(poker, (o1, o2) -> {
      String s1 = o1.substring(1);
      int value1 = getPokerValue(s1);

      String s2 = o2.substring(1);
      int value2 = getPokerValue(s2);

      int v = value1 - value2;
      return  v == 0 ? o1.substring(0, 1).compareTo(o2.substring(0, 1)) : v;
    });
  }
  public int getPokerValue(String str) {
    if (pokerValue.containsKey(str)) {
      return pokerValue.get(str);
    } else {
      return Integer.parseInt(str);
    }
  }
}
