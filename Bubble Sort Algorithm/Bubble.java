public class Bubble {
    public static void main(String[] args) {

        int[] arr = {5, 4, 13, 2, 100};
        int[] arr2 = {5, 4, 13, 200, 100};
        int[] arr3 = {5, 4, 130, 2, 100};
        int[] arr4 = {5,4,3,2,1};

        bBS(arr);  // calling bubble sort function
        bBS(arr2);  // calling bubble sort function
        bBS(arr3);  // calling bubble sort function
        bBS(arr4);  // calling bubble sort function

        // printing the sorted array
        for (int i : arr) {
            System.out.print(i + " : ");
        }
        System.out.println(" ");
        for (int i : arr2) {
            System.out.print(i + " : ");
        }
        System.out.println(" ");
        for (int i : arr3) {
            System.out.print(i + " : ");
        }
        System.out.println(" ");
        for (int i : arr4) {
            System.out.print(i + " : ");
        }
    }

    static void bBS(int[] arr) {

        // Outer loop: runs for every element in the array.
        // After each pass, the largest element moves to the end.
        
        for (int i = 0; i < arr.length; i++) {

            int j = 1;  // starting from index 1 to compare with j-1 (previous element)

            // Inner loop: compares and swaps elements.
            // "arr.length - i" because the last i elements are already sorted.
            while (j < arr.length - i) {

                // If current element is smaller than previous element, swap them.
                // This pushes the larger element toward the end.
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }

                j++; // move to the next pair for comparison
            }
        }
    }
}
