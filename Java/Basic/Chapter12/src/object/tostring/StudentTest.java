package object.tostring;

class Student{
    String name;
    int studentID;

    public Student(String name, int studentID) {
        this.name = name;
        this.studentID = studentID;
    }

    @Override
    public String toString() {
        return name + ", " + studentID;
    }
}

public class StudentTest {
    public static void main(String[] args) {
        Student a = new Student("asd", 123);
        System.out.println(a);
    }
}
