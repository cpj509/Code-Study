package data_read_write;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class ServerEx {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;

        try {
            serverSocket = new ServerSocket();
            serverSocket.bind(new InetSocketAddress("localhost", 5001));
            while (true){
                System.out.println("[연결 대기중...]");
                Socket socket = serverSocket.accept();
                InetSocketAddress remote = (InetSocketAddress) socket.getRemoteSocketAddress();    //연결 요청 클라이언트의 IP주소 얻어옴
                System.out.println("[연결 수락] : " + remote.getHostName());

                //데이터 받기
                byte[] bytes = null;
                String message = null;

                InputStream is = socket.getInputStream();
                bytes = new byte[100];
                int readBytes = is.read(bytes);
                message = new String(bytes, 0, readBytes, StandardCharsets.UTF_8);
                System.out.println("[데이터 수신 성공] " + message);

                OutputStream os = socket.getOutputStream();
                message = "Hello, Client";
                bytes = message.getBytes(StandardCharsets.UTF_8);
                os.write(bytes);
                os.flush();
                System.out.println("[데이터 송신 성공]");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(!serverSocket.isClosed()) {
            try {
                serverSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
