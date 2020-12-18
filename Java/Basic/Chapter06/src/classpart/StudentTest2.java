package classpart;

public class StudentTest2 {
    public static void main(String[] args) {
        Student std1 = new Student();
        std1.studentID = 1001;
        std1.name = "asd";
        std1.grade = 2;
        std1.address = "newyork";

        std1.showInfo();//메서드 호출
    }
}
