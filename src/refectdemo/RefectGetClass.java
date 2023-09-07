package src.refectdemo;

public class RefectGetClass {
  public static void main(String[] args) throws ClassNotFoundException {
    // 第一种方式
    // 全类名: 包名 + 类名
    // 最为常用
    Class class1 = Class.forName("src.refectdemo.Student");

    // 第二种方式
    // 一般是当成参数传递
    Class class2 = Student.class;

    // 第三种方式
    // 当我们有了这个类的对象时, 才可以使用
    Student s = new Student("张三", 18, 1);
    Class class3 = s.getClass();

    System.out.println(class1 == class2);
    System.out.println(class3 == class2);
  }
}
