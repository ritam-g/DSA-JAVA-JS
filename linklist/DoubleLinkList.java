

class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class DList {
    Node head = null;
    Node tail = null;

    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
        }
        else {
            // Connect forward
            tail.next = newNode;     // ← THIS WAS MISSING!
            // Connect backward
            newNode.prev = tail;
            // Update tail
            tail = newNode;
        }
    }

    // Better and simpler display method
    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Optional: Display backward (cool feature of doubly linked list!)
    public void displayReverse() {
        if (tail == null) {
            System.out.println("List is empty");
            return;
        }

        System.out.print("null ");
        Node temp = tail;
        while (temp != null) {
            System.out.print("<-> " + temp.data);
            temp = temp.prev;
        }
        System.out.println();
    }
}

public class DoubleLinkList {
    public static void main(String[] args) {
        DList list = new DList();
        
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println("Forward:");
        list.display();
        
        System.out.println("Backward:");
        list.displayReverse();
    }
}