package src.internet.practice1;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
  public static void main(String[] args) throws IOException {
    Socket socket = new Socket("127.0.0.1", 10000);

    String str = "你好啊";

    OutputStream os = socket.getOutputStream();
    os.write(str.getBytes());
    socket.shutdownOutput();

    InputStream is = socket.getInputStream();
    InputStreamReader isr = new InputStreamReader(is);

    int b;
    while ((b = isr.read()) != -1) {
      System.out.println((char) b);
    }

    socket.close();
  }
}
