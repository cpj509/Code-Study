package innerclass;

class A{
    public A() {
        System.out.println("A 객체가 생성됨");
    }

    class B {
        B(){
            System.out.println("B 객체가 생성됨");
        }
    }

    static class C{
        C(){
            System.out.println("C 객체가 생성됨");
        }
    }
    void method(){
        class D{
            D(){
                System.out.println("D 객체가 생성됨");
            }
        }
        D d = new D();
    }


}

public class ATest {
    public static void main(String[] args) {
        A a = new A();//외부 클래스
        A.B b = a.new B();//내부 클래스 B의 객체
        A.C c = new A.C();//정적 내부 클래스 C의 객체
        a.method();
    }
}
