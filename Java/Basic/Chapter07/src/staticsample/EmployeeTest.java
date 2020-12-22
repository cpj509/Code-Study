package staticsample;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("asd");
        System.out.println(Employee.getSerialNum());
        System.out.println(employee.companyID);
        System.out.println(employee.getName());
    }
}
