package stackqueue;



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
    public boolean add(int item) {
        if(isFull()){
            return false;
        }
        data[end]=item;
        end=end%data.length;
        end++;
        size++;
        return true;
    }

    // Remove (Dequeue)
    public int remove() {
    if (isEmpty()) {
        System.out.println("Queue is empty!");
        return -1;
    }

    // 1. Save the first item (the one at the front)
    int removedValue = data[0];

    // 2. Shift everything to the left
    for (int i = 1; i < data.length; i++) {
        data[i-1]=data[i];
    }
    // 3. Move the end pointer back because one item is gone
    end--;
    size--;
    return removedValue;
}

    public int peek() {
        if (isEmpty()) {
            return -1;
        }
        return data[front];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Empty");
            return;
        }
        int i = front;
        int count = 0;
        do {
            System.out.print(data[i] + " <- ");
            i++;
            i %= data.length;
            count++;
        } while (count < size);
        System.out.println("END");
    }
}

public class QueueMain {
    public static void main(String[] args) {
        CustomQueue queue = new CustomQueue(5);
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);

        queue.display();

        System.out.println("Removed: " + queue.remove());
        System.out.println("Removed: " + queue.remove());
        queue.add(60); // This works because it wraps around!
        
        queue.display();
    }
}