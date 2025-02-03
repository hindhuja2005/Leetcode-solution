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
    //static boolean flag;
    public boolean preorder(TreeNode p1, TreeNode q1){
        if(p1==null && q1==null){
            return true;
        }
        else if((p1==null && q1!=null) || (p1!=null && q1==null))
        return false;
        if(p1.val==q1.val){
            return preorder(p1.left ,q1.left) && preorder(p1.right,q1.right);
            
        }
        else{
            return false;
        }
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return preorder(p,q);
    }
}