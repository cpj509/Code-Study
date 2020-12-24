package template;

public class ManualCar extends Car{
    @Override
    public void drive() {
        System.out.println("사람이 주행 합니다.");

    }

    @Override
    public void stop() {
        System.out.println("브레이크로 정지 합니다.");

    }
}
