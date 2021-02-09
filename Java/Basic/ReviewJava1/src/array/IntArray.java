package array;

public class IntArray {
    public static void main(String[] args) {
        int[] nums = new int[4];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = i + 3;
        }
        for (int num:
             nums) {
            System.out.println(num);
        }
    }
}
