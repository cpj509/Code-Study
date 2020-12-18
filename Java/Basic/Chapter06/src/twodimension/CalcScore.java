package twodimension;

public class CalcScore {
    public static void main(String[] args) {
        int[][] score = {
                {91, 70},
                {80,50},
                {76,60},
                {90,49},
                {80,81}
        };
        int[] total = {0, 0};
        double[] avg = {0.0, 0.0};
        for (int[] ints : score) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
        for (int[] ints : score) {
            total[0] += ints[0];
            total[1] += ints[1];
        }
        System.out.println("0's sum : " + total[0]);
        System.out.println("1's sum : " + total[1]);
        avg[0]=(double)total[0] / score.length;
        avg[1]=(double)total[1] / score.length;
        System.out.println("0's avg : " + avg[0]);
        System.out.println("1's avg : " + avg[1]);
    }
}
