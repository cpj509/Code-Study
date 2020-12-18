package algorithm;

public class MaxTest {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 6, 7};
        int max = num[0];

        for (int i = 0; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            }

        }
        System.out.println(max);
    }
}
