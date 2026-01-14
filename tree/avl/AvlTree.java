class Node {
    int data;
    int height;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.height = 1;
    }
}

class Avl {

    private Node treeRoot;

    private int height(Node node) {
        return node == null ? 0 : node.height;
    }

    private int getBalance(Node node) {
        return node == null ? 0 : height(node.left) - height(node.right);
    }

    // Right Rotate (for Left-Left & Left-Right cases)
    private Node rightRotate(Node y) {
        Node x = y.left;
        Node T2 = x.right;

        // Perform rotation
        x.right = y;
        y.left = T2;

        // Update heights
        y.height = 1 + Math.max(height(y.left), height(y.right));
        x.height = 1 + Math.max(height(x.left), height(x.right));

        return x; // new root of this subtree
    }

    // Left Rotate (for Right-Right & Right-Left cases)
    private Node leftRotate(Node x) {
        Node y = x.right;
        Node T2 = y.left;

        // Perform rotation
        y.left = x;
        x.right = T2;

        // Update heights
        x.height = 1 + Math.max(height(x.left), height(x.right));
        y.height = 1 + Math.max(height(y.left), height(y.right));

        return y; // new root of this subtree
    }

    private Node rotate(Node node) {
        int balance = getBalance(node);

        // Left Heavy
        if (balance > 1) {
            // Left-Left Case
            if (getBalance(node.left) >= 0) {
                return rightRotate(node);
            }
            // Left-Right Case
            if (getBalance(node.left) < 0) {
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        }

        // Right Heavy
        if (balance < -1) {
            // Right-Right Case
            if (getBalance(node.right) <= 0) {
                return leftRotate(node);
            }
            // Right-Left Case
            if (getBalance(node.right) > 0) {
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }
        }

        return node;
    }

    private Node insertNode(Node node, int data) {
        if (node == null) {
            return new Node(data);
        }

        if (data < node.data) {
            node.left = insertNode(node.left, data);
        } else if (data > node.data) {
            node.right = insertNode(node.right, data);
        } else {
            return node; // no duplicates
        }

        // Update height
        node.height = 1 + Math.max(height(node.left), height(node.right));

        // Rebalance
        return rotate(node);
    }

    public void insert(int data) {
        treeRoot = insertNode(treeRoot, data);
    }

    public void inorder() {
        inorderTraversal(treeRoot);
        System.out.println();
    }

    private void inorderTraversal(Node node) {
        if (node != null) {
            inorderTraversal(node.left);
            System.out.print(node.data + "(h=" + node.height + ") ");
            inorderTraversal(node.right);
        }
    }
}

public class AvlTree {
    public static void main(String[] args) {
        Avl tree = new Avl();

        tree.insert(30);
        tree.insert(20);
        tree.insert(10);    // should trigger right rotation
        tree.insert(40);
        tree.insert(50);    // should trigger left rotation
        tree.insert(25);

        tree.inorder();
        // Expected something like: 10(h=1) 20(h=2) 25(h=1) 30(h=3) 40(h=2) 50(h=1)
    }
}