// https://leetcode.com/problems/search-a-2d-matrix/
// time complixity is outer loop n times(row) for every row logm so nlog(m)
public class SearchIN2D {
    public static void main(String[] args) {
        int[][] matrix ={{1, 3, 5, 7},
                        {10, 11, 16, 20},
                        {23, 30, 34, 60}};
        int target = 11;
        System.out.println(searchMatrix(matrix, target));

    }
    static boolean searchMatrix(int[][] matrix, int target) {
        // loop for every row and binary searching every array
        for (int row = 0; row < matrix.length; row++) {
            // binary search
            int start = 0;
            int end = matrix[row].length-1;
            int mid = start+end/2;
            while (start<=end) {
                if (matrix[row][mid] == target) {
                    return true;
                }
                else if ( target>matrix[row][mid]){
                    start = mid+1;
                }
                else {
                    end = mid-1;
                }
                mid = start+end/2;
            }

        }
        return false;
    }

}
