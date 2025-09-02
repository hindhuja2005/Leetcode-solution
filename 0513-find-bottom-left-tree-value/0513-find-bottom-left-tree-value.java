/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int maxDepth = -1;
    int value = -1;

    public int findBottomLeftValue(TreeNode root) {
        dfs(root, 0);
        return value;
    }

    private void dfs(TreeNode node, int depth) {
        if (node == null) return;

        // First time we reach this depth → record value
        if (depth > maxDepth) {
            maxDepth = depth;
            value = node.val;
        }

        // Go left first, then right
        dfs(node.left, depth + 1);
        dfs(node.right, depth + 1);
    }
}