package decorator.serialization;

import java.io.Serializable;

public class Person implements Serializable {//직렬화 인터페이스 구현
    private String name;
    private String job;

    public Person() {
    }

    public Person(String name, String job) {
        this.name = name;
        this.job = job;
    }

    @Override
    public String toString() {
        return name + ", " + job;
    }
}
