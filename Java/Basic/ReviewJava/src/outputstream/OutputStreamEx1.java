package outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamEx1 {
    public static void main(String[] args) {
        //Java 9 버전부터 close()를 명시하지 않아도 됨
        //try ~ with ~ resource
        try(OutputStream os = new FileOutputStream("src/outputstream/output.txt")){
            //알파벳 대문자 쓰기
            byte[] alphabet = new byte[26];
            byte ch = 'A';
            for (int i = 0; i < alphabet.length; i++) {
                alphabet[i] = ch;
                ch++;
            }
            os.write(alphabet);
            os.write(10);
            os.write(alphabet, 2, 10);
            os.flush(); //잔류 버퍼 지우기
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("complete");
    }
}
