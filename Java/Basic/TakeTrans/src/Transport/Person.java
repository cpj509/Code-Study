package Transport;

public class Person {
    private String name;
    private int money;

    public Person(String name, int money) {
        this.name = name;
        this.money = money;
    }

    //사람이 교통수단을 이용하기
    public void take(Vehicle vehicle, int fee){
        vehicle.carry(fee);
        this.money -= fee;
    }

    public void showInfo(){
        System.out.printf("%s의 남은 돈은 %d원 입니다.\n", name, money);
    }
}
