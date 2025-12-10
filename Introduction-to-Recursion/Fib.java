public class Fib {
    public static void main(String[] args) {
        //! fin n= fib(n-1) + fib(n-2) 
        int ans=fibValue(5);
        System.out.println(ans);
    }
    public static int fibValue(int n){
        if (n<2) {
          return n;  
        }
        return fibValue(n-1)+fibValue(n-2);
    }
}
