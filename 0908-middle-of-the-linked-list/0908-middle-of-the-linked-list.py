import math
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def middleNode(self, head: Optional[ListNode]) -> Optional[ListNode]:
        current=head
        c=0
        while current!=None:
            c=c+1
            current=current.next
        a=math.floor(c/2)
        for i in range(a):
            head=head.next
        return head