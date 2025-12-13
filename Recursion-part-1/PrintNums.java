
public class PrintNums {
    public static void main(String[] args) {
        recur(10);
    }
    public static void  recur(int n){
        if (n==1) {
            System.out.println(n);
            return;
        }
        recur(n-1);//! acending order 
        System.out.println(n);
        // recur(n-1);//! for decending order 
    }
}
