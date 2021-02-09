package array;

import java.util.ArrayList;

public class BookArrayList {
    public static void main(String[] args) {
        ArrayList<Book> bookList = new ArrayList<>();

        //자료 저장
        Book book1 = new Book("a", "Q");
        Book book2 = new Book("b", "W");
        Book book3 = new Book("c", "E");
        Book book4 = new Book("d", "R");

        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);

        //조회
        System.out.println(bookList.get(0));
        System.out.println(bookList.get(1));

        System.out.println("---------------");

        //전체 조회
        for (Book book:
             bookList) {
            System.out.println(book);
        }

        //수정
        bookList.get(0).setBookName("asd");
        bookList.get(0).setAuthor("qwe");

        System.out.println("---------------");

        for (Book book:
                bookList) {
            System.out.println(book);
        }
    }
}
