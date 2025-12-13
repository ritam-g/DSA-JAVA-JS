public class SumOfNumber {
    public static void main(String[] args) {
       int ans= sumRange(2);
       System.out.println(ans);
    }
    public static int sumRange(int n){
        int sum=0;
        if (n==1) {
            return n;
        }
        sum=n+sumRange(n-1);
        return sum;
    }
}
