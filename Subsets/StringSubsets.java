public class StringSubsets {
    public static void main(String[] args) {
        subSetsPrint("", "abc");
    }
    public static void subSetsPrint(String empty,String realString){
        if (realString.isEmpty()) {
            System.out.println(empty);
            return;
        }
        char ch=realString.charAt(0);
        subSetsPrint(empty+ch, realString.substring(1));
        subSetsPrint(empty, realString.substring(1));
    }
}
