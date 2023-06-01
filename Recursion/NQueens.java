// Time complexity is O(n!)

public class NQueens {
    public static void main(String[] args) {
        int n = 4;
        char [][] board = new char[n][n];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = 'x';
            }
        }
        nQueens(board, 0);
    }

    public static void nQueens(char[][] board, int row) {
        // base condition
        if (row == board.length) {
            printBoard(board);
            System.out.println("--------chess-board--------");
            return;
        }

        // coloum loop
        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 'Q';
                nQueens(board, row+1); // recursive condition
                board[row][col] = 'x'; // backtracking step
            }
        }
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
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
