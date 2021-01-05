package innerclass;

public class Outer2 {
    int outNum = 100;
    static int sNum = 200;

    //클래스 이름이 없는 익명 객체
    Runnable runner = new Runnable() {
        int num = 10;
        int localNum = 20;//익명 클래스의 변수
        @Override
        public void run() {
            num = 30;//내부 클래스의 인스턴스라서 가능
            System.out.println(outNum + " 외부 클래스의 인스턴스 변수");
            System.out.println(sNum + " 외부 클래스의 정적 변수");
            System.out.println(localNum + " 내부 클래스의 인스턴스 변수");
        }
    };//세미콜론을 붙여야함
}
