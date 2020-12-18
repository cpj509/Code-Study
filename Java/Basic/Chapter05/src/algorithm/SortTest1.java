package algorithm;

public class SortTest1 {
    public static void main(String[] args) {
        //  오름차순 정렬 - Bubble Sort
        int[] arr = {7, 4, 91, 8, 45, 27};
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int num :
                    arr) {
                System.out.print(num + " ");

            }
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.println();
        }
//        for (int num :
//                arr) {
//            System.out.print(num + " ");
//
//        }
    }
}
