public class UsingChar {
    public static void main(String[] args) {
        // Correct way: convert String to char array
        String str = "abc";                // fixed: was char str='abc'; (wrong)
        char[] arr = str.toCharArray();    // convert to char array
        
        // Call the permutation method starting from fixed index 0
        permutation(arr, 0);
    }
    
    public static void permutation(char[] arr, int fi) {
        // Base case: when we have fixed all positions except the last one
        if (fi == arr.length - 1) {
            System.out.println(arr);  // prints the full permutation like [a, b, c]
            return;
        }
        
        // Try every character from position 'fi' to end as the next fixed char
        for (int i = fi; i < arr.length; i++) {  // fixed: start from fi, not 0
            swap(arr, fi, i);           // place arr[i] at position fi
            permutation(arr, fi + 1);   // recurse for next position
            swap(arr, fi, i);           // backtrack: undo the swap
        }
    }
    
    public static void swap(char[] arr, int start, int end) {
        char temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}