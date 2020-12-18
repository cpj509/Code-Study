package variablescope;

public class LocalVariable {
    // 지역변수의 범위
    public static int func1(){
        int x = 1;
        x = x + 1;
        return x;
    }

    public static void main(String[] args) {
        System.out.println(func1());
        System.out.println(func1());

    }
}
