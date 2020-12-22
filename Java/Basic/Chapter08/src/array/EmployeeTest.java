package array;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] emp = new Employee[5];

        //배열에 객체를 저장
        for (int i = 0; i < emp.length; i++) {
            emp[i] = new Employee(i+10, "emp" + i);
        }
        for (Employee employee : emp) {
            employee.showInfo();
        }
        //주소값 출력
        for (Employee employee : emp) {
            System.out.println(employee);
        }
    }
}
