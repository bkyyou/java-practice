package src.abstractdemo1;

public class Rabbit extends Animal {
  public Rabbit() {
  }

  public Rabbit(String name, int age) {
    super(name, age);
  }

  @Override
  public void eat() {
    System.out.println("在吃草");
  }
  
}
