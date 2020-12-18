package variablescope;

import java.util.Arrays;

public class StaticVariable {
    static int x = 1;

    public static int func2(){
        return ++x;
    }
    public static void main(String[] args) {
        System.out.println(func2());
        System.out.println(func2());

    }
}
