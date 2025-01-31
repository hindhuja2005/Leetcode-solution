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
    public List<Integer> inorderTraversal(TreeNode root) {
        List <Integer> a=new ArrayList<Integer>();
        sear(root,a);
        return a;
    }
    static void sear(TreeNode node,List<Integer> a){
        if(node==null){
            return;
        }
        sear(node.left,a);
        a.add(node.val);
        sear(node.right,a);
    }
}