package outputstream;

import java.io.*;

public class FileCopy1 {
    public static void main(String[] args) {
        InputStream is = null;
        OutputStream os = null;

        try {
            is = new FileInputStream("src/outputstream/input.txt");
            os = new FileOutputStream("src/outputstream/inputCopy.txt");

            int i = 0;  //읽어 온 바이트 저장
            while((i = is.read()) != -1){   //파일 읽어오기
                os.write(i);    //파일에 쓰기
            }
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
    }
}
