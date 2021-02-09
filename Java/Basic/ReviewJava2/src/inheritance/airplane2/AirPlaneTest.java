package inheritance.airplane2;

public class AirPlaneTest {
    public static void main(String[] args) {
        SuperSonicAirPlane sa = new SuperSonicAirPlane();

        sa.takeOff();
        sa.fly();
        sa.flyMode = Define.SUPERSONIC;
        sa.fly();
        sa.land();
    }
}
