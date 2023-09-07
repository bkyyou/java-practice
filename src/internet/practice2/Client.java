package src.internet.practice2;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
  public static void main(String[] args) throws IOException {
    Socket socket = new Socket("127.0.0.1", 10000);

    BufferedInputStream bis = new BufferedInputStream(new FileInputStream("src/file/22.6.jpg"));
    OutputStream os = socket.getOutputStream();

    int b;
    while ((b = bis.read()) != -1) {
      os.write(b);
    }
    socket.shutdownOutput();

    BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
    String msg = br.readLine();
    System.out.println(msg);

    br.close();
    socket.close();
  }
}
