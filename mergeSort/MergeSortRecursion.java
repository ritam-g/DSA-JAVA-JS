import java.util.Arrays;

public class MergeSortRecursion {  // Fixed class name too
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        int[] sorted = mergeSort(arr);
        System.out.println(Arrays.toString(sorted));
    }

    public static int[] mergeSort(int[] arr) {
        //! BASE CONDITION 
        if (arr.length==1) {
            return arr;
        }
        //! MID OF ARRAY RANGE
        int mid=arr.length/2; 
        int[] left=mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right=mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        //! MARGE THE ARRAY 
        return marge(left,right);

    }
    public static int[] marge(int[] left,int[] right){
        int[] newArray=new int[left.length+right.length];
        int i=0;
        int j=0;
        int k=0;
        //! MAKE SURE THE INDEX SHOULD BE IN THE RAGE OF TWO SUB ARRAY 
        while (i<left.length&&j<right.length) {
            //! CHECKS IF LEFT ELEMENT IS LESS THEANN RIGHT THEN PUT IN NEW ARRYA OR ELSE PUT IN RIGHT IN NEW ARRYA  
            if(left[i]<right[j]){
                newArray[k]=left[i];
                i++;
            }
            else{
                newArray[k]=right[j];
                j++;
            }
            k++;
        }
        while (i<left.length) {
            newArray[k]=left[i];
            i++;
            k++;
        }
        while (j<right.length) {
            newArray[k]=right[j];
            j++;
            k++;
        }
        return newArray;

    }

}