
public class Pattern {
    public static void main(String[] args) {
        patternPrint2(5, 0);
    }
    public static void patternPrint(int row,int col){
        //base condition
        if(row==0){
            return;
        }
        if(col<row){
            System.out.print(" * ");
            patternPrint(row, col+1);
        }
        else{
            System.out.println(" ");
            patternPrint(row-1, 0);
        }
    }
public static void patternPrint2(int row,int col){
        //base condition
        if(row==0){
            return;
        }
        if(col<row){    
            patternPrint(row, col+1);
            System.out.print(" * ");
        }
        else{
            
            patternPrint(row-1, 0);
            System.out.println(" ");
        }
    }
}
