package stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class FromArrayExample {
    public static void main(String[] args) {
        //initialize String array
        String[] fruits = {"apple", "orange", "banana", "tomato"};

        System.out.println(fruits[0]);
        System.out.println(fruits[1]);
        System.out.println(fruits[2]);
        System.out.println(fruits[3]);

        System.out.println();

        //enhanced for
        for (String fruit:
             fruits) {
            System.out.println(fruit);
        }

        System.out.println();
        //use stream
        Stream<String> str = Arrays.stream(fruits);
//        str.forEach(fruit -> System.out.println(fruit));
        str.forEach(System.out::println);
        //Array passed to parameters of stream(T[]).

        System.out.println("=====================");
        int[] numList = {1, 2, 3, 4, 5};
        Arrays.stream(numList).forEach(System.out::println);

        int sum = Arrays.stream(numList).sum();
        int count = (int) Arrays.stream(numList).count();

        System.out.println("Sum : " + sum);
        System.out.println("Count : " + count);
    }
}
