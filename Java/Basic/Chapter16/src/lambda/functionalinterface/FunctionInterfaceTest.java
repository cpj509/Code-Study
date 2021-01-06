package lambda.functionalinterface;

public class FunctionInterfaceTest {
    public static void main(String[] args) {
        MyFunctionalInterface fi;
        fi = ()->{//람다식 표기
            String str = "hello";
            System.out.println(str);
        };//세미콜론 필수
        fi.method();

        //단축 표기
        fi = () -> System.out.println("hello");
        fi.method();
    }
}
