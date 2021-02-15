package inputstream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamEx1 {
    public static void main(String[] args) {
        InputStream is = null;

        try {
            is = new FileInputStream("src/inputstream/input.txt");
            int i = 0;  //읽은 바이트 문자
//            while (true){
//                i = is.read();
//                if(i == -1)
//                    break;
//                System.out.print((char)i);
//            }
            while((i=is.read()) != -1){
                System.out.print((char)i);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        finally {
            try{
                is.close();
            } catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
