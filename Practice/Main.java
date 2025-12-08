class Solution {
    public int climbStairs(int n) {
        if (n <= 2) return n;
        
        int a = 1;  // ways for n-2
        int b = 2;  // ways for n-1
        
        for (int i = 3; i<=n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution s=new Solution();
        System.out.println(s.climbStairs(10));
    }
}
