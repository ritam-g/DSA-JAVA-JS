public class ReverseNumberCorrected {
    public static void main(String[] args) {
        int number = 1234;
        int ans=reverseNumber(number,0);
        System.out.println(ans);
    }

    public static int reverseNumber(int number,int addValue){
        if(number==0){
            return addValue;
        }
        int reminder=number%10;
        addValue = (addValue*10)+reminder;
       return reverseNumber(number/10, addValue);
    }
}