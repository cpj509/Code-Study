package singleton;

public class Company2Test {
    public static void main(String[] args) {
        Company2 com1 = Company2.getInstance();
        Employee a = com1.createEmployee();
        Employee b = com1.createEmployee();
        Employee c = com1.createEmployee();

        System.out.println(a.getEmployeeNum());
        System.out.println(b.getEmployeeNum());
        System.out.println(c.getEmployeeNum());

    }
}
