package staticsample;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("asd");
        System.out.println(Employee.getSerialNum());
        System.out.println(employee.companyID);
        System.out.println(employee.getName());

        Employee employee2 = new Employee();
        employee2.setName("qwe");
        System.out.println(Employee.getSerialNum());
        System.out.println(employee2.companyID);
        System.out.println(employee2.getName());
    }
}
