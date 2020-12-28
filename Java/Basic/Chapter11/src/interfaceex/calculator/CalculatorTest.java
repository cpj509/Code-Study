package interfaceex.calculator;

public class CalculatorTest {
    public static void main(String[] args) {
        MyCalculator calc = new MyCalculator();
        calc.showInfo();
        int n1 = 20;
        int n2 = 0;

        System.out.println(calc.add(n1, n2));
        System.out.println(calc.subtract(n1, n2));
        System.out.println(calc.times(n1, n2));
        System.out.println(calc.divide(n1, n2));
    }
}
