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
    TreeNode res=null;
    int d=-1;
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        postorder(root,0);
        return res;
    }
    public int postorder(TreeNode node,int depth){
        if(node==null){
            d=Math.max(d,depth);
            return depth;
        }
        int h1=postorder(node.left,depth+1);
        int h2=postorder(node.right,depth+1);
        
        if(h1==h2 && h1==d){
            res=node;
        }
        return Math.max(h1,h2);
    }
}