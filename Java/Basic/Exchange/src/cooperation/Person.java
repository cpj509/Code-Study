package cooperation;

public class Person {
    String name;
    int age;
    int money;

    public Person(String name, int money){
        this.name = name;
        this.money = money;
    }
    public void takeSubway(Subway subway){
        subway.take(1200);
        this.money -= 1200;
    }

    public void takeBus(Bus bus){
        bus.take(1000);
        this.money -= 1000;

    }
    public void showInfo(){
        System.out.printf("%s 의 잔액 : %d\n", name, money);
    }
}
