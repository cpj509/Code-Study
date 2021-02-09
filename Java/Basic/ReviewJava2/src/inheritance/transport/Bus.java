package inheritance.transport;

public class Bus extends Vehicle{
    public Bus(String vehicleName) {
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
