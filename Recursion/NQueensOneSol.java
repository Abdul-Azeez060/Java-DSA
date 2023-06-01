
public class NQueensOneSol {
    public static void main(String[] args) {
        int n = 3;
        char [][] board = new char[n][n];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = 'x';
            }
        }
        printBoard(board);
    }

    public static boolean nQueens(char[][] board, int row) {
        // base condition
        if (row == board.length) {
            return true;
        }

        // coloum loop
        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 'Q';
                if (nQueens(board, row+1)){
                    // recursive condition
                    return true;
                }
                board[row][col] = 'x'; // backtracking step
            }
        }
        return false;
    }

    public static boolean isSafe(char[][] board, int row, int col) {
        // vertical
        for (int i = row-1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        //up left diagonal
        for (int i = row-1,j = col-1; i >= 0 && j >= 0 ; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // up right diagonal
        for (int i = row-1,j = col+1; i >= 0 && j < board.length ; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;

    }

    public static void printBoard(char[][] board) {
        if ( nQueens(board, 0)) {
            System.out.println("solution is possible");
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board.length; j++) {
                    System.out.print(board[i][j]+ " ");
                }
                System.out.println();
            }
        }
        else {
            System.out.println("solution is not possible");
        }

    }
}
