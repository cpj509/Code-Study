package iostream.outputstream;

import java.io.FileOutputStream;

public class OutputStreamTest2 {
    public static void main(String[] args) {
        //java9 try ~ with ~ resource 구문 - close() 사용 안 함.
        try(FileOutputStream fos = new FileOutputStream("output2.txt")){
            //알파벳 대문자 26개를 넣을 배열 공간 생성
            byte[] bs = new byte[26];//기본 자료형 byte는 1Byte
            byte alpha = 'A';
            //1. 알파벳 배열 저장
            for (int i = 0; i < bs.length; i++) {
                bs[i] = alpha++;
            }
            //2. 배열을 파일에 저장
            fos.write(bs);
            fos.write(10);//line feed

            //3. 배열에서 특정 부분의 data를 쓰고 싶을 때.
            fos.write(bs, 2, 10);//off 부분의 index부터 len만큼 추가 작성
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("Done!!!!!!!");
    }
}
