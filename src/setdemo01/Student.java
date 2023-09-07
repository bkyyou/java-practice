package src.setdemo01;

public class Student implements Comparable<Student> {
  private String name;
  private int age;

  public Student() {
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

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((name == null) ? 0 : name.hashCode());
    result = prime * result + age;
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Student other = (Student) obj;
    if (name == null) {
      if (other.name != null)
        return false;
    } else if (!name.equals(other.name))
      return false;
    if (age != other.age)
      return false;
    return true;
  }

  @Override
  public String toString() {
    return "Student [name=" + name + ", age=" + age + "]";
  }

  @Override
  public int compareTo(Student o) {
    // 指定排序规则
    return this.getAge() - o.getAge(); // 按照年龄进行排序
  }

  
  
}
