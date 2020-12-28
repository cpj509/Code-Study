package array;

public class ObjectCopy3 {
    public static void main(String[] args) {
        //deep copy
        Book[] bookArray1 = new Book[3];
        Book[] bookArray2 = new Book[3];

        bookArray1[0] = new Book("asd1", "qwe");
        bookArray1[1] = new Book("asd2", "qwe");
        bookArray1[2] = new Book("asd3", "qwe");
        //객체 배열의 deep copy는 객체를 새로 만들어서 값을 넣어줘야 함.

        bookArray2[0] = new Book();
        bookArray2[1] = new Book();
        bookArray2[2] = new Book();

        for (int i = 0; i < bookArray1.length; i++) {
            bookArray2[i].setBookName(bookArray1[i].getBookName());
            bookArray2[i].setAuthor(bookArray1[i].getAuthor());
        }

        bookArray1[0].setBookName("zxc1");
        bookArray1[0].setAuthor("fgh");
        //bookArray1 출력
        for (int i = 0; i < bookArray1.length; i++) {
            System.out.println(bookArray1[i].showInfo());
        }
        //bookArray2 출력
        System.out.println("bookArray2");

        for (int i = 0; i < bookArray2.length; i++) {
            System.out.println(bookArray2[i].showInfo());
        }

    }
}
