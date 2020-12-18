package arraycopy;

public class ArrayReverse {
    public static void main(String[] args) {
        char[] arr1 = {'N', 'E', 'T'};
        char[] arr2 = new char[3];


        for (char c : arr1) {
            System.out.print(c + " ");

        }
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }
        System.out.println();
        for (char c :
                arr2) {
            System.out.print(c + " ");
        }
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = arr2[arr1.length - 1 - i];

        }

        System.out.println();
        for (char c :
                arr1) {
            System.out.print(c + " ");
        }

    }
}
