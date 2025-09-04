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
    TreeNode node=null;
    TreeNode temp=null;
    public TreeNode increasingBST(TreeNode root) {
        inorder(root);
        return node;
    }
    public void inorder(TreeNode root){
        if(root==null){
            return;
        }
        inorder(root.left);
        root.left=null;
        if(node==null){
            node=root;
            temp=root;
        }
        else{
            temp.right=root;
            temp=root;
        }
        inorder(root.right);
    }
}