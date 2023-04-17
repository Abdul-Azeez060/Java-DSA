public class Kandanes { // O(n) is the time complexity
    public static void main(String[] args) {
        int[] nums = {-2, -4, -6, -8, -10, -4, -6, -34};
        System.out.println("max subarray sum is "+ kandans(nums));
    }

    static int kandans(int[] nums) {
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            cs+=nums[i];
            ms = Math.max(ms,cs);
            if (cs < 0) {
                cs = 0;
            }
        }
        return ms;
    }

}


