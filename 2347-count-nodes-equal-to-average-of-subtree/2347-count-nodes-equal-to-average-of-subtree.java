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
    int count=0;
    public int averageOfSubtree(TreeNode root) {
        if(root!=null){
            int[] ans = avg(root);   
        }
        return count;
    }
    public int[] avg(TreeNode temp){
        if (temp == null) {
            return new int[]{0, 0};
        }

        int[] left = avg(temp.left);
        int[] right = avg(temp.right);

        int sum = left[0] + right[0] + temp.val;
        int n = left[1] + right[1] + 1;

        if (temp.val == sum / n) {
            count++;
        }

        return new int[]{sum, n};
    }
}