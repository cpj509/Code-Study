package network;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDataEx {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket();
            //포트 연결
            serverSocket.bind(new InetSocketAddress("localhost", 5100));

            //대기 상태
            while(true){
                System.out.println("[연결 대기중]");
                Socket socket = serverSocket.accept();  //연결 수락

                //클라이언트 IP 주소 얻기
                InetSocketAddress isa = (InetSocketAddress)socket.getRemoteSocketAddress();
                System.out.println("[연결 완료] : " + isa.getHostName());

                //데이터 받기(읽기)
                InputStream is = socket.getInputStream();
                byte[] bs = new byte[100];
                int readByteCount = is.read(bs);
                String message = new String(bs, 0, readByteCount);
                System.out.println("[데이터 받기 성공] " + message);

                //데이터 전송(쓰기)
                OutputStream os = socket.getOutputStream();
                message = "Hello Client";
                bs = message.getBytes();
                os.write(bs);
                os.flush();
                System.out.println("[데이터 전송 성공]");
            }
        } catch (Exception e) {
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
