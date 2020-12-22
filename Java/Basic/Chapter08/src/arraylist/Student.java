package arraylist;

import refclass.Subject;

import java.util.ArrayList;

public class Student {
    int studentID;
    String studentName;
    ArrayList<Subject> subjectList;

    public Student(int studentID, String studentName){
        this.studentID = studentID;
        this.studentName = studentName;
        subjectList = new ArrayList<>();
    }

    public void addSubject(String name, int score){
        Subject subject = new Subject();
        subject.setSubjectName(name);
        subject.setScorePoint(score);
        subjectList.add(subject);//Subject object를 array list에 저장.
    }
    public void showInfo(){
        int total = 0;
        double avg = 0.0;
//        Subject subject = new Subject();
        for (Subject subject:
             subjectList) {
            total += subject.getScorePoint();
            System.out.printf("Student %s's %s score is %d.\n",
                    studentName, subject.getSubjectName(), subject.getScorePoint());
        }
        System.out.println("Total score : " + total);
        avg = total / subjectList.size();
        System.out.printf("Average Score : %.2f", avg);
    }
}
