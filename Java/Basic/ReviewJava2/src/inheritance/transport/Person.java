package inheritance.transport;

public class Person {
    private String name;
    private int money;

    public Person(String name, int money) {
        this.name = name;
        this.money = money;
    }

    //사람이 차량을 이용
    public void takeVehicle(Vehicle vehicle, int fee){
        vehicle.carry(fee);
        this.money -= fee;
    }

    public void showInfo(){
        System.out.printf("%s의 남은 돈은 %,d원 입니다.\n", name, money);
    }
}
