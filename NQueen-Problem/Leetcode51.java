import java.util.ArrayList;
import java.util.List;

// LeetCode 51 - N Queens
public class LeetCode51 {

    List<List<String>> solutions = new ArrayList<>();

    public List<List<String>> solveNQueens(int n) {

        boolean[][] board = new boolean[n][n]; // n x n board
        recursionNqueen(board, 0);
        return solutions;
    }

    // ================= RECURSION =================
    public void recursionNqueen(boolean[][] board, int row) {

        // 🛑 Base condition
        if (row == board.length) {
            storeSolution(board);
            return;
        }

        // Try each column
        for (int col = 0; col < board.length; col++) {

            if (isSafe(board, row, col)) {

                board[row][col] = true; // place queen
                recursionNqueen(board, row + 1);
                board[row][col] = false; // backtrack
            }
        }
    }

    // ================= SAFETY CHECK =================
    public boolean isSafe(boolean[][] board, int row, int col) {

        // same column
        for (int i = 0; i < row; i++) {
            if (board[i][col]) return false;
        }

        // left diagonal
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j]) return false;
        }

        // right diagonal
        for (int i = row, j = col; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j]) return false;
        }

        return true;
    }

    // ================= STORE SOLUTION =================
    public void storeSolution(boolean[][] board) {

        List<String> current = new ArrayList<>();

        for (boolean[] row : board) {

            StringBuilder sb = new StringBuilder();

            for (boolean cell : row) {
                sb.append(cell ? 'Q' : '.');
            }

            current.add(sb.toString());
        }

        solutions.add(current);
    }

    // ================= MAIN METHOD (FOR VS CODE) =================
    public static void main(String[] args) {

        LeetCode51 solver = new LeetCode51();

        int n = 4;
        List<List<String>> result = solver.solveNQueens(n);

        System.out.println("Total Solutions: " + result.size());
        System.out.println();

        for (List<String> board : result) {
            for (String row : board) {
                System.out.println(row);
            }
            System.out.println();
        }
    }
}
