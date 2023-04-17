public class RotatedBs {
    public static void main(String[] args) {
       int[] arr =  {4,5,6,7,0,1,2};
       int target = 0;
        System.out.println(search(arr, target));
    }


    public static int search(int[] nums, int target) {
        int index = 0;
        for (int i=0; i<nums.length-1; i++) {
            if (nums[i] > nums[i+1]) {
                index = i;
            }
        }
        int s = 0;
        int e = index;
        while (s<=e) {
            int m = s+ (e-s)/2;
            if (nums[m] == target) {
                return m;
            }
            if (nums[m] > target) {
                e = m-1;
            }
            else {
                s = m+1;
            }
        }
        s = index+1;
        e = nums.length-1;
        while (s<=e) {
            int m = s+ (e-s)/2;
            if (nums[m] == target) {
                return m;
            }
            if (nums[m] > target) {
                e = m-1;
            }
            else {
                s = m+1;
            }
        }
        return -1;


    }
}
