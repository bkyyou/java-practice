package src.abstractdemo1;

public class Test {
  Animal an = new Animal() {
    @Override
    public void eat() {
      System.out.println("成员匿名内部类");
    }
  };
  public static void main(String[] args) {
    Frog f = new Frog("小青蛙", 1);

    System.out.println(f.getName() + " " + f.getAge());
    f.eat();
    f.swim();

    Rabbit r = new Rabbit("小兔子", 2);
    System.out.println(r.getName() + " " + r.getAge());
    r.eat();
    // r.swim();
    System.currentTimeMillis();

    eat(
      new Animal() { // 局部匿名内部类
        @Override
        public void eat() {
          System.out.println("狗吃骨头");
        }
      }
    );

    Swim swim = new Swim() {
      @Override
      public void swim() {
        System.out.println("狗在狗刨");
      }
    };
    swim.swim();
  }

  public static void eat(Animal a) { // 多态 Animal a = 子对象
    a.eat();
  }
}
