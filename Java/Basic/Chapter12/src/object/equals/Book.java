package object.equals;

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

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Book){//obj가 Book의 instance면
            Book book = (Book)obj;//Book 클래스형으로 변환
            if(this.bookNumber == book.bookNumber)
                return this.bookTitle == book.bookTitle;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return bookNumber;
    }
}
