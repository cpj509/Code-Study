package polymorphism.fruit;

import java.util.Scanner;

public class FruitTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Apple | 2.  Banana | 3. Tomato");
        System.out.print("Select num > ");
        int num = sc.nextInt();
        Fruit fruit;

        switch (num){
            case 1:
                fruit = new Apple();
                fruit.showInfo();
                break;
            case 2:
                fruit = new Banana();
                fruit.showInfo();
                break;
            case 3:
                fruit = new Tomato();
                fruit.showInfo();
                break;
            default:
                System.out.println("Select valid number.");
        }
        sc.close();
    }
}
