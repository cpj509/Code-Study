package multiinterface.myinterface;

public class MyClassTest {

    public static void main(String[] args) {
        MyClass aClass = new MyClass();
        aClass.x();
        aClass.y();
        aClass.myMethod();

        System.out.println("myClass는 상위 인터페이스 형으로 형 변환");

        X xClass = aClass;
        xClass.x();

        Y yClass = aClass;
        yClass.y();

        System.out.println("다중 상속한 iClass 출력");

        MyInterface iClass = aClass;
        iClass.x();
        iClass.y();
        iClass.myMethod();
    }
}
