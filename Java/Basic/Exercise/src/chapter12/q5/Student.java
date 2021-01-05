package chapter12.q5;

public class Student {
    private String studentID;
    private String studentName;

    public Student(String studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }

    @Override
    public String toString() {
        return studentID + ":" + studentName;
    }

    @Override
    public int hashCode() {
        return Integer.parseInt(studentID);
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("<출력 결과>");
        if(obj instanceof Student){
            Student student = (Student) obj;
            return this.studentID == student.studentID;
        }
        return false;
    }
}
