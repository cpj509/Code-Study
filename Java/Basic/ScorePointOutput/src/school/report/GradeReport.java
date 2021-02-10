package school.report;

import grade.BasicEvaluation;
import grade.GradeEvaluation;
import grade.MajorEvaluation;
import school.School;
import school.Score;
import school.Student;
import school.Subject;
import utils.Define;

import java.util.ArrayList;

public class GradeReport {
    School goodSchool = School.getInstance();

    public static final String TITLE = " 수강생 학점\t\t\n";
    public static final String HEADER = " 이름 | 학번 | 필수 과목 | 점수 \n";
    public static final String LINE = "-------------------------------\n";

    private StringBuffer buffer = new StringBuffer();

    //전체 내용을 출력하는 메서드
    public String getReport(){
        //과목 리스트 가져오기
        ArrayList<Subject> subjectList = goodSchool.getSubjectList();
        for (Subject subject : subjectList) {
            makeHeader(subject);
            makeBody(subject);
            makeFooter();
        }
        return buffer.toString();
    }
    public void makeHeader(Subject subject){
        buffer.append(GradeReport.LINE);
        buffer.append("\t").append(subject.getSubjectName()); //과목 이름
        buffer.append(GradeReport.TITLE);
        buffer.append(GradeReport.HEADER);
        buffer.append(GradeReport.LINE);
    }

    public void makeBody(Subject subject){
        //학생 리스트 가져오기
        ArrayList<Student> studentList = subject.getStudentList();
        for (Student student : studentList) {
            buffer.append(student.getStudentName());
            buffer.append(" | ");
            buffer.append(student.getStudentId());
            buffer.append(" | ");
            buffer.append(student.getMajorSubject().getSubjectName());
            buffer.append(" | ");

            //학생 별 수강 과목 학점 계산
            getScoreGrade(student, subject.getSubjectId());
            buffer.append("\n");
        }
    }
    public void makeFooter(){
        buffer.append("\n");
    }

    public void getScoreGrade(Student student, int subjectId){
        //학생 리스트에서 점수를 가져와서 스코어 리스트에 저장
        ArrayList<Score> scoreList = student.getScoreList();
        int majorId = student.getMajorSubject().getSubjectId();

        GradeEvaluation[] gradeEvaluation = {new BasicEvaluation(), new MajorEvaluation()};

        for (Score score : scoreList) {
            if (score.getSubject().getSubjectId() == subjectId) {
                String grade = "";
                if (score.getSubject().getSubjectId() == majorId) {
                    grade = gradeEvaluation[Define.SAB_TYPE].getGrade(score.getPoint());
                } else {
                    grade = gradeEvaluation[Define.AB_TYPE].getGrade(score.getPoint());
                }
                buffer.append(score.getPoint());
                buffer.append(":");
                buffer.append(grade);
            }
        }
    }
}
