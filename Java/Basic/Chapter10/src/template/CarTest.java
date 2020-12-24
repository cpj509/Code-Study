package template;

public class CarTest {
    public static void main(String[] args) {
        Car manualCar = new ManualCar();
        Car aiCar = new AICar();

        manualCar.run();
        System.out.println();
        aiCar.run();
    }
}
