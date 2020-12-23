package customer;

public class CustomerTest2 {
    public static void main(String[] args) {
        VIPCustomer customerShin = new VIPCustomer();
        customerShin.setCustomerName("신사임당");
        customerShin.setAgentID(12345);

        int price = 10000;
        int shinPrice = customerShin.calcPrice(price);
        System.out.println("구매 가격 : " + shinPrice);
        System.out.println(customerShin.showInfo());
    }

}
