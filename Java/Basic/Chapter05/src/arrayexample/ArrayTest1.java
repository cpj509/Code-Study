package arrayexample;

public class ArrayTest1 {
    public static void main(String[] args) {
        int[] num = new int[3];
        System.out.printf("Array's length : %d\n", num.length);
        num[0] = 10;
        num[1] = 20;
        num[2] = 30;

        System.out.println(num[0]);
        System.out.println(num[1]);
        System.out.println(num[2]);

        for (int i = 0; i < 3; i++) {
            System.out.println(num[i]);

        }


    }
}
