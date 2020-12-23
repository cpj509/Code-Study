package customer;

public class CustomerTest3 {
    public static void main(String[] args) {
        Customer customerKim = new Customer(101, "Kim");
        int price = 10000;
        int kimPrice = customerKim.calcPrice(price);
        System.out.println("구매가격: " + kimPrice);
        System.out.println(customerKim.showInfo());

//        VIPCustomer customerChoi = new VIPCustomer(101, "Choi", 256);
        Customer customerChoi = new VIPCustomer(101, "Choi", 256);
        int choiPrice = customerChoi.calcPrice(price);
        System.out.println("구매가격: " + choiPrice);
        System.out.println(customerChoi.showInfo());

    }
}
