package Transport;

public class Test {
    public static void main(String[] args) {
        Person a = new Person("a", 10000);
        Vehicle bus = new Bus("Bus");
        Vehicle subway = new Bus("Subway");
        Vehicle taxi = new Bus("Taxi");
        a.showInfo();
        bus.showInfo();
        subway.showInfo();
        taxi.showInfo();
        a.take(bus, 1000);
        a.take(subway, 1500);
        a.take(taxi, 2000);
        a.showInfo();
        bus.showInfo();
        subway.showInfo();
        taxi.showInfo();
    }
}
