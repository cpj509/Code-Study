package network;

import java.net.InetAddress;

public class InetAddressEx {
    public static void main(String[] args) {
        InetAddress local = null;
        try {
            local = InetAddress.getLocalHost();
            System.out.println("My Computer's IP address : " + local.getHostAddress());

            InetAddress google = InetAddress.getByName("www.google.com");
            System.out.println("Google's IP address : " + google.getHostAddress());

            InetAddress[] naver = InetAddress.getAllByName("www.naver.com");
            for(InetAddress remote : naver)
                System.out.println("Naver's IP address : " + remote.getHostAddress());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}