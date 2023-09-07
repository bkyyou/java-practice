package src.phone;

public class GrilFriend {
  private int age;
  private String name;

  public void setAge(int a) {
    if (a >= 18 && a <= 50) {
      age = a;
    } else {
      System.out.println("年龄不合法");
    }
  }
  public int getAge() {
    return age;
  }
}
