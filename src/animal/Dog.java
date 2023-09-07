package src.animal;

public class Dog extends Animal {
  String appetite = "bad";

  public Dog() {
  }

  public Dog(String name) {
    super(name);
  }

  @Override
  public void show() {
    System.out.println("Dog show");
  }
  // @Override
  // private void aaa() {

  // }
}
