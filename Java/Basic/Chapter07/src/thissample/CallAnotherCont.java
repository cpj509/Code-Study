package thissample;

class Person{
    String name;
    int age;

    Person(){
        this("SON", 29);
    }

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    Person returnItSelf(){
        return this;
    }
}

public class CallAnotherCont {
    public static void main(String[] args) {
        Person p = new Person();
        System.out.println(p.age);
        System.out.println(p.name);
        System.out.println(p);

        Person noName = p.returnItSelf();
        System.out.println(noName.age);
        System.out.println(noName.name);
        System.out.println(noName);

    }
}
