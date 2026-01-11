public class Practice {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7, 9};     // must be sorted
        int[] arr2 = {2, 4, 6, 8, 10};    // must be sorted
        
        // int[] arr1 = {5,4,3,2,1};      // ← this will give wrong result
        // int[] arr2 = {90,20,30};       // ← this will give wrong result
        
        int[] merged = merge(arr1, arr2);
        
        for (int num : merged) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int[] merge(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        
        int[] result = new int[n1 + n2];   // ← correct size
        
        int i = 0, j = 0, k = 0;
        
        // Merge while both arrays have elements
        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) {     
                result[k] = arr1[i];
                i++;
            } else {
                result[k] = arr2[j];
                j++;
            }
            k++;
        }
        
        // Copy remaining elements of arr1 (if any)
        while (i < n1) {
            result[k] = arr1[i];
            i++;
            k++;
        }
        
        // Copy remaining elements of arr2 (if any)
        while (j < n2) {
            result[k] = arr2[j];
            j++;
            k++;
        }
        
        return result;
    }
}