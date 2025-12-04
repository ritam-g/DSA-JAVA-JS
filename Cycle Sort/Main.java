public class Main{
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
        cycleSort(arr);
        for (int i : arr) {
            System.out.print(i+ " ");
        }
    }
    public static void cycleSort(int[] arr){
        int i=0;
        while (i<arr.length) {
            int element=arr[i];
            int ind=element-1;
            if (element==arr[ind]) {
                i++;
            } else {
                swap(arr, i, ind);
            }
        }
    }
    public static void swap(int[] arr,int first,int last){
        int temp=arr[first];
        arr[first]=arr[last];
        arr[last]=temp;
    }
}