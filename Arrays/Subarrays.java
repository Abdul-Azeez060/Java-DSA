public class Subarrays { // O(n^3) is the time complexity
    public static void main(String[] args) {
        int[] nums = {2, 4, 6, 8, 10};
        subarrays(nums);
        System.out.println("max subarray sum is "+ maxsubarray(nums));
    }

     static int maxsubarray(int[] nums) {
        int ms = Integer.MIN_VALUE;
         for (int i = 0; i < nums.length; i++) {
             for (int j = i; j < nums.length ; j++) {
                 int cs = 0;
                 for (int k = i; k <=j ; k++) {
                     cs = cs + nums[k];
                 }
                 ms = Math.max(cs,ms);
             }
         }return ms;

    }

    static void subarrays(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length ; j++) {
                for (int k = i; k <=j ; k++) {
                    System.out.print(nums[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
