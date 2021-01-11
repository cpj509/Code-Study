package data_read_write;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class ClientEx {
    public static void main(String[] args) {
        Socket socket = null;


        try {
            socket = new Socket();
            System.out.println("[연결 요청]");
            socket.connect(new InetSocketAddress("localhost", 5001));
            System.out.println("[연결 성공]");

            //데이터 보내기
            byte[] bytes = null;
            String message = null;

            OutputStream os = socket.getOutputStream();
            message = "Hello, Server";
            bytes = message.getBytes(StandardCharsets.UTF_8);//배열에 메시지를 저장
            os.write(bytes);
            os.flush();//보낸 후 비움
            System.out.println("[데이터 송신 성공]");

            InputStream is = socket.getInputStream();
            bytes = new byte[100];
            int readBytes = is.read(bytes);
            message = new String(bytes, 0, readBytes, StandardCharsets.UTF_8);
            System.out.println("[데이터 수신 성공]" + message);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(!socket.isClosed()) {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
