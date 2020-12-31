package generic.box2;

import generic.box.Apple;

public class BoxTest2 {
    public static void main(String[] args) {
        //generic
        Box<String> box = new Box<>();
        box.set("Happy new year!!");
        String message = box.get();
        System.out.println(message);

        //Integer형 자료
        Box<Integer> box2 = new Box<>();
        box2.set(400);
        Integer num = box2.get();
        System.out.println(num);

        //Apple 클래스 참조
        Box<Apple> box3 = new Box<>();
        box3.set(new Apple());
        Apple apple = box3.get();
        System.out.println(apple);
    }
}
