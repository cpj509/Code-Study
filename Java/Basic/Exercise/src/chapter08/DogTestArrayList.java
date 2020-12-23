package chapter08;

import java.util.ArrayList;

public class DogTestArrayList {
    public static void main(String[] args) {
        ArrayList<Dog> dogs = new ArrayList<>();
        Dog dog1 = new Dog("gold", "1");
        Dog dog2 = new Dog("silver", "2");

        dogs.add(dog1);
        dogs.add(dog2);
        dogs.add(new Dog("red", "3"));
        dogs.add(new Dog("green", "4"));

        for (Dog a:
             dogs) {
            a.showInfo();
        }


    }
}
