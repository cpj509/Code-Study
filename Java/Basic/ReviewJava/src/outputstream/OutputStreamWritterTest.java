package outputstream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class OutputStreamWritterTest {
    public static void main(String[] args) {
        OutputStream os = null;
        OutputStreamWriter osw = null;

        try {
            os = new FileOutputStream("src/outputstream/writer.txt");
            osw = new OutputStreamWriter(os);

            String text = "지금까지 자바 복습을 했습니다.";

            osw.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                osw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("쓰기 완료!");
    }
}
