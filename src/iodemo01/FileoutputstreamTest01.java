package src.iodemo01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileoutputstreamTest01 {
  public static void main(String[] args) throws IOException {
    // 写相对路径是以 src 为标准的 可能是和包名有关系 ???
    FileOutputStream fos = new FileOutputStream("src/a.txt");
    fos.write(100);
    fos.close();
  }
}
