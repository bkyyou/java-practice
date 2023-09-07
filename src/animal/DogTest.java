package src.animal;

public class DogTest {
  public static void main(String[] args) {
    Dog d1 = new Dog("wangcai");
    // d1.category = ""; // 也可以
    Animal.category = "Animal";

    Animal a1 = new Dog();
    System.out.println(a1.appetite);
    a1.show();
  }
}
