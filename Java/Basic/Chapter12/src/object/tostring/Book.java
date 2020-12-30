package object.tostring;

public class Book {
    int bookNumber;
    String bookTitle;

    public Book(int bookNumber, String bookTitle){
        this.bookNumber = bookNumber;
        this.bookTitle = bookTitle;
    }

    @Override
    public String toString() {//toString 재정의
        return bookNumber + ", " + bookTitle;
    }
}
