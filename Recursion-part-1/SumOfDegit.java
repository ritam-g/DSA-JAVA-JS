public class SumOfDegit {
    public static void main(String[] args) {
        int ans=sumDegit(1342);
        System.out.println(ans);
    }
    public static int sumDegit(int n){
        int sum=0;
        if (n==0) {
            return 0;
        }
        sum=n%10 +sumDegit(n/10);
        return sum;
    }
}
