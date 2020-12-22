package array;

public class BookArray {
    public static void main(String[] args) {
        Book[] library = new Book[5];
        library[0] = new Book("asdf1", "kim");
        library[1] = new Book("asdf2", "kim");
        library[2] = new Book("asdf3", "kim");
        library[3] = new Book("asdf4", "kim");
        library[4] = new Book("asdf5", "kim");

        for (Book asd:
             library) {
            System.out.println(asd.showInfo());
        }

        for (Book asd:
                library) {
            System.out.println(asd);
        }


    }
}
