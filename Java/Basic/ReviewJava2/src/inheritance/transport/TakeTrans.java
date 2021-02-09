package inheritance.transport;

public class TakeTrans {
    public static void main(String[] args) {
        Person p1 = new Person("steve", 10000);

        Bus bus666 = new Bus("Bus666");
        Taxi taxi333 = new Taxi("Taxi333");

        //버스 타기

        p1.takeVehicle(bus666, 1300);
        p1.showInfo();
        bus666.showInfo();

        //택시 타기
        p1.takeVehicle(taxi333, 2000);
        p1.showInfo();
        taxi333.showInfo();


    }
}
