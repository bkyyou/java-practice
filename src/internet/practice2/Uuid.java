package src.internet.practice2;

import java.util.UUID;

public class Uuid {
  public static void main(String[] args) {
    String str = UUID.randomUUID().toString();
    System.out.println(str);
  }
}
