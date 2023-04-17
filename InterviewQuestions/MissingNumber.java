// Amazon question
//https://leetcode.com/problems/missing-number/
public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {4, 1, 0, 2};
        System.out.println(missingNumber(nums));
    }
    static int missingNumber(int[] nums){
        int n = nums.length;
        int i = 0 ;
        while (i<n){
             if( nums[i]<n && nums[i] != nums[nums[i]]){
                swap(nums,i,nums[i]);
            }else{
                i++;
            }
        }
        for (int j = 0; j < n; j++) {
            if(nums[j]!=j){
                return j;
            }
        }
        return n;

    }
    static void swap(int[] arr, int i , int end){
        int temp =  arr[i];
        arr[i] = arr[end];
        arr[end] = temp;
    }
}
/*     public int missingNumber(int[] nums) {
        	int sum = 0;
	        int length = nums.length;
	        for(int i = 0; i < length; i++){
		        sum += nums[i];
            }
            return length * (length + 1) / 2 - sum;
    }
* */
