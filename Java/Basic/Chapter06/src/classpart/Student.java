package classpart;

public class Student {  //학생 클래스, stack 공간에 생성
    int studentID;  //멤버 변수
    String name;
    int grade;
    String address;

    public void showInfo(){
        System.out.println(studentID);
        System.out.println(name);
        System.out.println(grade);
        System.out.println(address);
    }
}
