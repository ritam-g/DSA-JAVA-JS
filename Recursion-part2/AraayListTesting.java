import java.util.ArrayList;

public class AraayListTesting {
    public static void main(String[] args) {
        int[] arr={1,2,3,10,5,100,2,2,2};
        System.out.println(findTaget(arr, 2, 0));
    }
    public static ArrayList<Integer> findTaget(int[] arr,int target,int id){
        ArrayList<Integer> list=new ArrayList<>();
        //! base condition
        if (arr.length-1==id) {
            if (arr[id]==target) {
                list.add(id);
            }
            return list;
        } 
        if (arr[id]==target) {
            list.add(id);
        }
        //! SOTRING THE ALL LIST I AM USING ADD ALL  
        list.addAll(findTaget(arr, target, id+1));
        return list;
    }
}
