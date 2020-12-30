package object.equals;

public class HashCodeTest {
    public static void main(String[] args) {
        String str1 = new String("abc");
        String str2 = new String("abc");
        //Print string "abc"'s hashcode value.
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());

        Integer i1 = 100;
        Integer i2 = 100;

        //Print integer 100's hashcode value.
        System.out.println(i1.hashCode());
        System.out.println(i2.hashCode());

        Book book1 = new Book(200, "Ant");
        Book book2 = new Book(200, "Ant");

        System.out.println(book1);
        System.out.println(book2);

        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());

    }
}
