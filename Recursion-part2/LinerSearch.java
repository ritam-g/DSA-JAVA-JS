
public class LinerSearch {
    public static void main(String[] args) {
        int[] arr={1,2,3,10,5,100};
        System.out.println(lS(arr, 100, 0));
    }
    public static boolean lS(int[] arr,int target,int id){

        if (arr.length-1==id) {
            return arr[id]==target;
        }
        return arr[id]==target || lS(arr, target, id+1);
    }
}
