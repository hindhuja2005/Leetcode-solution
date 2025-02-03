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
    public int sum=0;
    static int leaf(TreeNode node,boolean l){
        if(node==null){
            return 0;
        }
        if(node.left==null && node.right==null){
            if(l)
            return node.val;
            else
            return 0;
        }
        
            return leaf(node.left,true)+leaf(node.right,false);
        
    }
    public int sumOfLeftLeaves(TreeNode root) {
        return leaf(root,false);
    }
}