package study2;

public class Vehicle {
    String vehicleName;//탈 것 이름
    int passengerCount;//승객수
    int money;//수입

    public void carry(int money){
        this.money += money;
        this.passengerCount++;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void showInfo(){
        System.out.println(vehicleName + "의 승객은 " + passengerCount + "명이고, 수입은 "
                + money + "원 입니다.");
    }
}