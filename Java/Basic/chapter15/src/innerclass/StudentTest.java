package innerclass;

public class StudentTest {
    public static void main(String[] args) {
        Student kim = new Student("Kim");
        Student.Score score = kim.new Score();
        score.eng = 100;
        score.math = 70;
        score.showInfo();
    }
}
