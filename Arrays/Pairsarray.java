import java.util.Arrays;
 public class Pairsarray {
    public static void main(String[] args) {
        int[] nums = {2, 4, 6, 8, 10};
        getPairs(nums);
    }

     static void getPairs(int[] nums) {
        int[] arr = new int[2];
         for (int i = 0; i < nums.length; i++) {
             for (int j = i+1; j < nums.length; j++) {
                 arr[0]=nums[i];
                 arr[1]=nums[j];
                 System.out.print(Arrays.toString(arr));
             }
             System.out.println();
         }
    }
}