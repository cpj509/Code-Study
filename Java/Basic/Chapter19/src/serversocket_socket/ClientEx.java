package serversocket_socket;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ClientEx {
    public static void main(String[] args) {
        //연결 요청 프로그램 - 클라이언트
        Socket socket = null;

        try {
            System.out.println("[연결 요청]");
            socket = new Socket(); //소켓 객체 생성
            socket.connect(new InetSocketAddress("localhost", 5001));
            //서버와 연결
            System.out.println("[연결 성공]");

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
