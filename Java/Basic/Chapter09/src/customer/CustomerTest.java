package customer;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customerLee = new Customer();
        customerLee.setCustomerName("이순신");

        int price = 10000;
        customerLee.calcPrice(price);
        System.out.printf("구매가격: %,d원\n", price);
        System.out.println(customerLee.showInfo());
    }
}
