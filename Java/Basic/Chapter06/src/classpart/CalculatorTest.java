package classpart;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int num1=10, num2=4;
        System.out.println(calc.add(num1, num2));
        System.out.println(calc.sub(num1, num2));
        System.out.println(calc.mul(num1, num2));
        System.out.println(calc.div(num1, num2));

    }
}
