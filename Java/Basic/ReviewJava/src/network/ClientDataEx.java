package network;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ClientDataEx {
    public static void main(String[] args) {
        Socket socket = null;

        socket = new Socket();

        try {
            System.out.println("[연결 요청]");
            socket.connect(new InetSocketAddress("localhost", 5100));
            System.out.println("[연결 성공]");

            //데이터 보내기 - 쓰기
            OutputStream os = socket.getOutputStream();
            String message = "Hello Server";
            byte[] bs = message.getBytes();
            os.write(bs);
            os.flush();
            System.out.println("[데이터 전송 성공]");

            //데이터 받기(읽기)
            InputStream is = socket.getInputStream();
            int readByteCount = is.read(bs);
            message = new String(bs, 0, readByteCount);
            System.out.println("[데이터 받기 성공] " + message);
        } catch (IOException e) {
            e.printStackTrace();
        }

        if(!socket.isClosed()){
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}