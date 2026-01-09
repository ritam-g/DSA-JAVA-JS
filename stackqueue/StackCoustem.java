package stackqueue;

class Stack {
    protected int[] data; // Use protected so child classes can access it
    private static final int DEFAULT_SIZE = 10;
    private int ptr = -1; // Removed static

    public Stack() {
        this(DEFAULT_SIZE);
    }

    public Stack(int size) {
        this.data = new int[size];
    }

    public boolean add(int num) {
        if (isFull()) {
            System.out.println("Stack is full!");
            System.out.println("dynamic thing will come");
            int temp[]=new int[data.length*2];
            for (int i = 0; i < data.length; i++) {
                temp[i]=data[i];
            }
            
            data=temp;
        }
        ptr++;
        data[ptr] = num;
        System.out.println(data[ptr]);
        return true;
    }

    public int remove() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return -1; 
        }
        // Get the item first, then move the pointer down
        int removed = data[ptr];
        ptr--;
        return removed;
    }

    public int peek() {
        if (isEmpty()) {
            return -1;
        }
        return data[ptr];
    }

    public boolean isFull() {
        return ptr == data.length - 1;
    }

    public boolean isEmpty() {
        return ptr == -1;
    }
}

public class StackCoustem {
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.add(10);
        stack.add(20);
        stack.add(30);
        stack.add(10);
        stack.add(20);
        stack.add(30);
        stack.add(10);
        stack.add(20);
        stack.add(30);
        stack.add(10);
        stack.add(20);
        stack.add(30);
        stack.add(10);
        stack.add(20);
        stack.add(30);
        stack.add(10);
        stack.add(20);
        stack.add(30);
        stack.add(10);
        stack.add(20);
        stack.add(30);

        System.out.println("Popped: " + stack.remove()); // Should be 30
        System.out.println("Peek: " + stack.peek());     // Should be 20
    }
}