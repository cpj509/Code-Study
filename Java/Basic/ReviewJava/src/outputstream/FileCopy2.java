package outputstream;

import java.io.*;

public class FileCopy2 {
    public static void main(String[] args) {
        InputStream is = null;
        OutputStream os = null;
        long start = 0, end = 0;

        try {
            String originFile = "C:\\Users\\c\\Desktop\\PJ\\Workspace\\Code-Study\\Java\\Basic\\ReviewJava\\src\\outputstream\\picture1.png";
            String copyFile = "src/outputstream/friends1.png";
            is = new FileInputStream(originFile);
            os = new FileOutputStream(copyFile);

            start = System.currentTimeMillis();

            int i = 0;  //읽어 온 바이트 저장
            while((i = is.read()) != -1){   //파일 읽어오기
                os.write(i);    //파일에 쓰기
            }
            end = System.currentTimeMillis();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("파일 복사 소요 시간 : " + (float)(end - start)/1000 + "초");
    }
}
