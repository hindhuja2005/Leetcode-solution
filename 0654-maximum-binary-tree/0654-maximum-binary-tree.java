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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return insert(nums,0,nums.length-1);
    }
    public TreeNode insert(int nums[],int s,int e){
        if(s>e){
            return null;
        }
        int j=s;
        int max=Integer.MIN_VALUE;
        for(int i=s;i<=e;i++){
            if(max<nums[i]){
                max=nums[i];
                j=i;
            }
        }
        TreeNode node=new TreeNode(max);
        node.left=insert(nums,s,j-1);
        node.right=insert(nums,j+1,e);
        return node;
    }
}