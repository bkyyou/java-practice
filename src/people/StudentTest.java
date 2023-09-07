package src.people;

public class StudentTest {
  public static void main(String[] args) {
    Student.teacher = "wanglaoshi";
    Student s1 = new Student("zs", 18);
    Student s2 = new Student("ls", 19);

    System.out.println(s1.teacher);
    System.out.println(s1.name);
    System.out.println(s2.teacher);
    System.out.println(Student.teacher);
  }
}
