package bookshelf;

public class BookShelf extends Shelf implements Queue{
    public BookShelf() {
        super();
    }

    @Override
    public int getCount() {
        return super.getCount();
    }

    @Override
    public void enQueue(String title) {
        shelf.add(title);
    }

    @Override
    public String deQueue() {
        return shelf.remove(0);
    }

    @Override
    public int getSize() {
        return getCount();
    }
}
