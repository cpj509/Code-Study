package singleton;

public class CarFactory {
    private static CarFactory instance;
//    static 있는 변수가 클래스 변수(정적변수)

    private CarFactory() {
    }

    public static CarFactory getInstance(){
        if(instance == null)
            instance = new CarFactory();
        return instance;
    }

    public Car createCar(){
        Car car = new Car();
        return car;
    }
}
