package src.mapdemo01;

public class Student1 implements Comparable<Student1> {
  private String name;
  private int age;
  public Student1() {
  }
  public Student1(String name, int age) {
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
  public int compareTo(Student1 o) {
    /**
     * this 表示当前要添加元素
     * o 表示当前已经在红黑树存在的元素
     * 
     * 返回值
     * 负数: 表示当前要添加的元素是小的, 存左边
     * 正数: 表示当前要添加的元素是大的, 存右边
     * 0: 表示当前要添加的元素已经存在, 舍弃 (在这里应该是覆盖键值)
     * 
     * compareTo 是根据 Ascll 表中排序
     * 
     */
    int i = this.getAge() - o.getAge();
    return i == 0 ? this.getName().compareTo(o.getName()) : i;
  }
  @Override
  public String toString() {
    return "Student1 [name=" + name + ", age=" + age + "]";
  }
}
