# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def inorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        a=[]
        def inorder(root):
            if root:
                inorder(root.left)
                a.append(root.val)
                inorder(root.right)
        inorder(root)
        return a