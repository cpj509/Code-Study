package template;

public class CarTest {
    public static void main(String[] args) {
        Car manualCar = new ManualCar();
        Car aiCar = new AICar();//부모 클래스 형으로 형변환

        manualCar.run();
        System.out.println();
        aiCar.run();
    }
}
