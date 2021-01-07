package iostream.outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamTest1 {
    public static void main(String[] args) {
        OutputStream os = null;//전역 변수 선언
        try {
            os = new FileOutputStream("output.txt");
            os.write(65);//파일에 문자 쓰기
            os.write(66);
            os.write(67);
        } catch (IOException e) {//상위 예외처리
            e.printStackTrace();
        }finally {
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
