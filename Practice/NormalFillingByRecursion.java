public class NormalFillingByRecursion {
    public static void main(String[] args) {
        boolean[][] board={
            {false,false,false},
            {false,false,false},
            {false,false,false}
        };
        recursion(board, 0);
    }
    public static void recursion(boolean[][] board,int row)
    {
        if (row==board.length) {
            for (boolean[] bs : board) {
                for (boolean value : bs) {
                    System.out.print(value+" ");
                }
                System.out.println("");
                System.out.println("------- ");
            }
            
            return;
        }
        for (int col = 0; col < board[row].length; col++) {
            board[row][col]=true;
            
        }
        recursion(board, row+1);

    }
}
