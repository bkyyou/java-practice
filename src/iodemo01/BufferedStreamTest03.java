package src.iodemo01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class BufferedStreamTest03 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new FileReader("src/file/sortGuShi.txt"));
    BufferedWriter bw = new BufferedWriter(new FileWriter("src/file/newSortGuShi.txt"));
    String str;
    // 一种
    TreeSet<String> ts = new TreeSet<>((o1, o2) -> Integer.parseInt(o1.split("\\.")[0]) - Integer.parseInt(o2.split("\\.")[0]));
    // 两种
    TreeMap<Integer, String> tm = new TreeMap<>((o1, o2) -> o1 - o2);
    // 三种
    ArrayList<String> al = new ArrayList<>();

    while ((str = br.readLine()) != null) {
      ts.add(str);
      String[] arr = str.split("\\.");
      tm.put(Integer.parseInt(arr[0]), str);
      al.add(str);
    }
    // 一种
    // for (String s : ts) {
    //   bw.write(s);
    //   bw.newLine();
    // }
    // 两种
    // Set<Map.Entry<Integer, String>> entries = tm.entrySet();
    // for (Entry<Integer,String> entry : entries) {
    //   bw.write(entry.getValue());
    //   bw.newLine();
    // }
    // 三种
    Collections.sort(al, (o1, o2) -> Integer.parseInt(o1.split("\\.")[0]) - Integer.parseInt(o2.split("\\.")[0]));
    for(String oneAl: al) {
      bw.write(oneAl);
      bw.newLine();
    }

    bw.close();
    br.close();
  }
}
