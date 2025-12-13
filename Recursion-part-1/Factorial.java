public class Factorial {
    public static void main(String[] args) {
        System.out.println(FactorialOfTheNumber(4));
        System.out.println(FactorialOfTheNumber(2));
        System.out.println(FactorialOfTheNumber(3));
        System.out.println(FactorialOfTheNumber(1));
    } 
    public static int FactorialOfTheNumber(int n) {
        int fact=1;
        if (n==1) {
            return n;
        }
        fact=n*FactorialOfTheNumber(n-1);
        return fact;
    }   
}
