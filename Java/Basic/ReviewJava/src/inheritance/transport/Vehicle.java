package inheritance.transport;

public class Vehicle {
    private String vehicleName;
    private int money;
    private int passengerCount;

    public Vehicle(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    //승객을 태우는 메서드
    public void carry(int money){
        this.money = money;
        passengerCount++;
    }

    public void showInfo(){
        System.out.printf("%s의 수입은 %,d원 이고, 승객수는 %d명 입니다.\n",
                vehicleName, money, passengerCount);
    }
}