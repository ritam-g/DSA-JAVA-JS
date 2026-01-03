class Node {
    int data;
    Node next;
    
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Link {
    Node head = null;
    Node tail = null;

    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            // First node
            head = newNode;
            tail = newNode;
            tail.next = head;  // circular: points to itself
        } else {
            // Add after tail
            tail.next = newNode;
            newNode.next = head;  // new node points back to head
            tail = newNode;       // update tail
        }
    }

    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);  // stop when we come back to head

        System.out.println("(back to head)");
    }
}

public class Circular {
    public static void main(String[] args) {
        Link list = new Link();
        
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        list.display();
    }
}