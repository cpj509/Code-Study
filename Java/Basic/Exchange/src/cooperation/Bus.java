package cooperation;

public class Bus {
    int busNumber;
    int passengerCount;
    int money;

    public Bus(int busNumber){
        this.busNumber = busNumber;
    }

    public void take(int money){
        this.money += money;
        this.passengerCount++;
    }

    public void showInfo(){
        System.out.printf("%d 버스의 승객수는 %d, 수입은 %d\n"
                , busNumber, passengerCount, money);
    }
}
