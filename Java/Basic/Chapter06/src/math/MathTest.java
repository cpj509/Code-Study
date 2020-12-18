package math;

public class MathTest {
    public static void main(String[] args) {
        int v1 = Math.abs(-4);//절대값
        System.out.println(v1);

        long v2 = Math.round(5.5);//반올림
        System.out.println(v2);

        double v3 = Math.floor(3.3);//버림
        System.out.println(v3);

        int max = Math.max(10, 20);
        System.out.println("Max = " + max);

        double rand = Math.random();
        System.out.println(rand);

        System.out.println((int)(rand*6) + 1);
    }
}
