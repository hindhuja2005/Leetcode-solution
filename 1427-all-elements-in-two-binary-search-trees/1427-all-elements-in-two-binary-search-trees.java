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
    List<Integer> l=new ArrayList<>();
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        order(root1);
        order(root2);
        Collections.sort(l);
        return l;
    }
    public void order(TreeNode root){
        if(root==null){
            return;
        }
        order(root.left);
        order(root.right);
        l.add(root.val);
        return;
    }
}