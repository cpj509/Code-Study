package method;

public class AddTest {
    public static int add(int n1, int n2){
        int result;
        result = n1 + n2;
        return  result;
    }

    public static void main(String[] args) {
        int sum = add(10, -20);
        System.out.println("Sum : " + sum);
    }
}
