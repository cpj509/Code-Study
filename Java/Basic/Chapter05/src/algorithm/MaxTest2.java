package algorithm;

public class MaxTest2 {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 65, 7};
        int maxIndex = 0;

        for (int i = 0; i < num.length; i++) {
            if (num[i] > num[maxIndex]) {
                maxIndex = i;
            }

        }
        System.out.println("max index = " + maxIndex);
        System.out.println(num[maxIndex]);
    }
}
