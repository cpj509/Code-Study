package interfaceex.vehicle;

public class Driver {
    public void drive(Vehicle vehicle){//매개변수의 다형성
        vehicle.run();
    }
}
