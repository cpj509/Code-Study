package lambda.string;

public class StringConcatTest {
    public static void main(String[] args) {
        //객체 지향 방식
        StringConcatimpl oop = new StringConcatimpl();
        oop.makeString("Hi", "Bro.");

        //람다 방식
        StringConcat lambda1 = (a, b) -> System.out.println(a + " " + b);
        lambda1.makeString("Hi", "Bro.");
    }
}
