package inheritance.car;

public class Taxi extends Car {
    int passenger;
    Taxi(String brand, int cc, int passenger){
        super(brand, cc);
        this.passenger = passenger;
    }
    public void showInfo(){
        System.out.println("차종 : " + brand + ", 배기량 : " + cc + ", 승객수 : "
         + passenger);
    }

}
