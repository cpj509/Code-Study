package array;

public class Employee {
    int companyId;
    String name;

    public Employee(int companyId, String name){
        this.companyId = companyId;
        this.name = name;
    }
    public void showInfo(){
        System.out.println("ID : " + companyId + ", Name : " + name);
    }
}
