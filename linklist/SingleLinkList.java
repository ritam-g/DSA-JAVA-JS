package linklist;

class Node {
    int data;
    Node next;
    
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class link {
    Node head = null;
    Node tail = null;  // points to the last node

    // CORRECT add method using tail for O(1) insertion at end
    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            // First node: both head and tail point to it
            head = newNode;
            tail = newNode;
        } else {
            // Link the current tail to the new node
            tail.next = newNode;
            // Update tail to the new last node
            tail = newNode;
        }
    }
    public void addData(int data,int index){
        Node newNode=new Node(data);
        Node curr=head;
        for (int i = 1; i < index; i++) {
            curr=curr.next;
        }
        Node temp=curr.next;
        curr.next=newNode;
        newNode.next=temp;

    }
    public void deleteFirst(){
        System.out.println("remove value is "+head.data);
        head=head.next;

    }
   public void deleteLast() {
    // Case 1: List is empty
    if (head == null) {
        System.out.println("List is empty, nothing to delete!");
        return;
    }

    // Case 2: Only one node
    if (head == tail) {  // or head.next == null
        System.out.println("The last value deleted is " + tail.data);
        head = null;
        tail = null;
        return;
    }

    // Case 3: More than one node
    // Traverse to second-last node
    Node curr = head;
    while (curr.next != tail) {
        curr = curr.next;
    }

    System.out.println("The last value deleted is " + tail.data);

    // Update second-last node's next to null
    curr.next = null;
    // Update tail to second-last node
    tail = curr;
}
    // Print the tail's data
    public void tailData() {
        if (tail == null) {
            System.out.println("List is empty");
        } else {
            System.out.println("Tail data: " + tail.data);
        }
    }

    // Display full list
    public void displa() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " => ");
            curr = curr.next;
        }
        System.out.println("null");
    }
}

public class SingleLinkList {
    public static void main(String[] args) {
        link n = new link();
        
        n.add(1);
        n.add(2);
        n.add(3);
        n.add(4);
        n.addData(10, 2);
        n.deleteFirst();
        n.displa();   
        n.tailData();   // Output: Tail data: 4
    }
}