package src.filedemo01;

import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FileTest06 {
  public static void main(String[] args) {
    File file = new File("/Users/j/Desktop/my/java/practice/src");
    System.out.println(getLength(file));

    String str = "1.1.1";
    System.out.println(Arrays.toString(str.split("\\.")));

    System.out.println(staticSuffix(file));
  }
  public static long getLength(File file) {
    long len = 0;
    File[] fileArr = file.listFiles();
    
    for (File f : fileArr) {
      if (f.isDirectory()) {
        len += getLength(f);
      } else {
        len += f.length();
      }
    }
    return len;
  }
  public static HashMap<String, Integer> staticSuffix(File file) {
    HashMap<String, Integer> hm = new HashMap<>();
    File[] fileArr = file.listFiles();

    for (File oneFile : fileArr) {
      if (oneFile.isFile()) {
        String name = oneFile.getName();
        String[] nameArr = name.split("\\.");
        if (nameArr.length >= 2) {
          String suffer = nameArr[nameArr.length - 1];
          if (hm.containsKey(suffer)) {
            hm.put(suffer, hm.get(suffer) + 1);
          } else {
            hm.put(suffer, 1);
          }
        }
      } else {
        HashMap<String, Integer> newHm = staticSuffix(oneFile);
        Set<Map.Entry<String, Integer>> entries = newHm.entrySet();
        for(Map.Entry<String, Integer> entry: entries) {
          String key = entry.getKey();
          Integer value = entry.getValue();
          if (hm.containsKey(key)) {
            hm.put(key, hm.get(key) + value);
          } else {
            hm.put(key, value);
          }
        }
      }
    }

    return hm;
  }
}
