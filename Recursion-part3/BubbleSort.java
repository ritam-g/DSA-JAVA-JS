public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        // Start sorting: array length is the outer limit, 0 is the starting index
        sort(arr, arr.length, 0);
        
        // Print result
        for(int i : arr) System.out.print(i + " ");
    }
    public static void sort(int[] arr,int n,int ind){
        if (n==1) {
            return;
        }
        if (ind==n-1) {
            sort(arr, n-1, 0);
            return;
        }
        if (arr[ind]>arr[ind+1]) {
            int temp=arr[ind];
            arr[ind]=arr[ind+1];
            arr[ind+1]=temp;
        }
        sort(arr, n, ind+1);
    }
   }
