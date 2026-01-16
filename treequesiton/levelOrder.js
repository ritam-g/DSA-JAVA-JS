function TreeNode(val, left, right) {
    this.val = (val === undefined ? 0 : val);
    this.left = (left === undefined ? null : left);
    this.right = (right === undefined ? null : right);
}

const root = new TreeNode(10);
root.left = new TreeNode(6);
root.right = new TreeNode(15);

root.left.left = new TreeNode(3);
root.left.right = new TreeNode(8);

root.right.right = new TreeNode(20);

var levelOrderSuccessor = function(root, key) {

    if (root === null) return null;

    let queue = [];
    queue.push(root);

    while (queue.length > 0) {

        let node = queue.shift();

        if (node.left !== null) queue.push(node.left);
        if (node.right !== null) queue.push(node.right);

        if (node.val === key) {
            return queue.length > 0 ? queue[0].val : null;
        }
    }

    return null;
};

console.log(levelOrderSuccessor(root, 3)); // 8
