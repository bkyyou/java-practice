package src.iodemo01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamTest01 {
  public static void main(String[] args) throws IOException {
    PrintStream ps = new PrintStream(new FileOutputStream("src/file/printStreamTest01.txt"), true, "UTF-8");
    // ps.write(110);
    ps.write(1000000000);
    ps.println();
    ps.println(110);
    ps.print(true);
    ps.println();
    ps.printf("%s三打%s", "孙悟空", "白骨精");
    ps.close();
  }
}
