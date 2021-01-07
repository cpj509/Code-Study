package decorator.buffered;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWriterTest {
    public static void main(String[] args) {
        try(FileWriter fw = new FileWriter("vegetable.txt");
            BufferedWriter bw = new BufferedWriter(fw)){
            bw.write("Onion");
            bw.newLine();
            bw.write("Potato");
            bw.newLine();
            bw.write("Garlic");
            bw.newLine();
            int num = 65;
            bw.write(num);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
