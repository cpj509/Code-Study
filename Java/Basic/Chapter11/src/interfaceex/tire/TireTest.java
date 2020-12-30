package interfaceex.tire;

public class TireTest {
    public static void main(String[] args) {
        Car a = new Car();
        a.run();

        System.out.println("=====================");

        a.frontLeftTire = new KumTire();
        a.frontRightTire = new KumTire();

        a.run();

        System.out.println("=====================");

        Car2 b = new Car2();
        b.run();

        System.out.println("=====================");

        b.tires[0] = new KumTire();
        b.tires[1] = new KumTire();

        b.run();
    }
}