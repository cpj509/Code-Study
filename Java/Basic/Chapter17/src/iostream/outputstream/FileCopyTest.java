package iostream.outputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopyTest {
    public static void main(String[] args) {
        String filePath = "src/iostream/outputstream/picture1.png";
        String copyPath = "C:\\Users\\c\\Downloads\\";
        long start = 0;
        long end = 0;
        try(FileInputStream fis = new FileInputStream(filePath);
            FileOutputStream fos = new FileOutputStream(copyPath + "picture2.png")){
            //이미지 파일 읽어오기
            start = System.currentTimeMillis(); //시작 시간(현재 시간)

            int readByte;
            while((readByte=fis.read()) != -1){
                fos.write(readByte);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        end = System.currentTimeMillis(); //종료 시간(현재 시간)
        System.out.println("소요 시간 : " + (end - start) * 0.001 + "초.");
        System.out.println("Done.");
    }
}
