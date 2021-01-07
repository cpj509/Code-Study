package iostream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamTest1 {
    public static void main(String[] args) {
        try {
            InputStream is = new FileInputStream("input.txt");
            System.out.print((char)is.read());
            System.out.print((char)is.read());
            System.out.print((char)is.read());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
