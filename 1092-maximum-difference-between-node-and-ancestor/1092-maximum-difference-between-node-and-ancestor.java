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
/*class Solution {
    int maxdiff=-1;
    public int maxAncestorDiff(TreeNode root) {
        if(root!=null){
            func(root.val,root);
            maxAncestorDiff(root.left);
            maxAncestorDiff(root.right);
        }
        return maxdiff;
    }
    public void func(int n,TreeNode root){
        if(root==null){
            return;
        }
        if(root.left!=null){
            int diff=Math.abs(n-root.left.val);
            maxdiff=Math.max(maxdiff,diff);
        }
        if(root.right!=null){
            int diff=Math.abs(n-root.right.val);
            maxdiff=Math.max(maxdiff,diff);
        }
        func(n,root.left);
        func(n,root.right);
    }
}*/
class Solution {
    int maxdiff = 0;

    public int maxAncestorDiff(TreeNode root) {
        if (root == null) return 0;
        dfs(root, root.val, root.val);
        return maxdiff;
    }

    private void dfs(TreeNode node, int minVal, int maxVal) {
        if (node == null) return;

        // update max difference
        maxdiff = Math.max(maxdiff, Math.max(Math.abs(node.val - minVal), Math.abs(node.val - maxVal)));

        // update path min/max
        minVal = Math.min(minVal, node.val);
        maxVal = Math.max(maxVal, node.val);

        dfs(node.left, minVal, maxVal);
        dfs(node.right, minVal, maxVal);
    }
}
