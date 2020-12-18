package method;

public class ArrayTest {
    public static int add(int[] score){
        int total = 0;
        for (int i = 0; i < score.length; i++) {
            total += score[i];
        }
        return total;
    }

    public static void main(String[] args) {
        int sum = add(new int[] {90, 80, 70});
        System.out.println(sum);
    }
}
