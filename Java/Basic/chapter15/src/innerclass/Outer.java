package innerclass;

public class Outer {
    int outNum = 100;
    static int sNum = 200;

    Runnable getRunnable(){//반환형 Runnable
        int num = 10;//인터페이스 상수(final이 붙음)

        class MyRunnable implements Runnable{
            int localNum = 20;
            @Override
            public void run() { 
//                num = 20;//인터페이스의 상수여서 변경 불가
                System.out.println(outNum + " 외부 클래스의 인스턴스 변수");
                System.out.println(sNum + " 외부 클래스의 정적 변수");
                System.out.println(localNum + " 내부 클래스의 인스턴스 변수");

            }
        }
        return new MyRunnable();
    }
}
