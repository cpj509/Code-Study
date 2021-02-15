package network;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ClientEx {
    public static void main(String[] args) {
        Socket socket = null;

        socket = new Socket();

        try {
            System.out.println("[연결 요청]");
            socket.connect(new InetSocketAddress("localhost", 5100));
            System.out.println("[연결 성공]");
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