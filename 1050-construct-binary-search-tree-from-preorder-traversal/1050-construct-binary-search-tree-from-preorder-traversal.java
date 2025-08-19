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
    TreeNode root=null;
    public TreeNode bstFromPreorder(int[] preorder) {
        root=new TreeNode(preorder[0]);
        for(int i=1;i<preorder.length;i++){
            bst(root,preorder[i]);
        }
        return root;
    }
    public void bst(TreeNode curr,int i){
        if(i<curr.val){
            if(curr.left==null){
                curr.left=new TreeNode(i);
                return;
            }
            else{
                bst(curr.left,i);
            }
        }
        else{
            if(curr.right==null){
                curr.right=new TreeNode(i);
                return;
            }
            else{
                bst(curr.right,i);
            }
        }
    }
}