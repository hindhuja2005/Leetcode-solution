import math
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def deleteMiddle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        current=head
        c=0
        while current!=None:
            c=c+1
            current=current.next
        a=c//2
        current=head
        if a==0:
            return None
        for i in range(a-1):
            current=current.next
        current.next=current.next.next
        return head