package chapter13.q7;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Book{
    private String name;
    private int price;

    public Book(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}

public class LibraryTest {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();

        bookList.add(new Book("Java", 25000));
        bookList.add(new Book("Python", 15000));
        bookList.add(new Book("Android", 30000));

        //Stream class
        System.out.println("==Use stream class==");
        Stream<Book> stream = bookList.stream();
        stream.map(Book::getName).forEach(System.out::println);

        Stream<Book> stream2 = bookList.stream();
        int sumPrice1 = stream2.mapToInt(Book::getPrice).sum();
        System.out.println(sumPrice1);

        System.out.println("===========================");
        System.out.println("==Sum of all book's price==");
        int sumPrice = bookList.stream()
                .mapToInt(Book::getPrice)
                .sum();

        System.out.println(sumPrice);

        System.out.println("==Name of book that prices over 20000==");
        bookList.stream().filter(i -> i.getPrice() >= 20000)
                .map(Book::getName)
                .sorted()
                .forEach(System.out::println);
    }
}