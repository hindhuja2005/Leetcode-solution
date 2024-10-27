# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def postorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        a=[]
        def postorder(node,a):
            if node:
                postorder(node.left,a)
                postorder(node.right,a)
                a.append(node.val)
        postorder(root,a)
        return a