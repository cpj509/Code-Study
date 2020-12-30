package wrapper;

import java.util.ArrayList;

public class IntegerTest {
    public static void main(String[] args) {
        Integer num1 = 100;
        int num2 = 200;
//        int sum = num1 + num2;
        int sum = num1.intValue() + num2;
                //Integer(big) -> int(small) : unboxing

        System.out.println(sum);

        //parseInt() method
        int n1 = Integer.parseInt("300");//auto boxing(int -> integer)
        //string -> integer
        System.out.println(n1);

        //valueOf() method - convert integer or string
        Integer n2 = Integer.valueOf("1000");
        System.out.println(n2);

        //use in ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        for (int i = 0; i <
                numbers.size(); i++) {
            System.out.println(numbers.get(i));

        }
    }
}
