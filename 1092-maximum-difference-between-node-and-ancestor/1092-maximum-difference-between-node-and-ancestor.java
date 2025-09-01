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
    int maxdiff=-1;
    public int maxAncestorDiff(TreeNode root) {
        /*if(root.left!=null){
            int diff=Math.abs(root.val-root.left.val);
            maxdiff=Math.max(maxdiff,diff);
            if(root.left.left!=null){
                diff=Math.abs(root.val-root.left.left.val);
                maxdiff=Math.max(maxdiff,diff);
            }
            if(root.left.right!=null){
                diff=Math.abs(root.val-root.left.right.val);
                maxdiff=Math.max(maxdiff,diff);
            }
            maxAncestorDiff(root.left);
        }
        if(root.right!=null){
            int diff=Math.abs(root.val-root.right.val);
            maxdiff=Math.max(maxdiff,diff);
            if(root.right.left!=null){
                diff=Math.abs(root.val-root.right.left.val);
                maxdiff=Math.max(maxdiff,diff);
            }
            if(root.right.right!=null){
                diff=Math.abs(root.val-root.right.right.val);
                maxdiff=Math.max(maxdiff,diff);
            }
            maxAncestorDiff(root.right);
        }
        return maxdiff;*/
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
}