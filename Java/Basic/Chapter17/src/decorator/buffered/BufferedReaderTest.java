package decorator.buffered;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderTest {
    public static void main(String[] args) {
        String fileName = "input2.txt";
        try(FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr)){

//            System.out.println(br.readLine());//한 줄 읽기


            //전체 읽기(buffer 미사용)
//            int readByte;
//            while((readByte = fr.read()) != -1){
//                System.out.print((char)readByte);
//            }
            //전체 읽기(buffer 사용)
            String s = null;
            while((s = br.readLine()) != null){
                System.out.println(s);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
