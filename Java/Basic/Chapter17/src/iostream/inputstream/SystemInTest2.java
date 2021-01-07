package iostream.inputstream;

import java.io.IOException;

public class SystemInTest2 {
    public static void main(String[] args) {
        System.out.println("여러 문자를 입력하고 [Enter]를 누르세요.");

        int readByte;   //Byte형을 쓰지 않는 read()가 반환형 int로 함
        while(true){    //무한 반복
            try {
                readByte = System.in.read();
                if(readByte == -1)//더 이상 읽을 문자가 없을 때 -1이 반환됨.
                    break;
                System.out.println((char)readByte);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
