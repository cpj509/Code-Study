package test;

import school.School;
import school.Score;
import school.Student;
import school.Subject;
import school.report.GradeReport;
import utils.Define;

public class TestMain {
    School school = School.getInstance();
    GradeReport gradeReport = new GradeReport();
    Subject korean;
    Subject math;
    Subject java;

    public static void main(String[] args) {
        TestMain test = new TestMain();

        test.createSubject();
        test.createStudent();

        //출력
        String report = test.gradeReport.getReport();
        System.out.println(report);
    }

    //과목 생성 메서드
    public void createSubject(){
        //과목 생성
        korean = new Subject("국어", Define.KOREAN);
        math = new Subject("수학", Define.MATH);
        java = new Subject("자바", Define.JAVA);

        java.setGradeType(Define.PF_TYPE);

        //학교에 생성한 과목을 추가
        school.addSubject(korean);
        school.addSubject(math);
        school.addSubject(java);
    }
    public void createStudent(){
        //학생 생성
        Student s1 = new Student(202101, "s1", korean);
        Student s2 = new Student(202102, "s2", math);

        //학교에 생성한 학생을 추가
        school.addStudent(s1);
        school.addStudent(s2);

        //수강 신청
        korean.register(s1);
        korean.register(s2);

        math.register(s1);
        math.register(s2);

        java.register(s1);
        java.register(s2);


        //과목 점수 추가
        addScoreForStudent(s1, korean, 95);
        addScoreForStudent(s1, math, 85);
        addScoreForStudent(s1, java, 75);
        addScoreForStudent(s2, korean, 85);
        addScoreForStudent(s2, math, 75);
        addScoreForStudent(s2, java, 65);
    }

    public void addScoreForStudent(Student student, Subject subject, int point){
        Score score = new Score(student.getStudentId(), subject, point);
        student.addSubjectScore(score);
    }
}
