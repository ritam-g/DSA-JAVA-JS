public class MezeProblem {
    public static void main(String[] args) {
        //! i have to find the target 
        //! target will be 1,1 if any thing is one then i will get the reaching point 
        //! if anything is row or col is one then we find the posiblae way of answer
        int ans=mezeAnswer(3, 3);
        System.out.println("the answer is "+ans);
        mezeAnswerPrint(3,3);
    }
    public static int mezeAnswer(int row,int col){
        if (row==1||col==1) {
            return 1;
        }
        int left=mezeAnswer(row-1, col);
        int right=mezeAnswer(row, col-1);
        return left+right;
    }
    public static void mezeAnswerPrint(int row,int col){
        System.out.println(row+" - "+col);
        if (row==1||col==1) {
            
            return;
        }
        mezeAnswer(row-1, col);
        mezeAnswer(row, col-1);
    }

}