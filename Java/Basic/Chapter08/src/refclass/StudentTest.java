package refclass;

public class StudentTest {
    public static void main(String[] args) {
        Student a = new Student(1, "Aee");
        a.koreanSubject("Korean lang", 100);
        a.mathSubject("Mathematics", 100);
        a.showInfo();
    }
}
