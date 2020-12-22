package staticsample;

public class Employee {
    private static int serialNum = 1000;
    int companyID;
    String name;

    public Employee(){
        serialNum++;
        companyID = serialNum;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static int getSerialNum() {
        return serialNum;
    }

    public static void setSerialNum(int serialNum) {
        Employee.serialNum = serialNum;
    }
}
