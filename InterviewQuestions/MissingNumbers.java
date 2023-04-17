import java.util.ArrayList;
// Google Question
//

public class MissingNumbers {
    public static void main(String[] args) {
        int[] nums = {3,1,3,4,2};
        System.out.println(findDisappearedNumbers(nums));
    }

     static ArrayList<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0 ;
        while (i<nums.length){
            int correctIndex = nums[i]-1;
            if(nums[correctIndex] != nums[i]){
                swap(nums, i, correctIndex);
            }else {
                i++;
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
         for (int j = 0; j < nums.length; j++) {
             if (j!=nums[j]-1){
                 list.add(j+1) ;
             }
         }
        return list;
    }
    static void swap(int[] nums ,int start, int end){
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
}
