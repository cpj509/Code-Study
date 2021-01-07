package iostream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamTest2 {
    public static void main(String[] args) {
        InputStream is = null;
        try {
            is = new FileInputStream("input.txt");
            int readByte;
            while (true){
                readByte = is.read();
                if(readByte == -1)
                    break;
                System.out.print((char)readByte);
            }
//            while((readByte = is.read()) != -1){
//                System.out.print((char)readByte);
//            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
