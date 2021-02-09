package inheritance;

class Car{
    String brand;
    int cc; //배기량

    public Car(String brand, int cc) {
        this.brand = brand;
        this.cc = cc;
    }
}

class Taxi extends Car{
    int passenger;
    public Taxi(String brand, int cc, int passenger) {
        super(brand, cc);
        this.passenger = passenger;
    }

    void showInfo(){
        System.out.println("차종 : " + brand + ", 배기량 : " + cc + "cc, 승객수 : " + passenger + "명 입니다.");
    }
}

public class TaxiTest {
    public static void main(String[] args) {
        Taxi a = new Taxi("Sonata", 3000, 100);

        a.showInfo();


    }
}
