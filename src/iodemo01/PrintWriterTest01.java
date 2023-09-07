package src.iodemo01;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;

public class PrintWriterTest01 {
  public static void main(String[] args) throws IOException {
    PrintWriter pw = new PrintWriter(new FileWriter("src/file/printWriterTest01.txt"), true);
    pw.write(100);
    pw.println();
    pw.println(100);
    pw.print(true);
    pw.println();
    pw.printf("%s三打%s", "孙悟空", "白骨精");
    pw.close();
  }
}
