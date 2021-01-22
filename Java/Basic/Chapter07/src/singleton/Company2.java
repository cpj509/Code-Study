package singleton;

public class Company2 {
    private static Company2 instance;

    private Company2() {
    }

    public static Company2 getInstance(){
        if(instance==null){
            instance = new Company2();
        }
        return instance;
    }
    public Employee createEmployee(){
        return new Employee();
    }
}
