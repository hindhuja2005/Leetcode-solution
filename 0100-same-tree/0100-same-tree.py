# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def isSameTree(self, p: Optional[TreeNode], q: Optional[TreeNode]) -> bool:
        def inorder(root,c):
            if root==None:
                c.append(None)
            else:
                inorder(root.left,c)
                inorder(root.right,c)
                c.append(root.val)
            return c
        c1=[]
        inorder(p,c1)
        c2=[]
        inorder(q,c2)
        return c1==c2