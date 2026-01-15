class Node {
    int data;      // sum of range
    int start;     // range start
    int end;       // range end
    Node left;
    Node right;

    Node(int start, int end) {
        this.start = start;
        this.end = end;
        this.data = 0;
    }
}

 class SegmentTree {

    Node root;

    // Constructor
    SegmentTree(int[] arr) {
        root = buildTree(arr, 0, arr.length - 1);
    }

    // Build Segment Tree
    private Node buildTree(int[] arr, int start, int end) {

        //! create node 
        Node newNode=new Node(start, end);
        if (start==end) {
            newNode.data=arr[start];
            return newNode;
        }
        int mid=start+(end-start)/2;
        //! making node left and right side 
        newNode.left=buildTree(arr,start,mid);
        newNode.right=buildTree(arr,mid+1,end);

        //! add two side node 
        newNode.data=newNode.left.data+newNode.right.data;

        return newNode;
    }

    // Public query function
    public int query(int qStart, int qEnd) {
        return query(root, qStart, qEnd);
    }

    // Query helper
    private int query(Node node, int qStart, int qEnd) {

        if (node == null) {
        return 0;
        }

    // Case 1: No overlap → return neutral element (0 for sum)
    if (node.end < qStart || node.start > qEnd) {
        return 0;
        }

    // Case 2: Total overlap → node range completely inside query range
    //         → return the stored sum (this is the optimization!)
    if(node.start>=qStart&&node.end<=qEnd){
        return node.data;
    }
        int  leftData= query(node.left,qStart, qEnd);
        int  rightData= query(node.right,qStart, qEnd);
        return leftData+rightData;
        
    }

}

public class Main {
    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 7, 9, 11,12,13,16,15};

        SegmentTree tree = new SegmentTree(arr);

        System.out.println(tree.query(1, 3)); // 3 + 5 + 7 = 15
        System.out.println(tree.query(3, 5)); // sum of all
    }
}

