public class Main {
    public static void main(String[] args) {
        int arr[]={1,-89,78,42};
        for (int i = 0; i < arr.length; i++) {
            int last=arr.length-i-1;
            //! i got the max value  
            int max=findMax(arr, last);
            //! swap 
            swap(arr, max, last);
        }
        for (int i : arr) {
            System.out.println(i+ " ");
        }
    }
    public static int findMax(int[] arr,int len){
        int max=0;
        for (int i = 0; i <= len; i++) {
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }
    public static void swap(int[] arr,int max,int last){
         int temp=arr[max];
            arr[max]=arr[last];
            arr[last]=temp;
        
    }
}
