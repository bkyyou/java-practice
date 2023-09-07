package src.people;

public class Student {
  // public String name;
  String name;
  int age;
  static String  teacher;
  public Student() {
    System.out.println("空参构造");
  }
  public Student(String name, int age) {
    this.name = name;
    this.age = age;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public int getAge() {
    return age;
  }
  public void setAge(int age) {
    this.age = age;
  }
}
