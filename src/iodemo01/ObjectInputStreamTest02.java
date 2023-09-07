package src.iodemo01;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ObjectInputStreamTest02 {
  public static void main(String[] args) throws IOException, ClassNotFoundException {
    ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/file/ObjectOutputStreamTest02.txt"));
    ArrayList<Student> al = (ArrayList<Student>) ois.readObject();
    System.out.println(al);
    ois.close();
  }
}
