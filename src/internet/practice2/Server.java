package src.internet.practice2;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
  public static void main(String[] args) throws IOException {
    ServerSocket server = new ServerSocket(10000);
    
    Socket socket = server.accept();
    BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("src/file/server.jpg"));
    InputStream is = socket.getInputStream();
    int b;
    while ((b = is.read()) != -1) {
      bos.write(b);
    }
    bos.flush();
    bos.close();

    // OutputStream os = socket.getOutputStream();
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
    bw.write("上传成功");
    // bw.newLine();
    bw.close();

    // socket.close();
    // server.close();
  }
}
