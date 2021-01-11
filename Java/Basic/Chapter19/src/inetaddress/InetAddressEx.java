package inetaddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressEx {
    public static void main(String[] args) {
        //get IP address

        try {
            //로컬 컴퓨터(my computer)
            InetAddress localHost = InetAddress.getLocalHost();
            System.out.println("내 컴퓨터의 IP address : " + localHost.getHostAddress());

            //외부(원격) 컴퓨터의 IP 주소 얻기 - 도메인 네임(DN)
            String URL = "www.naver.com";
            InetAddress[] remoteArr = InetAddress.getAllByName(URL);
            for(InetAddress remote : remoteArr){
                System.out.println("URL의 IP address : " + remote);
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
