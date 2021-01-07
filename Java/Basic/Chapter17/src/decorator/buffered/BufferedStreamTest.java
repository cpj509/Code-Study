package decorator.buffered;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedStreamTest {
    public static void main(String[] args) {
        String filePath = "src/iostream/outputstream/picture1.png";
        String copyPath = "C:\\Users\\c\\Downloads\\picture2.png";
        long start = 0;
        long end = 0;
        try(FileInputStream fis = new FileInputStream(filePath);//기반 스트림
            FileOutputStream fos = new FileOutputStream(copyPath);
            BufferedInputStream bis = new BufferedInputStream(fis);//기반스트림을 보조스트림의 생성자 매개변수로 사용
            BufferedOutputStream bos = new BufferedOutputStream(fos)
            ){
            //이미지 파일 읽어오기
            start = System.currentTimeMillis(); //시작 시간(현재 시간)

            int readByte;
            while((readByte=bis.read()) != -1){
                bos.write(readByte);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        end = System.currentTimeMillis(); //종료 시간(현재 시간)
        System.out.println("소요 시간 : " + (end - start) * 0.001 + "초.");
        System.out.println("Done.");
    }
}
