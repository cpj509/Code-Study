package virtualfunction;

public class TestA {
    int num;//멤버변수

    public void aaa() {//메서드
        System.out.println("aaa() 출력");
    }

    public static void main(String[] args) {
        TestA a1 = new TestA();//인스턴스는 스택공간에
        a1.num = 10;//.는 가리키는 거고 위치는 힙 메모리
        a1.aaa();//메서드는 데이터 영역(메서드 영역) 메모리 공간에 위치함

        TestA a2 = new TestA();
        a2.num = 20;
        a2.aaa();
    }
}
