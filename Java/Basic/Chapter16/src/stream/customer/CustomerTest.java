package stream.customer;

import java.util.ArrayList;

public class CustomerTest {
    public static void main(String[] args) {
        ArrayList<Customer> customerList = new ArrayList<>();

        customerList.add(new Customer("King", 61, 1000000));
        customerList.add(new Customer("James", 31, 100000));
        customerList.add(new Customer("Michael", 17, 50000));


        System.out.println("===Print customer list===");
//        customerList.stream().map(c -> c.getName())
//                .forEach(s -> System.out.println(s));
        customerList.stream()
                .map(Customer::getName)//map() - matching
                .forEach(System.out::println);

        int total = customerList.stream()
                .mapToInt(Customer::getPrice)//middle operator, mapToInt() - integer matching
                .sum();//final operator

        System.out.println();

        System.out.println("Total price is " + total);

        System.out.println();

        System.out.println("===Sorting customer list over 20 age===");
        customerList.stream()
                .filter(c -> c.getAge() > 20)//filtering over 20 age
                .map(Customer::getName)//get name(filtered)
                .sorted()//sorting name
                .forEach(System.out::println);//print




    }
}
