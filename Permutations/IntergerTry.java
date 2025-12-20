public class IntergerTry {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        permitation(arr, 0);

    }
    public static void permitation(int[] arr,int fi){
        if (arr.length-1==fi) {
            for (int i : arr) {
                System.out.print(i);
            }
            System.out.println();
            return;
        }
        for (int i = fi; i < arr.length; i++) {
            swap(arr, fi, i);
            permitation(arr, fi+1);
            swap(arr, fi, i);
        }
    }
    public static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
