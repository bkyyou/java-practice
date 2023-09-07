package src.unicodedemo01;

import java.io.FileWriter;
import java.io.IOException;

public class UnicodeTest13 {
  public static void main(String[] args) throws IOException {
    FileWriter fw = new FileWriter("src/filewriter.txt");
    fw.write("你好么???");
    char[] charArr = {'a', 'b', 'v', '我'};
    fw.write(charArr);
    fw.close();

    FileWriter fwLongTxt = new FileWriter("src/long.txt");
    for (int i = 0; i < 8192; i++) {
      fwLongTxt.write("a");
    }
    fwLongTxt.write("b");
    fwLongTxt.close();
  }
}
