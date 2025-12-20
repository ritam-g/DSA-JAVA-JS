import java.util.ArrayList;

public class AddInterger {
    static ArrayList<ArrayList<Integer>> allPermutations = new ArrayList<>();
    public static void main(String[] args) {
        int[] arr={1,2,3};
        allPermutations.clear();
        addpermitation(arr, 0,allPermutations);
        for (ArrayList<Integer> i : allPermutations) {
            System.out.println(i);
        }

    }
    public static void addpermitation(int[] arr,int fi,ArrayList<ArrayList<Integer>> allPermutations){
        if (arr.length-1==fi) {
             ArrayList<Integer> temp = new ArrayList<>();

            for (int i : arr) {
                temp.add(i);
            }
            allPermutations.add(temp);
            
            return;
        }
        for (int i = fi; i < arr.length; i++) {
            swap(arr, fi, i);
            addpermitation(arr, fi+1,allPermutations);
            swap(arr, fi, i);
        }
    }
    public static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
