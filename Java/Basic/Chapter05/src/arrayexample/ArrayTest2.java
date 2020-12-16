package arrayexample;

public class ArrayTest2 {
    public static void main(String[] args) {
        int[] num = new int[]{10, 20, 30};
        System.out.printf("Array's length : %d\n", num.length);

        System.out.println(num[1]);
        System.out.println(num[2] + 100);

        for (int i = 0; i < num.length; i++) {
            System.out.println("num = " + num[i]);

        }
    }
}
