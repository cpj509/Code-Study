package singleton;

public class Employee {
    public static int serialNum = 1000;
    private int employeeNum;

    public Employee() {
        employeeNum = ++serialNum;
    }

    public int getEmployeeNum() {
        return employeeNum;
    }
}