public class Trappedwater {
    public static void main(String[] args) {
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(trappedWater(height));
    }

     static int trappedWater(int[] height) {
        // auxiliary array
        int[] leftMax = new int[height.length];
        int[] rightMax = new int[height.length];
        // leftMax array
        leftMax[0] = height[0];
        for (int i = 1; i < leftMax.length; i++) {
            leftMax[i] = Math.max(leftMax[i-1],height[i] );
        }
        // rightMax array
        rightMax[height.length-1] = height[height.length-1];
        for (int i = height.length-2; i>=0 ; i--) {
            rightMax[i] = Math.max(rightMax[i+1],height[i] );
        }
        // loop
         int waterTrapped = 0 ;
        for (int i = 0; i < height.length; i++) {
            //water-level = min of leftMax,rightMax
            int waterLevel = Math.min(leftMax[i],rightMax[i] );
            // trappedWater = water-level - height

             waterTrapped+= waterLevel - height[i];
        }
        return waterTrapped;

    }
}
