package object.tostring;

public class BookTest {
    public static void main(String[] args) {
        String name1 = "a";
        String name2 = new String("b");

        System.out.println(name1);
        System.out.println(name2.toString());

        Book book = new Book(1, "qw");
        System.out.println(book);
        System.out.println(book.toString());

    }
}
