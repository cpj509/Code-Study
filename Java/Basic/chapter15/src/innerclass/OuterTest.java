package innerclass;

public class OuterTest {
    public static void main(String[] args) {
        //지역 내부 클래스의 객체 생성
        Outer outer = new Outer();
        outer.getRunnable().run();

        System.out.println("==인터페이스형으로 형 변환==");

        Runnable runner = outer.getRunnable();
        runner.run();

    }
}
