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
    public TreeNode recoverFromPreorder(String traversal) {
        int count=0;
        int i = 0, n = traversal.length();
        while (i < n) {
            int depth = 0;
            while (i < n && traversal.charAt(i) == '-') {
                depth++;
                i++;
            }
            int val = 0;
            while (i < n && Character.isDigit(traversal.charAt(i))) {
                val = val * 10 + (traversal.charAt(i) - '0');
                i++;
            }
            
            TreeNode node = new TreeNode(val);

            if(depth==0){
                root=node;
            }
            else{
                dfs(root,node,depth);
            }
        }
        return root;
    }
    public void dfs(TreeNode root,TreeNode root1,int count){
        if(count==1){
            if(root.left==null){
                root.left=root1;
            }
            else{
                root.right=root1;
            }
        }
        else{
            if(root.right==null){
                while(count-1>0){
                    root=root.left;
                    count--;
                }
                if(root.left==null){
                    root.left=root1;
                }
                else{
                    root.right=root1;
                }
            }
            else{
                root=root.right;
                count--;
                while(count-1>0){
                    root=root.left;;
                    count--;
                }
                if(root.left==null){
                    root.left=root1;
                }
                else{
                    root.right=root1;
                }
            }
        }
    }
}