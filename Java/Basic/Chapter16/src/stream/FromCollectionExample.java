package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FromCollectionExample {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student("Lee", 95),
                new Student("Choi", 100),
                new Student("Kim", 98)
        );


        Stream<Student> stream = list.stream();

        stream.forEach(student -> {
            String name = student.getName();
            int score = student.getScore();
            System.out.println(name + ", " + score);
        });
    }
}
