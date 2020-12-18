package arrayexample;

public class ArrayExample {
    public static void main(String[] args) {
        int[] a = new int[5];

        for (int i = 1; i <= 10; i++) {
            if ((i & 1) == 0) {
                a[(i / 2) - 1] = i;

            }
        }
        int sum = 0;
        for (int b :
                a) {
            sum += b;

        }
        System.out.println(sum);

    }
}
