package template;

public abstract class Car {
    public abstract void drive();
    public abstract void stop();

    public void startCar(){
        System.out.println("시동을 켭니다.");
    }

    public void turnOff(){
        System.out.println("시등을 끕니다.");
    }
    //define template method
    public final void run(){
        startCar();
        drive();
        stop();
        turnOff();
    }
}