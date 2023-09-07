package src.filedemo01;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.lang.reflect.Array;
import java.util.Arrays;

public class FileTest05 {
  public static void main(String[] args) {
    File file = new File("/Users/j/Desktop/my/java/practice/src");
    File[] fileArr = file.listFiles();
    for (File f : fileArr) {
      // System.out.println(f);
    }

    File[] rootArr = File.listRoots();
    System.out.println(Arrays.toString(rootArr));

    // 获取该路径下所有内容(仅仅能获取名字)
    File f = new File("/");
    System.out.println(Arrays.toString(f.list()));

    File f2 = new File("/");
    /*
     * accept 方法的形参, 表示 / 文件夹里面每一个文件或者文件夹路径
     * 参数一: 父级路径
     * 参数二: 子级路径
     * 返回值: 如果返回 true 保存当前路径
     *        如果返回 false 舍弃当前路径
     */
    String[] filterArr = f2.list(new FilenameFilter() {

      @Override
      public boolean accept(File dir, String name) {
        // System.out.println(dir);
        // System.out.println(name);
        // 是文件且以 .txt 结尾
        File f = new File(dir, name);
        return f.isFile() && name.endsWith(".txt");
      }

    });

    System.out.println(Arrays.toString(filterArr));

    File f3 = new File("/Users/j/Desktop/my/java/practice/src");
    File[] listFilterArr = f3.listFiles(new FileFilter() {

      @Override
      public boolean accept(File pathname) {
       return pathname.isFile() && pathname.getName().endsWith(".js"); 
      }
      
    });
    System.out.println(Arrays.toString(listFilterArr));

    f3.listFiles(new FilenameFilter() {

      @Override
      public boolean accept(File dir, String file) {
       File pathname = new File(dir, file);
       return pathname.isFile() && file.endsWith(".js"); 
      }
      
    });

    System.out.println(hasAvi(f3));

  }

  public static void getRootList() {
    File[] arr = File.listRoots();
    for (File file : arr) {
      hasAvi(file);
    }
  }
  public static boolean hasAvi(File file) {
    File[] fileArr = file.listFiles();
    boolean flag = false;
    // 没有权限的时候会返回 null
    if (fileArr != null) {
      for (File oneFile : fileArr) {
        if (oneFile.isDirectory()) {
          flag = hasAvi(oneFile);
        } else {
          flag = oneFile.getName().endsWith(".avi");
        }
        if (flag) {
          break;
        }
      }
    }
    return flag;
  }
}
