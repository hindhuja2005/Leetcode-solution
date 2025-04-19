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
    public boolean target1(int sum,TreeNode root,int target){
        if(root==null)
        return false;
        sum=sum+root.val;
        if(sum==target && root.left==null && root.right==null)
        return true;
        else
        return target1(sum,root.left,target)||target1(sum,root.right,target);
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        int sum=0;
        return (target1(sum,root,targetSum))?true:false;
    }
}