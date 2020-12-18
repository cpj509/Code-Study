package twodimension;

public class TwoDimension {
    public static void main(String[] args) {
        int[][] arr = new int[2][3];
        System.out.printf("Matrix's length(row): %d\n", arr.length);
        System.out.printf("Matrix's length(column): %d\n", arr[0].length);
        int num = 1;

        for (int[] ints : arr) {
            for (int j = 0; j < arr[0].length; j++) {
                ints[j] = num++;
                System.out.print(ints[j]);
            }
            System.out.println();
        }

    }

}
