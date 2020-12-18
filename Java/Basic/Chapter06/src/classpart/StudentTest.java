package classpart;

public class StudentTest {
    public static void main(String[] args) {
        // use Student class
        Student student = new Student();    //student 인스턴스 생성

        //int[] num = new int[3];
        //Student 클래스이면서 자료형(type)이다.

        student.studentID = 101;//변수값 저장, heap 메모리에 저장됨.
        student.address = "서울시 구로구";
        student.grade = 3;
        student.name = "Hong";


        System.out.println("학번 : " + student.studentID);
        System.out.println("이름 : " + student.name);
        System.out.println("주소 : " + student.address);
        System.out.println("학년 : " + student.grade);

    }
}
