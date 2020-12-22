package singleton;

public class CarFactoryTest {
    public static void main(String[] args) {
        CarFactory factory = CarFactory.getInstance();
        Car mySonata = factory.createCar();
        System.out.println(mySonata.getCarNum());

        Car yourSonata = factory.createCar();
        System.out.println(yourSonata.getCarNum());
    }
}
