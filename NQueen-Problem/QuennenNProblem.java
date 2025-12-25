public class QuennenNProblem {

    public static void main(String[] args) {

        // ❌ Tum 3x3 board use kar rahe the
        // N = 3 ka koi solution hota hi nahi
        // ✅ Isliye 4x4 use karo
        boolean[][] board = new boolean[4][4];

        recursionNqueen(board, 0);
    }

    public static void recursionNqueen(boolean[][] board, int row) {

        // ✅ Base condition correct thi tumhari
        if (row == board.length) {
            printBoard(board);
            System.out.println();
            return;
        }

        for (int col = 0; col < board.length; col++) {

            if (isSafe(board, row, col)) {

                board[row][col] = true;

                // ✅ Recursive call sahi tha
                recursionNqueen(board, row + 1);

                // ✅ Backtracking sahi tha
                board[row][col] = false;
            }
        }
    }

    public static boolean isSafe(boolean[][] board, int row, int col) {

        
        for (int i = 0; i < row; i++) {
            if (board[i][col]) {
                return false;
            }
        }

       
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j]) {
                return false;
            }
        }

        
        // ===============================
        // ✅ FIX: j < board.length
        for (int i = row, j = col; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j]) {
                return false;
            }
        }

        
        return true;
    }

    public static void printBoard(boolean[][] board) {

        
        for (boolean[] r : board) {
            for (boolean cell : r) {
                System.out.print(cell ? " Q " : " . ");
            }
            System.out.println();
        }
    }
}
