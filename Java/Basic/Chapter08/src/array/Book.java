package array;

public class Book {
    String bookName;
    String author;

    public Book(){}

    public Book(String bookName, String author){
        this.bookName = bookName;
        this.author = author;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public String showInfo(){
        return bookName + ", " + author;
    }
}
