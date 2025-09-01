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
    int num=0;
    public int goodNodes(TreeNode root) {
        int maxval=root.val;
        func(maxval,root);
        return num;
    }
    public void func(int maxval, TreeNode root){
        if(root==null){
            return;
        }
        if(root.val>=maxval){
            maxval=root.val;
            num++;
        }
        func(maxval,root.left);
        func(maxval,root.right);
    }
}