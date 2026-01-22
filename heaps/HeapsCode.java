public class HeapsCode {

    static class MinHeap {
        int[] heap;
        int size;
        int capacity;

        MinHeap(int capacity) {
            this.capacity = capacity;
            heap = new int[capacity];
            size = 0;
        }

        // Get parent index
        int parent(int i) {
            return (i - 1) / 2;
        }

        // Get left child index
        int left(int i) {
            return 2 * i + 1;
        }

        // Get right child index
        int right(int i) {
            return 2 * i + 2;
        }

        // Insert element into heap
        void insert(int val) {
            if (size == capacity) {
                System.out.println("Heap is full");
                return;
            }

            heap[size] = val;
            int current = size;
            size++;

            // Heapify up
            while (current > 0 && heap[current] < heap[parent(current)]) {
                swap(current, parent(current));
                current = parent(current);
            }
        }

        // Remove minimum element (root)
        int removeMin() {
            if (size == 0) return -1;

            int min = heap[0];
            heap[0] = heap[size - 1];
            size--;

            heapifyDown(0);
            return min;
        }

        // Heapify down
        void heapifyDown(int i) {
            int smallest = i;
            int left = left(i);
            int right = right(i);

            if (left < size && heap[left] < heap[smallest])
                smallest = left;

            if (right < size && heap[right] < heap[smallest])
                smallest = right;

            if (smallest != i) {
                swap(i, smallest);
                heapifyDown(smallest);
            }
        }

        // Swap helper
        void swap(int i, int j) {
            int temp = heap[i];
            heap[i] = heap[j];
            heap[j] = temp;
        }

        // Print heap
        void printHeap() {
            for (int i = 0; i < size; i++) {
                System.out.print(heap[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        MinHeap heap = new MinHeap(10);

        heap.insert(10);
        heap.insert(5);
        heap.insert(20);
        heap.insert(2);

        heap.printHeap();   // Heap elements

        System.out.println("Removed: " + heap.removeMin());
        heap.printHeap();
    }
}
