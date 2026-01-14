// Node of BST
package tree.binarytree;
class Node {
    int value;
    Node left, right;

    Node(int value) {
        this.value = value;
        left = right = null;
    }
}

// Binary Search Tree
class BST {
    private Node root;

    // INSERT
    public void insert(int value) {
        root = insertRec(root, value);
    }

    private Node insertRec(Node root, int value) {
        if (root == null) {
            return new Node(value);
        }

        if (value < root.value) {
            root.left = insertRec(root.left, value);
        } else if (value > root.value) {
            root.right = insertRec(root.right, value);
        }
        // duplicates are ignored

        return root;
    }

    // INORDER (sorted output)
    public void inorder() {
        inorderRec(root);
        System.out.println();
    }

    private void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.value + " ");
            inorderRec(root.right);
        }
    }

    // PREORDER
    public void preorder() {
        preorderRec(root);
        System.out.println();
    }

    private void preorderRec(Node root) {
        if (root != null) {
            System.out.print(root.value + " ");
            preorderRec(root.left);
            preorderRec(root.right);
        }
    }

    // POSTORDER
    public void postorder() {
        postorderRec(root);
        System.out.println();
    }

    private void postorderRec(Node root) {
        if (root != null) {
            postorderRec(root.left);
            postorderRec(root.right);
            System.out.print(root.value + " ");
        }
    }

    // SEARCH
    public boolean search(int value) {
        return searchRec(root, value);
    }

    private boolean searchRec(Node root, int value) {
        if (root == null) return false;
        if (root.value == value) return true;

        if (value < root.value)
            return searchRec(root.left, value);
        else
            return searchRec(root.right, value);
    }
}

// MAIN CLASS
public class BinarySearchTreeDemo {
    public static void main(String[] args) {

        BST bst = new BST();

        bst.insert(50);
        bst.insert(30);
        bst.insert(70);
        bst.insert(20);
        bst.insert(40);
        bst.insert(60);
        bst.insert(80);

        System.out.print("Inorder   : ");
        bst.inorder();      // 20 30 40 50 60 70 80

        System.out.print("Preorder  : ");
        bst.preorder();     // 50 30 20 40 70 60 80

        System.out.print("Postorder : ");
        bst.postorder();    // 20 40 30 60 80 70 50

        System.out.println("Search 40 : " + bst.search(40)); // true
        System.out.println("Search 90 : " + bst.search(90)); // false
    }
}
