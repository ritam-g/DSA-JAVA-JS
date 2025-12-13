public class CountNumberOfZero {
    public static void main(String[] args) {
        System.out.println(numberofZero(120, 0));
        System.out.println(numberofZero(1200, 0));
        System.out.println(numberofZero(12000, 0));
        System.out.println(numberofZero(120000, 0));
    }
    public static int numberofZero(int num,int count){
        if (num==0) {
            return count;
        }
        int reminder=num%10;
        if(reminder==0){
            ++count;
        }
        return numberofZero(num/10, count);
    }
}
