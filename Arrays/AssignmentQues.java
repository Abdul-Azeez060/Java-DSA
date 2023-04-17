import java.util.Arrays;
public class AssignmentQues {
    public static void main(String[] args) {
        int[][] arr = {
                {4, 7, 8},
                {8, 8, 7}
        };
        int key = 7;
        System.out.println(countKey(arr, key));
        int[][] nums = {
                {1, 4, 9},
                {11, 4, 3},
                {2, 2, 3}
        };
        int row = 2;
        System.out.println(rowSum(nums, row));

        int[][] matrix = transposeMatrix(arr);
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }



    }

     static int[][] transposeMatrix(int[][] arr) {
        int[][] nums = new int[arr[0].length][arr.length];
         for (int i = 0; i < nums.length; i++) {
             for (int j = 0; j < nums[i].length; j++) {
                 nums[i][j] = arr[j][i];
             }
         }
         return nums;

    }

    static int rowSum(int[][] nums, int row) {
        int sum = 0;
        for (int j = 0; j < nums[row-1].length; j++) {
            sum+=nums[row-1][j];
        }
        return sum;
    }

    // O(n^2)
     static int countKey(int[][] arr, int key) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]==key){
                    count++;
                }
            }
        }
        return count;
    }
}
