import java.util.ArrayList;

public class Question17 {
    public static void main(String[] args) {
        String st = "23";  // ← Fix 1: change "ab" to digits like "23"
        ArrayList<String> result=new ArrayList<>();
        combination("", st,result);
        System.err.println("the another soting same value ");
        System.out.println(result);
    }
    
    public static void combination(String process, String unProcess,ArrayList<String> ans) {
        if (unProcess.isEmpty()) {
            System.out.println(process);
            ans.add(process);
            return;
        }  

        int digit = unProcess.charAt(0) - '0';  // correct (you already fixed this)

        // ← Fix 2: replace your old for loop with this one
        for (int i = (digit - 2) * 3; i < (digit - 2) * 3 + 3; i++) {
            char ch = (char)(i + 'a');
            combination(process + ch, unProcess.substring(1),ans);
        } 
    }
}