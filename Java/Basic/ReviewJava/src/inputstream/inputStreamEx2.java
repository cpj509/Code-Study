package inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class inputStreamEx2 {
    public static void main(String[] args) {
        InputStream is = null;
        try {
            is = new FileInputStream("src/inputstream/input.txt");
            byte[] bs = new byte[5];
            int readByteCount = 0;
            while(true){
                readByteCount = is.read(bs);
                for (int i = 0; i < readByteCount; i++) {
                    System.out.print((char)bs[i]);
                }
                if (readByteCount == -1)
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try{
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}