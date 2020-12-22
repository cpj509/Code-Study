package singleton;

public class CompanyTest {
    public static void main(String[] args) {
        //유일한지 테스트
        Company co1 = Company.getInstance();
        Company co2 = Company.getInstance();
        System.out.println(co1==co2);//이름만 다르지 같음
        System.out.println(co1);
        System.out.println(co2);
    }
}
