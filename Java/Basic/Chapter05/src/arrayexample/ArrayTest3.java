package arrayexample;

public class ArrayTest3 {
    public static void main(String[] args) {
        int[] arr = {90, 75, 80, 100};
        int i;
        int sum = 0;
        double avg = 0.0;

        for (i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
        avg = (double) sum / arr.length;
        System.out.println(avg);
    }
}
