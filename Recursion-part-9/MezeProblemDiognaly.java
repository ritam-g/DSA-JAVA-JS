public class MezeProblemDiognaly {
    public static void main(String[] args) {
        //! CHALLAGEN IS WE HAVE TO GO DOWN - RIGHT- DIOGNAL
diognalMeze("", 3,3);
    }
    public static void diognalMeze(String ans,int row,int col){
        if (row==1&&col==1) {
            System.out.println(ans);
            return;
        }if (row>1&&col>1) {
            diognalMeze(ans+" d ", row-1, col-1);
        }
        if (row>1) {
            diognalMeze(ans+" D ", row-1, col);
        }
        if (col>1) {
            diognalMeze(ans+" R ", row, col-1);
        }
        
    }
}
