package singleton;

public class Car {
    private static int serialNum = 1000;
    private int carNum;

    public Car() {
        carNum = ++serialNum;;
    }

    public int getCarNum() {
        return carNum;
    }
}
