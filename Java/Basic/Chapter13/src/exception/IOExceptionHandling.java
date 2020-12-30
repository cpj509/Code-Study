package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class IOExceptionHandling {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("exception/data.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        System.out.println("done");

    }
}
