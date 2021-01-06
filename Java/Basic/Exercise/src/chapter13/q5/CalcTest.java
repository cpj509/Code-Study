package chapter13.q5;

public class CalcTest {
    public static void main(String[] args) {
//        Calc calc = (a, b) -> a + b;
        Calc calc = Integer::sum;

        System.out.println(calc.add(1, 2));
    }
}
