package serversocket_socket;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerEx {
    public static void main(String[] args) {
        //연결 수락 프로그램 - 서버
        ServerSocket serverSocket = null;

        try {
            serverSocket = new ServerSocket();
            serverSocket.bind(new InetSocketAddress("localhost", 5001));//소켓 주소를 바인딩
                                //클라이언트의 소켓 주소가 바인딩되어 있어야 함.
            while(true){
                System.out.println("[연결중...]");
                Socket socket = serverSocket.accept();//연결 수락 - Socket 객체 생성

                //클라이언트의 IP 주소 확인
                InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
                System.out.println("[연결 수락] : " + isa.getHostName());
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
