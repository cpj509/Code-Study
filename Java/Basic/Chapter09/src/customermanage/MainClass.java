package customermanage;

import java.util.ArrayList;

public class MainClass {
    public static void main(String[] args) {
        ArrayList<Customer> customerList = new ArrayList<>();
        customerList.add(new GoldCustomer(123, "asd"));
        customerList.add(new GoldCustomer(456, "qwe"));


        for (Customer a:
             customerList) {
            System.out.println(a.showInfo());
        }

    }
}
