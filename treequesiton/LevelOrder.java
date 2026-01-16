import java.util.*;

public class LevelOrder {

    // Definition for a binary tree node
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    // Function to calculate average of each level
    public static List<Double> averageOfLevels(TreeNode root) {

        List<Double> ans = new ArrayList<>();

        // Edge case
        if (root == null) return ans;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        // BFS traversal
        while (!queue.isEmpty()) {

            int levelSize = queue.size(); // number of nodes at this level
            double sum = 0;

            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();
                sum += node.val;

                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }

            // Average of current level
            ans.add(sum / levelSize);
        }

        return ans;
    }

    // Optional: main method for testing
    public static void main(String[] args) {

        /*
            Tree:
                 3
                / \
               9  20
                  / \
                 15  7
        */

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        System.out.println(averageOfLevels(root));
    }
}
