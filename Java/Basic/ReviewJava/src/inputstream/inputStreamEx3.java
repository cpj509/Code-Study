package inputstream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class inputStreamEx3 {
    public static void main(String[] args) {
        InputStream is = null;
        String fileName = "src/inputstream/input2.txt";
        try {
            is = new FileInputStream(fileName);
            byte[] bs = new byte[100];
            int readByteCount = is.read(bs);
            String str = new String(bs, 0, readByteCount);  //가운데는 offset(시작 위치)
            System.out.println(str);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
