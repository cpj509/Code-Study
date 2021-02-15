package network;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerEx {
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
