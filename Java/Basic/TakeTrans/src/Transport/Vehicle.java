package Transport;

public class Vehicle {
    protected String vehicleName;
    protected int passengerCount;
    protected int money;

    public Vehicle(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    //사람을 태우고 승객이 증가하고 수입이 증가함
    public void carry(int money){
        this.money += money;
        passengerCount++;
    }
    public void showInfo(){
        System.out.printf("%s의 수입은 %,d원 이고, 승객수는 %d명 입니다.\n",
                vehicleName, money, passengerCount);
    }
}
