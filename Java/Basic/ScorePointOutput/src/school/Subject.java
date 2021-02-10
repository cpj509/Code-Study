package school;

import utils.Define;

import java.util.ArrayList;

public class Subject {
    private String subjectName; //과목 이름
    private int subjectId;      //과목 아이디(고유 번호)
    private int gradeType;      //학점 평가(정책)
    //학생 리스트
    ArrayList<Student> studentList = new ArrayList<>();

    public Subject(String subjectName, int subjectId) {
        this.subjectName = subjectName;
        this.subjectId = subjectId;
        this.gradeType = Define.AB_TYPE;    //생성 시 일반 과목 정책 적용
    }

    //학생을 등록하는 리스트
    public void register(Student student){
        studentList.add(student);
    }

    //get, set
    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public int getGradeType() {
        return gradeType;
    }

    public void setGradeType(int gradeType) {
        this.gradeType = gradeType;
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }
}
