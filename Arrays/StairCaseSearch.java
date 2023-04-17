import java.util.Arrays;
public class StairCaseSearch {
    // sorted both row and col this is staircase search
    // O(n+m)
    // if n>>>m the O(n)  else O(m) is the time complexity
    public static void main(String[] args) {
        int[][] arr = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 50}
        };
        int key = 33;
        System.out.println(stairCaseSearch(arr, key));
        System.out.println( stairCaseSearchKey(arr, key));
    }

    static boolean stairCaseSearch(int[][] matrix, int key) {
       int row = 0;
       int col = matrix[0].length-1;
       while (row<matrix.length && col>=0){
           if (matrix[row][col]==key) {
               System.out.println("("+ row+","+col+")");
               return true;
           }else if(matrix[row][col]>key){
               col--;
           }else {
               row++;
           }
       }
        System.out.println("key not found");
       return false;
    }
    static boolean stairCaseSearchKey(int[][] matrix, int key){
        int row = matrix.length-1;
        int col = 0;
        while (row>=0 && col< matrix.length){
            if (matrix[row][col]==key){
                System.out.println("("+ row+","+col+")");
                return true;
            } else if (matrix[row][col]>key) {
                    row--;
            }else {
                col++;
            }
        }
        System.out.println("key not found");
        return false;
    }
}
