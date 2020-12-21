package staticsample;

public class StudentTest2 {
    public static void main(String[] args) {
        Student lee = new Student();
        lee.setName("LEE");
        System.out.println(Student.serialNum);
        Student.serialNum++;
        System.out.println(Student.serialNum);

        Student kim = new Student();
        kim.setName("KIM");

    }
}
