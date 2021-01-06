package lambda;

@FunctionalInterface
interface PrintString{
    public void showString(String str);
}

public class LambdaTest {
    public static void main(String[] args) {
//        PrintString lambdaPrint = s -> System.out.println(s);
        PrintString lambdaPrint = System.out::println;//method reference
        lambdaPrint.showString("Hello, Java");

        //static printString() 호출
        printString(lambdaPrint);

        //return형 사용
        PrintString str = returnPrint();
        str.showString("Hello, Java");
    }

    public static void printString(PrintString p){//함수형 인터페이스를 매개변수로 사용
        p.showString("Hello, Java");
    }
    public static PrintString returnPrint(){
        return s -> System.out.println(s);//람다식을 리턴
    }
}
