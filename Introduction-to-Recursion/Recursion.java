public class Recursion {
    public static void main(String[] args) {
        call(1);
    }
    public static void call(int n){

        
        if (n==5) {
        System.out.println("the number is "+n);

            return;
        }
        System.out.println("the number is "+n);

        call(n+1);
    }
}
