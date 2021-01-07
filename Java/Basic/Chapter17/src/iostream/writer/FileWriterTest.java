package iostream.writer;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
    public static void main(String[] args) {
        try(FileWriter fw = new FileWriter("writer.txt")){
            //문자 쓰기만 가능하다
            fw.write("안녕하세요");
            fw.write(49);
            //배열
            char[] buf = {'가', '나', '다'};
            fw.write(buf);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("완료");
    }
}
