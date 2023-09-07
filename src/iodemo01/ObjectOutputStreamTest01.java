package src.iodemo01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamTest01 {
  public static void main(String[] args) throws IOException, ClassNotFoundException {
    String path = "src/ObjectOutputStreamtest01.txt";
    Student s1 = new Student("zs", 18);
    ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));
    oos.writeObject(s1);
    oos.close();

    ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));
    Student readS = (Student) ois.readObject();
    System.out.println(readS);
    ois.close();
  }
}
