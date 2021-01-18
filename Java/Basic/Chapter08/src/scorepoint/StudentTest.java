package scorepoint;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student(1, "lee");
        student1.addSubject("Math", 100);
        student1.addSubject("English", 100);
        student1.showInfo();

        System.out.println();

        Student student2 = new Student(2, "kim");
        student2.addSubject("Math", 90);
        student2.addSubject("English", 80);
        student2.showInfo();
    }
}
