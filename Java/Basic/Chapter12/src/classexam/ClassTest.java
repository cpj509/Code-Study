package classexam;

public class ClassTest {
    public static void main(String[] args) throws ClassNotFoundException {
        Person person = new Person();

        //getClass() method of object
        Class<?> pClass = person.getClass();
        System.out.println(pClass.getName());//print class file name

        //directly use class file(compiled file)
        Class<?> pClass2 = Person.class;
        System.out.println(pClass2.getName());

        //from class path
        Class<?> pClass3 = Class.forName("classexam.Person");
        System.out.println(pClass3.getName());
    }
}
