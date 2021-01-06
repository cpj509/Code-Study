package lambda.functionalinterface;

public class MyFuncInterfaceTest2 {
    public static void main(String[] args) {
        MyFuncInterface2 fi = x -> {
            int result = x + 5;
            System.out.println(result);
        };
        fi.method(10);

        //단축 표기
        fi = x -> System.out.println(x + 5);
        fi.method(10);

        //익명 객체 구현. 람다식은 아님
        fi = new MyFuncInterface2() {
            @Override
            public void method(int x) {
                System.out.println(x+5);
            }
        };
        fi.method(10);
    }
}
