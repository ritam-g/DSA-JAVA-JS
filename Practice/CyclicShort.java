public class CyclicShort {
    public static void main(String[] args) {
        int[] arr={3,0,1,1};
        cyclicSort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
    public static void cyclicSort(int[] arr){
        //!  IND=0,1 IND=1,2   when it will short
        //! IT WILL RUN N TIME THATS IS THE BENIFITE
        int i=0;
        while (i<arr.length) {
            int correct=arr[i]-1;
            if (correct>=0&&correct<arr.length&& arr[correct] !=arr[i]) {
                swap(arr, i, correct);
            }
            else{
                i++;
            }
        }
    }
    public static void  swap(int[] arr,int s,int e){
        int temp=arr[s];
        arr[s]=arr[e];
        arr[e]=temp;
    }
    
}
