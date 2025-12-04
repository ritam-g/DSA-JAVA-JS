public class Question268 {
    public static void main(String[] args) {
        int[] arr={0,1};
        int missing =missingNumber(arr);
        System.out.println(missing);
    }
    public static int missingNumber(int[] arr){
        int i=0;
        while (i<arr.length) {
            //! CHECK THAT ELEMENT IS == IND+1
            int elemnt=arr[i];
            if(elemnt <arr.length && elemnt != i){
            
                swap(arr, i, elemnt);
  
            } 
            else{
                i++;
            }
           
        }
        //!missing number 
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]!=j)return j;
        }
        //! no missing number  
        return arr.length;
    }
    public static void swap(int[] arr,int first,int last){
        int temp=arr[first];
        arr[first]=arr[last];
        arr[last]=temp;
    }
}
