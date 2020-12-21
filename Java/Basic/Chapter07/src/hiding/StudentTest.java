package hiding;

public class StudentTest {
    public static void main(String[] args) {
        Student lee = new Student();
        lee.studentID = 101;
//        lee.name = "LEE";
        lee.setName("LEE");

        System.out.println("name : " + lee.getName());
    }
}
