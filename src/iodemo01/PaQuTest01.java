package src.iodemo01;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PaQuTest01 {
  public static void main(String[] args) throws IOException {
    String familyNameNet = "https://hanyu.baidu.com/s?wd=%E7%99%BE%E5%AE%B6%E5%A7%93&from=poem";
    String familNameStr = webCrawler(familyNameNet);

    System.out.println(getData(familNameStr, "(.{4})(，|。)", 1));
  }
  public static ArrayList<String> getData(String str, String regex, int index) {
    ArrayList<String> al = new ArrayList<>();
    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(str);
    while (matcher.find()) {
      al.add(matcher.group(index));
    }
    return al;
  }
  public static String webCrawler(String net) throws IOException {
    StringBuilder sb = new StringBuilder();
    URL url = new URL(net);
    URLConnection conn = url.openConnection();
    InputStreamReader isr = new InputStreamReader(conn.getInputStream());
    int ch;
    while ((ch = isr.read()) != -1) {
      sb.append((char) ch);
    }
    isr.close();
    return sb.toString();
  }
}
