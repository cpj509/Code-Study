package arraylist;

import array.Book;

import java.util.ArrayList;

public class BookArrayList {
    public static void main(String[] args) {
        //리스트 생성
        ArrayList<Book> library = new ArrayList<>();

        //Book 객체 생성
        Book book1 = new Book("미생1", "윤태호");
        Book book2 = new Book("미생2", "윤태호");
        Book book3 = new Book("미생3", "윤태호");

        //List에 객체를 생성해서 저장
        library.add(book1);
        library.add(book2);
        library.add(book3);

        //전체 출력
//        for (int i = 0; i < library.size(); i++) {
//            Book book = library.get(i);
//            System.out.println(book.showInfo());
//        }
        for (Book book : library) {
            System.out.println(book.showInfo());
        }
    }
}
