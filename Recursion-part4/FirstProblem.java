public class FirstProblem {
    public static void main(String[] args) {
        //! baccad    ans = bccd 
        //! i have to do with recursioin 
        String str="baccad";
        System.err.println(remove(str, 'a', 0)); 
    }
public static String remove(String str, char ele, int ind) {
    // Base Case: If index reaches the end, return an empty string
    if (ind == str.length()) {
        return "";
    }

    // Recursive Call: Get the result of the rest of the string first
    String smallOutput = remove(str, ele, ind + 1);

    // Calculation: If current char is NOT 'a', add it to the result
    if (str.charAt(ind) != ele) {
        return str.charAt(ind) + smallOutput;
    } else {
        return smallOutput;
    }
}
}
