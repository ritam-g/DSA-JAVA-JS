class Node {
    int data;
    Node left;
    Node right;
    
    Node(int data) {
        this.data  = data;
        this.left  = null;
        this.right = null;
    }
}

class BinaryInsertion {   // fixed spelling
    Node root = null;
    
    public void insertData(int[] arr) {
        root = buildBalancedBST(arr, 0, arr.length - 1);
    }
    
    
    // Builds a balanced BST from sorted array using divide & conquer
    private Node buildBalancedBST(int[] arr, int start, int end) {
        if (start > end) {
            return null;
        }
        
        int mid = start + (end - start) / 2;  // avoid overflow
        
        Node node = new Node(arr[mid]);       // ← use arr[mid], not mid!
        
        // Recursively build left and right subtrees
        node.left  = buildBalancedBST(arr, start, mid - 1);
        node.right = buildBalancedBST(arr, mid + 1, end);
        
        return node;
    }
    
    // Pre-order display (root → left → right)
    public void display() {
        displayHelper4(root);
        System.out.println();  // final newline
    }
    
    private void displayHelper(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + " ");
        displayHelper(node.left);
        displayHelper(node.right);
    }
    private void displayHelper2(Node node) {
        if (node == null) {
            return;
        }
        displayHelper2(node.left);
        System.out.print(node.data + " ");
        displayHelper2(node.right);
    }
    private void displayHelper3(Node node) {
        if (node == null) {
            return;
        }
         System.out.print(node.data + " ");
        displayHelper3(node.left);
       
        displayHelper3(node.right);
    }
    private void displayHelper4(Node node) {
        if (node == null) {
            return;
        }
         
        displayHelper4(node.left);
        displayHelper4(node.right);
        System.out.print(node.data + " ");
    }
}

public class InsertSortedData {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        
        BinaryInsertion bi = new BinaryInsertion();
        bi.insertData(arr);
        bi.display();           // Output: 3 2 1 4 5  (or similar balanced shape)
    }
}