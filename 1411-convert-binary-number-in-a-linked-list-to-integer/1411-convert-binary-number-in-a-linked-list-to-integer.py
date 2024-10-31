# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def getDecimalValue(self, head: ListNode) -> int:
        if head is None:
            return
        a=head
        ans=""
        while a is not None:
            ans=ans+str(a.val)
            a=a.next
        return int(ans,2)