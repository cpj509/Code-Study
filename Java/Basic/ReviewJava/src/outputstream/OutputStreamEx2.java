package outputstream;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class OutputStreamEx2 {
    public static void main(String[] args) {
        try(OutputStream os = new FileOutputStream("src/outputstream/output2.txt")){
            String str = "오늘은 월요일입니다. 지금 몇 시에요?";
            byte[] bs = str.getBytes(); //String 클래스의 getBytes()메서드 사용
            os.write(bs);
            os.flush();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
