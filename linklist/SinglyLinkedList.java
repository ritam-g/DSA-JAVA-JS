class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SinglyLinkedList {

    static Node head = null;
    static Node tail = null;

    public static void main(String[] args) {

        // Create first node
        Node n1 = new Node(10);
        head = n1;
        tail = n1;

        // Add more nodes
        Node n2 = new Node(20);
        tail.next = n2;
        tail = n2;

        Node n3 = new Node(30);
        tail.next = n3;
        tail = n3;

        Node n4 = new Node(40);
        tail.next = n4;
        tail = n4;
        reverse(head);
        // Traverse list
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void reverse(Node node){
        if(node.next==null){
            head=tail;
            return;
        }
        reverse(node.next);
        
        
        node.next.next = node;
        node.next = null;

    // update tail only once (original head)
        tail = node;


    }
}
