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
    public TreeNode removeLeafNodes(TreeNode root, int target){
        postorder(root,target);
        if(root.left==null && root.right==null && root.val==target){
            root=null;
        }
        return root;
    }
    public void postorder(TreeNode node,int target){
        if(node!=null){
            postorder(node.left,target);
            postorder(node.right,target);
        if(node.left!=null &&node.left.left==null && node.left.right==null && node.left.val==target){
            node.left=null;
        }
        if(node.right!=null && node.right.left==null && node.right.right==null && node.right.val==target){
            node.right=null;
        }
        }
        return;
    }
}