package generic.box;

public class BoxTest {
    public static void main(String[] args) {
        //non-generic
        Box box = new Box();
        box.set("Happy new year!!");

        String message = (String) box.get();
        System.out.println(message);

        //"apple" class type
        box.set(new Apple());
        Apple apple = (Apple) box.get();
        System.out.println(apple);
    }

}
