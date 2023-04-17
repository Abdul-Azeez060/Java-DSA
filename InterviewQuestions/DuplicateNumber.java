import java.util.ArrayList;
import java.util.Arrays;

public class DuplicateNumber {
    public static void main(String[] args) {
        int[] nums = {3,1,3,4,2};
        System.out.println(Arrays.toString(findRepeatedNumbers(nums)));
    }

    static int[] findRepeatedNumbers(int[] nums) {
        int i = 0 ;
        while (i<nums.length){
            int correctIndex = nums[i]-1;
            if(nums[correctIndex] != nums[i]){
                swap(nums, i, correctIndex);
            }else {
                i++;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if(nums[j]-1!=j){
                return  new int[] {nums[j],j+1};
            }
        }
            return new int[]{0,0};
    }
    static void swap(int[] nums ,int start, int end){
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
}
