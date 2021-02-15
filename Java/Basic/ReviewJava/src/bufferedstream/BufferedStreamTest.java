package bufferedstream;

import java.io.*;

public class BufferedStreamTest {
    public static void main(String[] args) {
        FileReader fr = null;
        FileWriter fw = null;
        BufferedReader br = null;
        BufferedWriter bw = null;

        try {
            fr = new FileReader("src/bufferedstream/score.txt");
            fw = new FileWriter("src/bufferedstream/scoreReport.txt");
            br = new BufferedReader(fr);
            bw = new BufferedWriter(fw);

            String line = null; //한 줄 데이터
            String[] data = null;   //배열
            while(true){
                line = br.readLine();

                if(line == null)
                    break;
                data = line.split(" "); //공백을 구분으로 배열 만들기
                int sum = Integer.parseInt(data[1]) + Integer.parseInt(data[2]);
                double avg = (double)sum / 2;
                line = line + " " + sum + " " + avg;    //연결 연산자를 이용해서 문자열 더하기
                System.out.println(line);
                bw.write(line); //파일에 쓰기
                bw.newLine();   //줄 바꿈
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
