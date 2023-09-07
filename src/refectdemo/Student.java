package src.refectdemo;

import java.io.IOException;

public class Student {
  private String name;
  private int age;
  private int sex;
  public int test;
  public Student() {
  }
  public Student(String name, int age, int sex) {
    this.name = name;
    this.age = age;
    this.sex = sex;
  }
  private Student(String name, int age) {
    this.name = name;
    this.age = age;
  }
  protected Student(String name) {
    this.name = name;
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
  public int getSex() {
    return sex;
  }
  public void setSex(int sex) {
    this.sex = sex;
  }
  public void sleep() {
    System.out.println(getName() + "正在睡觉");
  }
  private void eat(String food) throws IOException, NullPointerException {
    System.out.println("吃" + food);
  }
  private String run(String distance) {
    System.out.println("跑" + distance + "米");
    return "跑完了";
  }
  @Override
  public String toString() {
    return "Student [name=" + name + ", age=" + age + ", sex=" + sex + "]";
  }
  
}
