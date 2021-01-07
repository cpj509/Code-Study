package iostream.reader;

import java.io.FileReader;

public class FileReaderTest {
    public static void main(String[] args) {
        //문자 파일 읽어 오기
        try(FileReader fr = new FileReader("input2.txt")){
            int i;
            while((i = fr.read()) != -1){
                System.out.print((char)i);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
