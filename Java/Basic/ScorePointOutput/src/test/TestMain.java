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

        //학교에 생성한 과목을 추가
        school.addSubject(korean);
        school.addSubject(math);
    }
    public void createStudent(){
        //학생 생성
        Student s1 = new Student(202101, "s1", korean);
        Student s2 = new Student(202102, "s2", math);
        Student s3 = new Student(202103, "s3", korean);

        //학교에 생성한 학생을 추가
        school.addStudent(s1);
        school.addStudent(s2);
        school.addStudent(s3);

        //수강 신청
        korean.register(s1);
        korean.register(s2);
        korean.register(s3);
        math.register(s1);
        math.register(s2);
        math.register(s3);

        //과목 점수 추가
        addScoreForStudent(s1, korean, 95);
        addScoreForStudent(s1, math, 95);
        addScoreForStudent(s2, korean, 85);
        addScoreForStudent(s2, math, 85);
        addScoreForStudent(s3, korean, 75);
        addScoreForStudent(s3, math, 75);
    }

    public void addScoreForStudent(Student student, Subject subject, int point){
        Score score = new Score(student.getStudentId(), subject, point);
        student.addSubjectScore(score);
    }
}
