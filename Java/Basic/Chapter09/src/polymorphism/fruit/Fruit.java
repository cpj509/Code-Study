package polymorphism.fruit;

public class Fruit {
    String name;    //과일 이름
    int price;      //과일 가격
    int freshness;  //신선도

    public void showInfo(){
        System.out.println("과일 이름: " + name);
        System.out.println("과일 가격: " + price);
        System.out.println("과일 신선도: " + freshness);
    }
}