package src.iodemo01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;

public class ObjectOutputStreamTest02 {
  public static void main(String[] args) throws IOException {
    ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/file/ObjectOutputStreamTest02.txt"));
    Student s1 = new Student("zs", 18);
    Student s2 = new Student("ls", 19);
    Student s3 = new Student("王五", 20);
    ArrayList<Student> al = new ArrayList<>();
    Collections.addAll(al, s1, s2, s3);
    oos.writeObject(al);
    oos.close();
  }
}
