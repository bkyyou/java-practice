package src.iodemo01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedStreamTest02 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new FileReader("src/test.txt"));
    BufferedWriter bw = new BufferedWriter(new FileWriter("src/testcopy.txt"));
    // BufferedWriter bw = new BufferedWriter(new FileWriter("src/testcopy.txt", true));

    // int ch;
    // while ((ch = br.read()) != -1) {
    //   System.out.println(ch);
    //   bw.write(ch);
    // }
    String str;
    while ((str = br.readLine()) != null) {
     System.out.println(str);
     bw.write(str); 
     bw.newLine();
    }

    bw.close();
    br.close();
  }
}
