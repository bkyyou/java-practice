package src.iodemo01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileoutputstreamTest02 {
  public static void main(String[] args) throws IOException {
    String str = "abc";
    byte[] byteArr = str.getBytes();
    FileOutputStream fos = new FileOutputStream("src/aaa.txt", true);
    fos.write(byteArr);
    fos.close();
    
    String str2 = "sunwukong\n\r666";
    byte[] byteArr2 = str2.getBytes();
    FileOutputStream fos2 = new FileOutputStream("src/bbb.txt");
    fos2.write(byteArr2);
    fos2.close();
  }
}
