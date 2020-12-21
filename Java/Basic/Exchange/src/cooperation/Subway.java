package cooperation;

public class Subway {
    String subwayNum;
    int passengerCount;
    int money;

    public Subway(String subwayNum){
        this.subwayNum = subwayNum;
    }

    public void take(int money){
        this.money += money;
        this.passengerCount++;
    }

    public void showInfo(){
        System.out.printf("%s 지하철의 승객수는 %d, 번 돈은 %d\n"
                , subwayNum, passengerCount, money);
    }
}
