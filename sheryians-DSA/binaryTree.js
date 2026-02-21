// Node class
class Node {
    constructor(data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

// Tree class
class Tree {
    constructor() {
        this.root = null;
    }

    // Insert using recursion
    insert(data) {
        this.root = this.insertNode(this.root, data);
    }

    insertNode(root, data) {
        if (root === null) {
            return new Node(data);
        }

        if (data < root.data) {
            root.left = this.insertNode(root.left, data);
        } else {
            root.right = this.insertNode(root.right, data);
        }

        return root;
    }

    // Inorder Traversal (Left → Root → Right)
    inorder(root = this.root) {
        if (root === null) return;

        this.inorder(root.left);
        console.log(root.data);
        this.inorder(root.right);
    }
    preorder(root=this.root){
        if(root===null)return

        console.log(root.data);
        this.preorder(root.left)
        this.preorder(root.right)
        
    }
    postorder(root=this.root){
        if(root==null)return
        this.postorder(root.left)
        this.postorder(root.right)
        console.log(root.data);
    }
}

// ---- Perform ----
const tree = new Tree();

tree.insert(10);
tree.insert(5);
tree.insert(15);
tree.insert(3);
tree.insert(7);

console.log("Inorder Traversal:");
tree.inorder();
console.log('///////////////');

tree.preorder()
console.log('///////////////');
tree.postorder()