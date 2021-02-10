package school;

import java.util.ArrayList;

public class School {
    //학교는 학생 리스트와 점수 리스트 관리
    private static School instance;
    private ArrayList<Student> studentList = new ArrayList<>();
    private ArrayList<Subject> subjectList = new ArrayList<>();

    private School() {
    }

    public static School getInstance(){
        if(instance == null)
            instance = new School();
        return instance;
    }
    //학교가 학생을 추가
    public void addStudent(Student student){
        studentList.add(student);
    }

    //학교가 과목을 추가
    public void addSubject(Subject subject){
        subjectList.add(subject);
    }

    //get, set

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }

    public ArrayList<Subject> getSubjectList() {
        return subjectList;
    }

    public void setSubjectList(ArrayList<Subject> subjectList) {
        this.subjectList = subjectList;
    }
}
