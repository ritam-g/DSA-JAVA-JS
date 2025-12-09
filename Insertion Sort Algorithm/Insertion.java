public class Insertion {
    public static void main(String[] args) {
        int arr[] = {5, 4, 3, 2, 1};

        // 🔵 Start from index 1 because index 0 is already "sorted"
        for (int i = 1; i < arr.length; i++) {

            int temp = arr[i];   // 🟡 Element to be inserted in the correct position
            int j = i - 1;       // 🟢 Start comparing with the left side

            // 🔴 Shift elements to the right until correct position is found
            // Condition:
            // j >= 0 → stay inside array
            // arr[j] > temp → shift larger elements to the right
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];   // shift right
                j--;                   // move left
            }

            // 🟣 Place temp at its correct sorted position
            arr[j + 1] = temp;
        }

        // 🟢 Print sorted array
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
