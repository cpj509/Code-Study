package cooperation;

public class MainClass {
    public static void main(String[] args) {
        Person lee = new Person("lee", 10000);
        Bus bus100 = new Bus(100);
        Subway subway2 = new Subway("Line 2");

        bus100.showInfo();
        lee.showInfo();

        lee.takeBus(bus100);

        bus100.showInfo();
        lee.showInfo();
        System.out.println("-------------------");
        subway2.showInfo();
        lee.showInfo();

        lee.takeSubway(subway2);

        subway2.showInfo();
        lee.showInfo();
    }
}
