/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    TreeNode ans;
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        inorder(cloned,target);
        return ans;
    }
    public void inorder(TreeNode c,TreeNode t){
        if(c!=null){
            inorder(c.left,t);
            if(c.val==t.val){
                ans=c;
            }
            inorder(c.right,t);
        }
    }
}