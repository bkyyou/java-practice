package src.exceptiondemo01;

public class People {
  private String name;
  private int age;
  public People() {
  }
  public People(String name, int age) {
    this.name = name;
    this.age = age;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    if (name.length() < 3 || name.length() > 8) {
      throw new NameFormatException("长度有误, 名字长度在3-10之间");
    }
    this.name = name;
  }
  public int getAge() {
    return age;
  }
  public void setAge(int age) {
    if (age < 18 || age > 40) {
      throw new AgeOutofBoundException("年龄范围在18-40之间");
    }
    this.age = age;
  }
  
}
