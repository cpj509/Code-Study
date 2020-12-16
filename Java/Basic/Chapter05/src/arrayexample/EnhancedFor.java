package arrayexample;

public class EnhancedFor {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 3, 4, 5};
        System.out.println(numbers[0]);
        System.out.println(numbers[3]);

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");

        }
        System.out.println();
        for (int num :
                numbers) {
            System.out.print(num + " ");
        }
    }
}
