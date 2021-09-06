package Sum_Matrix;

public class Solution {
    public static void main(String[] args) {


        int[][] arr1 = {{1, 2}, {2, 3}};
        int[][] arr2 = {{2, 3}, {3, 4}};

        int[][] answer = new int[arr1.length][arr1.length];
        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr1.length; j++){
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        System.out.println(arr1[0].length);



    }
}
