/**
 * Class representing a Node of the binary tree
 */
class Node {
    constructor(data) {
        this.data = data;     // value of the node
        this.left = null;     // left child
        this.right = null;    // right child
    }
}

/**
 * Function to calculate height of binary tree
 * Height of a tree is number of nodes along the longest path from root to leaf.
 * @param {Node} root - root of the binary tree
 * @return {number} - height of the tree
 */
function height(node) {
    // Base case: empty tree has height 0
    if(node==null){
        return 0
    }

    // Recursively calculate height of left and right subtrees
    let goLeft=height(node.left)
    let goRight=height(node.right)

    // Height of tree = max(leftHeight, rightHeight) + 1 (for root)
    // ! +1 will be for the current node
    let max=Math.max(goLeft,goRight)+1

    return max
}

/* -----------------------------
   TEST CASES
-------------------------------- */

// Create the tree:
//         1
//       /   \
//      2     3
//     / \   /
//    4   5 6
let root = new Node(1);
root.left = new Node(2);
root.right = new Node(3);
root.left.left = new Node(4);
root.left.right = new Node(5);
root.right.left = new Node(6);

// Calculate height
console.log("Height of tree:", height(root)); 
// Expected output: 3 (longest path: 1->2->4 or 1->2->5 or 1->3->6)

/* -----------------------------
   EDGE CASES
-------------------------------- */

// Empty tree
console.log("Height of empty tree:", height(null)); // Expected: 0

// Single node tree
let single = new Node(10);
console.log("Height of single node tree:", height(single)); // Expected: 1