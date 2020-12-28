package interfaceex.vehicle;

public class VehicleTest {
    public static void main(String[] args) {
        Driver driver = new Driver();
        Bus bus = new Bus();
        Taxi taxi = new Taxi();

        driver.drive(bus);
        driver.drive(taxi);


        //매개변수로 객체를 전달
//        driver.drive(new Bus());
//        driver.drive(new Taxi());
    }
}
