public class DiagonalSum {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 1, 1},
                {1, 1, 1},
                {1, 1, 1},

        };
        System.out.println(diagonalSum(matrix));
    }

     static int diagonalSum(int[][] matrix) {
        int sum = 0;
        int sum2 = 0;
        // O(n^2)
         for (int row = 0; row < matrix.length; row++) {
             for (int col = 0; col < matrix[row].length; col++) {
                 if (row==col || row+col==matrix.length-1){
                     sum+=matrix[row][col];
                 }
             }
         }
         //O(n)
         for (int i = 0; i < matrix.length; i++) {
             // primary diagonal
             sum2+=matrix[i][i];
             // secondary diagonal
             if (i!=matrix.length-i-1) {
                 sum2+=matrix[i][matrix.length-i-1];
             }
         }

        return sum2;
    }

}
