package innerclass;

public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    class Score{//Score class
        int eng;
        int math;

        public void showInfo(){
            System.out.println("Name : " + name);
            System.out.println("English : " + eng);
            System.out.println("Math : " + math);
        }
    }
}
