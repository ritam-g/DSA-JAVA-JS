
class CustomQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    protected int end = 0;   // Points to where the next element will be added
    protected int front = 0; // Points to the first element to be removed
    private int size = 0;    // Keeps track of how many elements are currently in the queue

    public CustomQueue() {
        this(DEFAULT_SIZE);
    }

    public CustomQueue(int size) {
        this.data = new int[size];
    }

    public boolean isFull() {
        return size == data.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

   
    // Insert (Enqueue)
    public boolean add(int n) {
        if (isFull()) {
            return false;
        }
        data[end] = n;       // 1. Put data in current 'end'
        end = (end + 1) % data.length; // 2. Move 'end' forward and wrap around
        size++;              // 3. Increase size
        return true;
    }

    public int removed() {
        if (isEmpty()) {
            System.out.println("queue is empty");
            return -1;
        }
        int removedValue = data[front]; // 1. Save the data
        front = (front + 1) % data.length; // 2. Move 'front' forward and wrap around
        size--; // 3. IMPORTANT: Decrease size so isEmpty/isFull works!
        return removedValue;
    }
    public void display() {
    if (isEmpty()) {
        System.out.println("Queue is empty");
        return;
    }
    int i = front;
    for (int count = 0; count < size; count++) {
        System.out.print(data[i] + " ");
        i = (i + 1) % data.length;
    }
    System.out.println();  // New line for clean output
}

   }

public class CircularQueue {
    public static void main(String[] args) {
        CustomQueue cq=new CustomQueue();
        cq.add(0);
        cq.add(10);
        cq.add(20);
        cq.add(30);
        cq.add(40);
        cq.add(50);
        cq.add(60);
        cq.removed();
        cq.display();
    }
}
