package refclass;

public class Student {
    int studentID;
    String studentName;
    Subject korean;
    Subject math;

    public Student(int studentID, String studentName){
        this.studentID = studentID;
        this.studentName = studentName;
        korean = new Subject();
        math = new Subject();
    }

    public void koreanSubject(String name, int score){
        korean.setSubjectName(name);
        korean.setScorePoint(score);
    }
    public void mathSubject(String name, int score){
        math.setSubjectName(name);
        math.setScorePoint(score);
    }
    public void showInfo(){
        System.out.printf("Student %s's Korean score is %d and" +
                " Math score is %d", studentName, korean.getScorePoint()
        , math.getScorePoint());
    }
}
