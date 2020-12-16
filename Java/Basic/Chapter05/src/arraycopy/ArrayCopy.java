package arraycopy;

public class ArrayCopy {
    public static void main(String[] args) {
        int[] array1 = {10, 20, 30, 40, 50};
        int[] array2 = new int[5];

        for (int i = 0; i < array1.length; i++) {
            array2[i] = array1[i];
        }
        for (int num :
                array2) {
            System.out.println(num);
        }
    }
}
