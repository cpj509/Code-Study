package decorator.buffered;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderTest2 {
    public static void main(String[] args) {
        //파일의 자료를 배열로 읽어 오기
        try(FileReader fr = new FileReader("animal.txt");
            BufferedReader br = new BufferedReader(fr)){
            String line = null;
            String[] animal = null;
            while((line=br.readLine()) != null){
                animal = line.split(" ");
            }
            assert animal != null;
            //배열의 전체 데이터 출력
            for (String s:
                 animal) {
                System.out.println(s);
            }
            //랜덤하게 추출
            int rand = (int)(Math.random()*animal.length);
            System.out.println(animal[rand]);


        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
