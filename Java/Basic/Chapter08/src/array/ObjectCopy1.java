package array;

public class ObjectCopy1 {
    public static void main(String[] args) {
        Book[] bookArray1 = new Book[3];
        Book[] bookArray2 = new Book[3];
        bookArray1[0] = new Book("aaaa1", "bbb");
        bookArray1[1] = new Book("aaaa2", "bbb");
        bookArray1[2] = new Book("aaaa3", "bbb");

        //배열 복사
        System.arraycopy(bookArray1,0,bookArray2,0,bookArray1.length);
        for (Book a:
             bookArray2) {
            System.out.println(a.showInfo());
        }
        System.out.println("===================================");

        for (Book a:
                bookArray1) {
            System.out.println(a.showInfo());
        }

        for (Book a:
                bookArray2) {
            System.out.println(a.showInfo());
        }

    }


}
