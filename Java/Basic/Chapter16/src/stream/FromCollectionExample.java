package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FromCollectionExample {

    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student("Lee", 85),
                new Student("Choi", 100),
                new Student("Kim", 98)
        );
        //Student 클래스로부터 stream 객체 얻어오기
        Stream<Student> stream = list.stream();
        stream.map(stu -> stu.getName()).forEach(s -> System.out.println(s));

        //점수가 90점 이상인 학생의 명단 출력
        stream = list.stream();
        stream.filter(stu -> stu.getScore() >= 90)
                .map(stu -> stu.getName())
                .forEach(System.out::println);

        stream = list.stream();
        stream.forEach(student -> {
            String name = student.getName();
            int score = student.getScore();
            System.out.println(name + ", " + score);
        });

        //스트림 생성 방법 2 - 인스턴스(객체)로 접근
        list.stream().map(Student::getName).forEach(System.out::println);
        list.stream().map(Student::getName).sorted().forEach(System.out::println);
    }
}
