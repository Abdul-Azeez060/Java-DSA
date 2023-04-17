import java.util.Arrays;
// the larger element goes at the end by comparing with the adjacent element(swaping)
// O(n^2) is time complexity

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 5, 4};
        bubbleSort(nums);
        System.out.println(Arrays.toString(nums));
    }

     static void bubbleSort(int[] nums) {
         for (int turn = 0; turn < nums.length; turn++) {
             int swap = 0;
             for (int i = 0; i < nums.length-1-turn ; i++) {
                 if (nums[i]>nums[i+1]){
                     int temp = nums[i];
                     nums[i] = nums[i+1];
                     nums[i+1] = temp;
                     swap++;

                 }
             }
             if (swap == 0) {
                 break;
             }

         }
    }
}
