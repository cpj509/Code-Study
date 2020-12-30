package multiinterface.customer;

public class CustomerTest {
    public static void main(String[] args) {
        Customer a = new Customer();
        a.buy();
        a.sell();
        a.order();

        Buy buyer = a;
        buyer.buy();
        buyer.order();

        Sell seller = a;
        seller.sell();
        seller.order();



    }
}