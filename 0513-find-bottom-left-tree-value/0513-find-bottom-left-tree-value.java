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
    int h=0;
    int value=-1;
    int maxh=Integer.MIN_VALUE;
    public int findBottomLeftValue(TreeNode root) {
        inorder(root,h);
        return value;
    }
    public void inorder(TreeNode root,int h){
        if(root==null){
            return;
        }
        h++;
        inorder(root.left,h);
        if(h>maxh){
            maxh=h;
            value=root.val;
        }
        inorder(root.right,h);
    }
}