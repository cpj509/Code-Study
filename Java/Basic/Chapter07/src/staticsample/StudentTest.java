package staticsample;

public class StudentTest {
    public static void main(String[] args) {
        Student lee = new Student();
        lee.setName("Lee");

        System.out.println(lee.serialNum);
        lee.serialNum++;
        System.out.println(lee.serialNum);

        Student kim = new Student();
        kim.setName("KIM");
        System.out.println(kim.serialNum);
    }
}
