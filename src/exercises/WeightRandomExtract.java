package src.exercises;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class WeightRandomExtract {
  public static void main(String[] args) throws IOException {
    String path = "src/exercises/student.txt";
    BufferedReader br = new BufferedReader(new FileReader(path));
    ArrayList<Student> aList = new ArrayList<>();
    String str;
    while ((str = br.readLine()) != null) {
      String[] arr = str.split("-");
      aList.add(new Student(arr[0], arr[1], Integer.parseInt(arr[2]), Double.parseDouble(arr[3])));
    }
    br.close();
    // 计算权重总和
    double weight = 0;
    for(Student s: aList) {
      weight += s.getWeight();
    }
    // 计算每个人的实际占比
    double[] fanwei = new double[aList.size()];
    fanwei[0] = aList.get(0).getWeight() / weight;
    for (int i = 1; i < fanwei.length; i++) {
      fanwei[i] = aList.get(i).getWeight() / weight + fanwei[i - 1];
    }
    System.out.println(Arrays.toString(fanwei));
    double number = Math.random();
    System.out.println(number);
    /*
     * binarySearch 
     * 二分查找, 方法返回: -插入点 - 1;
     */
    // 获取 number 这个数据在数组当中的插入点位置
    int index = -Arrays.binarySearch(fanwei, number) - 1;
    System.out.println(index);
    Student chooseStudent = aList.get(index);
    chooseStudent.setWeight(chooseStudent.getWeight() / 2);
    BufferedWriter bw = new BufferedWriter(new FileWriter(path));
    for(Student s: aList) {
      bw.write(s.toString());
      bw.newLine();
    }
    bw.close();
  }
}
