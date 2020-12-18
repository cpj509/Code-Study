package classpart;

import java.util.Arrays;

class Person{
    String name;
    int age;
    char gender;

}

public class PersonTest {
    private Person person2;

    public static void main(String[] args) {
        Person person = new Person();   //person -> 힙 메모리에 사용됨(메모리에 주소가 생김)
        person.name = "Son";
        person.age = 28;
        person.gender = 'M';

        System.out.println("name : " + person.name);
        System.out.println("age : " + person.age);
        System.out.println("sex : " + person.gender);
        System.out.println();

        //student의 주소 알아보기
        System.out.println(person);
        //실제 파일이름 -> 패키지이름.파일이름

    }
}
