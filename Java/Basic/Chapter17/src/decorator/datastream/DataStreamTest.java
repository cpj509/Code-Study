package decorator.datastream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataStreamTest {
    public static void main(String[] args) {
        //write in file
        try(FileOutputStream fos = new FileOutputStream("data.txt");
            DataOutputStream dos = new DataOutputStream(fos)){
            //write data
            dos.writeByte(0);
            dos.writeByte('0');
            dos.writeChar('M');
            dos.writeInt(100);
            dos.writeDouble(100.22);
            dos.writeUTF("안녕");

        }catch (Exception e){
            e.printStackTrace();
        }

        //read in file
        try(FileInputStream fis = new FileInputStream("data.txt");
            DataInputStream dis = new DataInputStream(fis)){
            //read data
            System.out.println(dis.readByte());
            System.out.println(dis.readByte());
            System.out.println(dis.readChar());
            System.out.println(dis.readInt());
            System.out.println(dis.readDouble());
            System.out.println(dis.readUTF());

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
