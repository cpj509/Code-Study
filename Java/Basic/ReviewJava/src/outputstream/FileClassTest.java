package outputstream;

import java.io.File;
import java.io.IOException;

public class FileClassTest {
    public static void main(String[] args) throws IOException {
        //File class 사용하기
        File file = new File("src/outputstream/file1.txt");
        File dir = new File("src/outputstream/Dir");

        if(!file.exists()){
            file.createNewFile();
        }
        if(!dir.exists()){
            dir.mkdir();
        }

        System.out.println(file.isFile());
        System.out.println(dir.isDirectory());
        System.out.println(file.getName());
        System.out.println(file.getPath());
        System.out.println(dir.getPath());
    }
}
