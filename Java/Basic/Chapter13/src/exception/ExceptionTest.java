package exception;

public class ExceptionTest {
    public static void main(String[] args) {
        int[] arr = new int[2];

        try {
            arr[0] = 10;
            arr[1] = 20;
            arr[2] = 30;

            System.out.println("Save number 10, 20, 30");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
