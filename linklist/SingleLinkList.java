package linklist;
class Node {
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    } 
}
class link{
    Node head=null;
    public void add(int data){
        Node newNode=new Node(data);
        if (head==null) {
            head=newNode;
        }
        else{
            Node curr=head;
            while (curr.next!=null) {
                curr=curr.next;
            }
            curr.next=newNode;
        }
    }
    public void displa(){
        Node curr=head;
        while(curr!=null) {
            System.out.print(curr.data+" => ");
            curr=curr.next;
        }
    }
}
public class SingleLinkList {
    public static void main(String[] args) {
        link n=new link();
        n.add(1);
        n.add(2);
        n.add(3);
        n.add(4);
        n.displa();
    }
}
