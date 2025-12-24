public class Backtracking {
    public static void main(String[] args) {
        boolean[][] places={
            {true,true,true},
            {true,true,true},
            {true,true,true},
            };
            mezeAllDireaction(" ", 0, 0, places);
    }
    public static void mezeAllDireaction(String path,int row,int col,boolean[][] places){
        if (row==places.length-1 && col==places[0].length-1) {
            System.out.println(path);
            return;
        }
        if (!places[row][col]) {
            return;
        }
        places[row][col]=false;

        if (row<places.length-1) {
            mezeAllDireaction(path+" D-", row+1, col, places);
        }
        if (col<places[0].length-1) {
            mezeAllDireaction(path+" R-", row, col+1, places);
        }
        if (row>0) {
            mezeAllDireaction(path+" U-", row-1, col, places);
        }
        if (col>0) {
            mezeAllDireaction(path+" L-", row, col-1, places);
        }
        places[row][col]=true;
    }

}