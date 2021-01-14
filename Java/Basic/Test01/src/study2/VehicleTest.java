package study2;

public class VehicleTest {
    public static void main(String[] args) {
        Student a = new Student("a", 10000);
        Vehicle bus = new Bus();
        Vehicle subway = new Subway();
        Vehicle taxi = new Taxi();
        a.showInfo();
        a.take(bus);
        a.showInfo();
        a.take(subway);
        a.showInfo();
        a.take(taxi);
        a.showInfo();
        bus.showInfo();
        subway.showInfo();
        taxi.showInfo();
    }
}
