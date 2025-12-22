import java.util.ArrayList;

public class Question17Count {
    public static void main(String[] args) {
        String st = "23";
        ArrayList<String> result = new ArrayList<>();
        int count = combination("", st, result);
        System.out.println("All combinations:");
        System.out.println(result);
        System.out.println("Total count: " + count);
    }
    
    public static int combination(String process, String unProcess, ArrayList<String> ans) {
        if (unProcess.isEmpty()) {
            if (!process.isEmpty()) {  // don't count empty string if input was empty
                ans.add(process);
            }
            return 1;  // each valid combination counts as 1
        }  

        int digit = unProcess.charAt(0) - '0';
        int totalCount = 0;

        for (int i = (digit - 2) * 3; i < (digit - 2) * 3 + 3; i++) {
            char ch = (char)(i + 'a');
            totalCount += combination(process + ch, unProcess.substring(1), ans);
        } 
        return totalCount;
    }
}