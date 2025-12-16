public class SortedArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,10,5};
        System.out.println(sortedAraayChecks(arr,0));
    }
    public static boolean sortedAraayChecks(int[] arr,int id){
        //! base condition
        if(arr.length-1==id){
            return true;
        } 
        return arr[id]<arr[id+1]&&sortedAraayChecks(arr,++id);
    }
}
