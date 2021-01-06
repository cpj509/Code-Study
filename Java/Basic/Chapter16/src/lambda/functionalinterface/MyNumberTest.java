package lambda.functionalinterface;

public class MyNumberTest {
    public static void main(String[] args) {
        MyNumber max;

        max = (x, y) -> {
            int result = (x >= y) ? x : y;
            return result;
        };
        System.out.println(max.getMax(10, 20));

        //단축 표기1
        max = (x, y) -> (x >= y) ? x : y;
        max.getMax(10, 20);

        //단축 표기2
        max = Math::max;
        System.out.println(max.getMax(10, 20));

    }
}
