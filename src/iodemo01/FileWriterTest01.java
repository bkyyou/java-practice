package src.iodemo01;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

public class FileWriterTest01 {
  public static void main(String[] args) throws IOException {
    // 废弃 OutputStreamWriter
    OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("src/file/filewritertest01.txt"), Charset.forName("GBK"));
    // 新方案 FileWriter
    FileWriter fw = new FileWriter("src/file/filewritertest01.txt", Charset.forName("GBK"));
    String str = "你好啊啊啊hellowworld";
    // fw.write(str);
    osw.write(str + 2);
    fw.close();
    osw.close();
  }
}
