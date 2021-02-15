package inheritance.transport;

public class Taxi extends Vehicle{
    public Taxi(String vehicleName) {
        super(vehicleName);
    }

    @Override
    public void carry(int money) {
        super.carry(money);
    }

    @Override
    public void showInfo() {
        super.showInfo();
    }
}
