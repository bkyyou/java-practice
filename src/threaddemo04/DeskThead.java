package src.threaddemo04;

public class DeskThead {
  static int count = 0;
  static final int eatTotal = 10;
  static int theadFlag = 0; // 0 代表无 1: 无
  static Object lock = new Object();
}
