package src.internet.practice1;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
  public static void main(String[] args) throws IOException {
    ServerSocket server = new ServerSocket(10000);

    Socket socket = server.accept();

    InputStream is = socket.getInputStream();
    InputStreamReader isr = new InputStreamReader(is);

    int b;
    while ((b = isr.read()) != -1) {
    System.out.println((char) b);
    }

    OutputStream os = socket.getOutputStream();
    os.write("你也好呀".getBytes());

    // while (true) {
    //   Socket socket = server.accept();

    //   InputStream is = socket.getInputStream();
    //   InputStreamReader isr = new InputStreamReader(is);

    //   int b;
    //   while ((b = isr.read()) != -1) {
    //     System.out.println((char) b);
    //   }

    //   OutputStream os = socket.getOutputStream();
    //   os.write("你也好呀".getBytes());
    // }

    // server.close();
  }
}
