class tree {
    int value;
    tree left;
    tree right;

    tree(int val) {
        this.value = val;
        this.left = null;
        this.right = null;
    }
}

class BT {
    tree root = null;

    public void insert(int value) {
        tree node = new tree(value);
        if (root == null) {
            root = node;
            return; // IMPORTANT FIX
        }
        leftRight(root, node);
    }

    public tree leftRight(tree curr, tree node) {
        if (curr == null) {
            return node;
        }

        if (node.value < curr.value) {
            curr.left = leftRight(curr.left, node);
        } else if (node.value > curr.value) {
            curr.right = leftRight(curr.right, node);
        }
        // duplicate values ignored

        return curr;
    }

    public void display() {
        inorder(root," ");
    }

    private void inorder(tree node, String indent) {
        if(node==null){
            return;
        }
    System.out.print(indent+node.value);
    inorder(node.left, indent+"L-> ");
    System.out.println(" ");
    inorder(node.right, indent+"R->");
    }

}

public class BinaryTreeCousteme {
    public static void main(String[] args) {

        BT binaryTree = new BT();
        for (int i = 0; i < 10; i++) {
            binaryTree.insert(i);
            binaryTree.insert(i-10);
        }

        binaryTree.display(); // Output: 1 2 3
    }
}
