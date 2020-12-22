package singleton;

public class Company {
    private static Company instance;

    private Company() {};//생성자를 1개만 생성(private)

    //instance에 접근하기 위한 get() method 구현
    public static Company getInstance(){
        if(instance==null){
            instance = new Company();
        }
        return instance;
    }
}
