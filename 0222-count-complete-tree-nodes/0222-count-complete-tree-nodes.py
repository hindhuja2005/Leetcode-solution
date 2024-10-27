# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def countNodes(self, root: Optional[TreeNode]) -> int:
        if root==None:
            return 0
        c=[]
        def order(root,c):
            if root:
                order(root.left,c)
                c.append(root.val)
                order(root.right,c)
        order(root,c)
        return len(c)