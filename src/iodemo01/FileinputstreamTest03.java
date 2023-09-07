package src.iodemo01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileinputstreamTest03 {
  public static void main(String[] args) throws IOException {
    // aaa.txt 内容 abcde
    FileInputStream fis = new FileInputStream("src/aaa.txt");
    byte[] bArr = new byte[2];
    int len = fis.read(bArr);
    System.out.println(len);
    // bArr 要转换的数组, 0 索引起始位置, len 读几个
    System.out.println(new String(bArr, 0, len));
    int len1 = fis.read(bArr);
    System.out.println(len1);
    // bArr 要转换的数组, 0 索引起始位置, len 读几个
    System.out.println(new String(bArr, 0, len1));

    int len2 = fis.read(bArr);
    System.out.println(len2);
    // bArr 要转换的数组, 0 索引起始位置, len 读几个
    // 如果不写 len2, 打印 是 ed, 因为只有最后一个 e 了, c 的位置覆盖, d 保留了
    System.out.println(new String(bArr, 0, len2)); 

    copyFile();
  }
  public static void copyFile() throws IOException {
    long startTime = System.currentTimeMillis();
    FileInputStream fis = new FileInputStream("src/aaa.txt");
    FileOutputStream fos = new FileOutputStream("src/aaaCopy.txt");

    int len;
    byte[] streamArr = new byte[1024 * 1024 * 5];
    if ((len = fis.read(streamArr)) != -1) {
      fos.write(streamArr, 0, len);
    }
    fos.close();
    fis.close();
    long endTime = System.currentTimeMillis();
    System.out.println(endTime - startTime);
  }
}
