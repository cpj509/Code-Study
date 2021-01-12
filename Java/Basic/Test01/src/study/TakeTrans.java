package study;

public class TakeTrans {
    public static void main(String[] args) {
        Student a = new Student("a", 5000);
        Student b = new Student("b", 7000);
        Student c = new Student("c", 9000);

        Bus bus100 = new Bus(100);
        a.takeBus(bus100);
        a.showInfo();
        bus100.showInfo();

        Subway subway100 = new Subway(100);
        b.takeSubway(subway100);
        b.showInfo();
        subway100.showInfo();

        Taxi taxi100 = new Taxi(100);
        c.takeTaxi(taxi100);
        c.showInfo();
        taxi100.showInfo();
    }
}
