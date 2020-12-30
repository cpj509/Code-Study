package multiinterface.customer;

public class Customer implements Buy, Sell{
    @Override
    public void buy() {
        System.out.println("팝니다.");
    }

    @Override
    public void sell() {
        System.out.println("삽니다.");
    }

    @Override
    public void order() {
        System.out.println("주문.");
    }
}
