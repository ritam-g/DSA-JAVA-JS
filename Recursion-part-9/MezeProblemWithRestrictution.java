public class MezeProblemWithRestrictution {
    public static void main(String[] args) {
        //! WE WILL HAVE SOME OBSTICALS 
        //! THAT WILL NOT ALLOW TO GO THER  
        boolean[][] restriction={
            {true,true,true},
            {true,false,true},
            {true,true,true},
        }; 
        mezeRestriction("", restriction, 0, 0);
        System.err.println(restriction.length);
    }
    public static void mezeRestriction(String ans,boolean[][] restriction,int row,int col){
        //! BASE CONDITION
        if (row==restriction.length-1 && col==restriction[0].length-1) {
            System.out.println(ans);
            return;
        } 
        //! i have to checks thta is it going to any obsticals or nor 
        if (!restriction[row][col]) {
            return;
        }
        //! HERE I AM USING RESTRICTION.LENGTH-1 
        //! BECUSE OUR BASE CONDITION   
        if (row<restriction.length-1) {
            mezeRestriction(ans+"D ", restriction, row+1, col);
        }
        if (col<restriction[0].length-1) {
            mezeRestriction(ans+"R ", restriction, row, col+1);
        }
    }
}
