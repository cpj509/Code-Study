package bookshelf;

public class BookShelfTest {
    public static void main(String[] args) {
        Queue shelfQueue = new BookShelf();

        System.out.println(shelfQueue.getSize());
        shelfQueue.enQueue("a");
        shelfQueue.enQueue("b");
        shelfQueue.enQueue("c");
        System.out.println(shelfQueue.getSize());
        System.out.println(shelfQueue.deQueue());
        System.out.println(shelfQueue.deQueue());
        System.out.println(shelfQueue.deQueue());
        System.out.println(shelfQueue.getSize());
    }
}
