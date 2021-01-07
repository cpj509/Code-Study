package iostream.inputstream;

import java.io.IOException;

public class SystemInTest3 {
    public static void main(String[] args) {
        System.out.println("여러 문자를 입력하고 [Enter]를 누르세요.");

        int readByte;   //Byte형을 쓰지 않는 read()가 반환형 int로 함
        try {
            while((readByte=System.in.read()) != -1){
                System.out.println((char)readByte);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
