package src.clonedemo1;

public class UserTest {
  public static void main(String[] args) throws CloneNotSupportedException {
    int[] arr = {1,2,3,4,5,6,7,8};
    User u1 = new User("zs", 13, "123456", arr);
    User u2 = (User) u1.clone();

    System.out.println(u1);
    System.out.println(u2);
  }
}
