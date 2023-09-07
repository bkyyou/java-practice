package src.iodemo01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class ZipInputStreamTest01 {
  public static void main(String[] args) throws IOException {
    File src = new File("src/file/zip/test.zip");
    File target = new File("src/file/zip/test2/");

    // unzip(src, target);

    // toZip(new File("src/file/zip/test2/test/aaa.txt"), new File("src/file/zip/test2"));

    ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(new File("src/file/zip", "test2.zip")));
    File src3 = new File("src/file/zip/test2/test");
    toFileZip(src3, "", zos);
    zos.close();

  }
  public static void unzip(File src, File target) throws IOException {
    ZipInputStream zip = new ZipInputStream(new FileInputStream(src));
    // 表示当前压缩包中获取文件或者文件夹
    ZipEntry entry;
    while ((entry = zip.getNextEntry()) != null) {
      if (entry.getName().contains("DS_Store")) {
        continue;
      }
      System.out.println(entry.getName());
      System.out.println(entry);
      if (entry.isDirectory()) {
        File f = new File(target, entry.toString());
        f.mkdirs();
      } else {
        FileOutputStream fis = new FileOutputStream(new File(target, entry.toString()));
        int b;
        while ((b = zip.read()) != -1) {
          fis.write(b);
        }
        fis.close();
        // 表示在一个压缩包中一个文件处理完了
        entry.clone();
      }
    }
    zip.close();
  }
  public static void toZip(File src, File target) throws IOException {
    ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(new File(target, "b.zip")));
    // ZipEntry 表示压缩包里面的路径
    ZipEntry ze = new ZipEntry("bbb/b.txt");
    zos.putNextEntry(ze);
    FileInputStream fis = new FileInputStream(src);
    int b;
    while ((b = fis.read()) != -1) {
      zos.write(b);
    }
    fis.close();
    zos.closeEntry();

    // 测试 ZipEntry 压缩路径
    // ZipEntry ze2 = new ZipEntry("ccc/c.txt");
    // zos.putNextEntry(ze2);
    // FileInputStream fis2 = new FileInputStream("src/file/zip/test2/test/bbb.js");
    // int b2;
    // while ((b2 = fis2.read()) != -1) {
    //   zos.write(b2);
    // }
    // fis2.close();
    // zos.closeEntry();

    zos.close();
  }
  public static void toFileZip(File src, String target, ZipOutputStream zos) throws IOException {    
    File[] files = src.listFiles();
    for(File file:files) {
      if (file.isDirectory()) {
        toFileZip(new File(src, file.getName()), target + file.getName() + "/", zos);
      } else {
        System.out.println(target + file.getName());
        ZipEntry ze = new ZipEntry(target + file.getName());
        zos.putNextEntry(ze);
        // System.out.println(file.getName());
        FileInputStream fis = new FileInputStream(file);
        int b;
        while ((b = fis.read()) != -1) {
          zos.write(b);
        }
        fis.close();
        zos.closeEntry();
      }
    }
  }
}
