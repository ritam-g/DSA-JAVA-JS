import java.util.ArrayList;

public class ArrayListString {
    public static void main(String[] args) {
        // 1. Create the initial empty list
    ArrayList<String> results = new ArrayList<>();
    
    // 2. Call the function and catch the returned list
    ArrayList<String> finalSubsets = listArray("", "abc", results);
    
    // 3. Print the result
    System.out.println(finalSubsets);
    }
    public static ArrayList<String> listArray(String empty, String str, ArrayList<String> aStr){
        if (str.isEmpty()) {
            aStr.add(empty);
            return aStr;
        }
        char ch=str.charAt(0);
        listArray(empty, str.substring(1), aStr);
        listArray(empty+ch, str.substring(1), aStr);
        
        return aStr;
    }
}
