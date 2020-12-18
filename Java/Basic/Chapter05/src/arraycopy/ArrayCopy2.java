package arraycopy;

public class ArrayCopy2 {
    public static void main(String[] args) {
        int[] array1 = {10, 20, 30, 40, 50};
        int[] array2 = array1.clone();
        int[] array3 = new int[5];
        for (int num :
                array2) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.arraycopy(array1, 0, array3, 0, array3.length);
        for (int num :
                array3) {
            System.out.print(num + " ");
        }
    }
}
