# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def preorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        a=[]
        def preorder(node,a):
            if node:
                a.append(node.val)
                preorder(node.left,a)
                preorder(node.right,a)
        preorder(root,a)
        return a