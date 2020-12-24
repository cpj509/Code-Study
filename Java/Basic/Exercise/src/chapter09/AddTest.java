package chapter09;

public class AddTest {
    public static int add(int num1, int num2){//static형 메서드
        return num1+num2;
    }
    public int add2(int num1, int num2){//인스턴스형 메서드
        return num1+num2;
    }
    public static void main(String[] args) {
        AddTest aTest = new AddTest();
        System.out.println(aTest.add2(20,30));


        System.out.println(add(10,20));


    }
}
