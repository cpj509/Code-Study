package hiding;

public class Student {
    int studentID;
    private String name;//private can use same class.
    int grade;
    String address;
    Student() {};//default는 같은 패키지 안에서 사용 가능함.

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
