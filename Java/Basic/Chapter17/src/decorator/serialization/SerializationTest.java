package decorator.serialization;

import java.io.*;

public class SerializationTest {
    public static void main(String[] args) {
        //직렬화 - 인스턴스 상태를 저장
        Person a = new Person("aa", "CEO");
        Person b = new Person("bb", "CTO");

        try(FileOutputStream fos = new FileOutputStream("serial.out");
            ObjectOutputStream oos = new ObjectOutputStream(fos)){
            //인스턴스를 파일에 쓰기
            oos.writeObject(a);
            oos.writeObject(b);
        }catch (Exception e){
            e.printStackTrace();
        }
        //역 직렬화
        try(FileInputStream fis = new FileInputStream("serial.out");
            ObjectInputStream ois = new ObjectInputStream(fis)){
            Person p1 = (Person)ois.readObject();
            Person p2 = (Person)ois.readObject();

            System.out.println(p1);
            System.out.println(p2);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}