package src.abstractdemo1;

public class Dog extends Animal implements Swim {
  public Dog() {
   
  }

  public Dog(String name, int age) {
    super(name, age);
  }

  @Override
  public void swim() {
    System.out.println("在狗刨");
  }

  @Override
  public void eat() {
    System.out.println("在吃骨头");
  }
  
}
