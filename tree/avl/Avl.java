package tree.avl;
class Node {
    int data;
    int height;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.height = 1; // new node starts as leaf
    }
}

class AVL {

    Node root;

    int height(Node n) {
        if (n == null)
            return 0;
        return n.height;
    }

    Node insert(Node node, int value) {

        // normal BST insertion
        if (node == null)
            return new Node(value);

        if (value < node.data)
            node.left = insert(node.left, value);
        else
            node.right = insert(node.right, value);

        // SIMPLE HEIGHT UPDATE
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);

        node.height = 1 + Math.max(leftHeight, rightHeight);

        return node;
    }

    void inorder(Node node) {
        if (node == null) return;
        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }
}

public class Avl {
    public static void main(String[] args) {
        AVL tree = new AVL();

        tree.root = tree.insert(tree.root, 10);
        tree.root = tree.insert(tree.root, 5);
        tree.root = tree.insert(tree.root, 2);

        tree.inorder(tree.root);
    }
}
