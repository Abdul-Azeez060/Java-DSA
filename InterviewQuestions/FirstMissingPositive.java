// https://leetcode.com/problems/first-missing-positive/
// Amazon question
public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] nums = {2, 3, 1, -1};
        System.out.println(findMissing(nums));
    }
    static int findMissing(int[] nums){
    int i = 0 ;
        while (i<nums.length){
        int correctIndex = nums[i]-1;
        if (nums[i]<nums.length && nums[i]>0 && nums[i]!=nums[correctIndex]){
            swap(nums, i, correctIndex);
        }else{
            i++;
        }
    }
        for (int j=0;j<nums.length;j++){
        if (j!=nums[j]-1){
            return j+1;
        }
    }
        return nums.length+1;
}
    static void swap(int[] nums, int start, int end){
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
}
