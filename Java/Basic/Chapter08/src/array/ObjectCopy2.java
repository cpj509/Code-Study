package array;

public class ObjectCopy2 {
    public static void main(String[] args) {
        //swallow copy
        Book[] bookArray1 = new Book[3];
        Book[] bookArray2 = new Book[3];

        bookArray1[0] = new Book("asd1", "qwe");
        bookArray1[1] = new Book("asd2", "qwe");
        bookArray1[2] = new Book("asd3", "qwe");


        System.arraycopy(bookArray1,0,bookArray2,0,bookArray1.length);
        bookArray1[0].setBookName("zxc1");
        bookArray1[0].setAuthor("fgh");

        for (int i = 0; i < bookArray1.length; i++) {
            System.out.println(bookArray1[i].showInfo());
        }

        System.out.println("bookArray2");

        for (int i = 0; i < bookArray2.length; i++) {
            System.out.println(bookArray2[i].showInfo());
        }

    }
}
