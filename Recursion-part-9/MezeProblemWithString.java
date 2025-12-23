import java.util.ArrayList;
import java.util.Arrays;

public class MezeProblemWithString {
    static ArrayList<String> result=new ArrayList<>();
    public static void main(String[] args) {
        //! i have to find the target 
        //! target will be 1,1 if any thing is one then i will get the reaching point 
        //! if anything is row or col is one then we find the posiblae way of answer
        
        // mezeAnswer(" ", 3, 3);
        mezeAnserCorrect("", 3, 3);
        System.err.println("new result");
        for (String string : result) {
            System.out.println(string);
        }
    }
    public static void mezeAnswer(String ans,int row,int col){
        if (row==1||col==1) {
            if (row==1) {
                ans=ans.concat("D");
            }
            else if(col==1){ans=ans.concat("R");}
            
            System.out.println(ans);
            return ;
        }
        //! down
        mezeAnswer(ans+"D ", row-1, col); 
        //! right 
        mezeAnswer(ans+"R ", row, col-1); 
    }
    public static void mezeAnserCorrect(String ans,int row,int col){
        if (row==1&&col==1) {
            result.add(ans);
            System.out.println(ans);
            return;
        }
        if (row>1) {
            mezeAnserCorrect(ans+"D ", row-1, col);
        }
        if (col>1) {
            mezeAnserCorrect(ans+"R ", row, col-1);
        }
    }
}
