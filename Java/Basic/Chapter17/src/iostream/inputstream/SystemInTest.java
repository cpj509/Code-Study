package iostream.inputstream;

import java.io.IOException;

public class SystemInTest {
    public static void main(String[] args) {
        System.out.println("한 문자를 입력하고 [Enter]를 누르세요.");

        int readByte;   //Byte형을 쓰지 않는 read()가 반환형 int로 함
        try {
            readByte = System.in.read();
            System.out.println(readByte);
            System.out.println((char)readByte);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
