package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IOExceptionHandling2 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("src/exception/data.txt");
            int i;
            while((i = fis.read()) != -1){
                System.out.print((char)i);

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {//상위 Exception class가 아래에 위치
            e.printStackTrace();
        } /*catch(Exception e){
            e.printStackTrace(e);
        }*/
        finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
