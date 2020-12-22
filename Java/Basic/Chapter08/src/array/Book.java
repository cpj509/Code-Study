package array;

public class Book {
    String bookName;
    String author;

    public Book(String bookName, String author){
        this.bookName = bookName;
        this.author = author;
    }

    public String showInfo(){
        return bookName + ", " + author;
    }
}
